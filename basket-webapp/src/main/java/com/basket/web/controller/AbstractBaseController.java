package com.basket.web.controller;


import com.basket.util.UserAgentDetector;
import com.basket.web.csrf.CsrfTokenManager;
import com.basket.web.model.CurrentUser;
import com.basket.web.model.WrappedResponse;
import com.basket.web.session.SessionManager;
import net.spy.memcached.MemcachedClient;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * 控制器的抽象基类。
 * @author HuangYF
 */
public abstract class AbstractBaseController {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 页面模版所在的基础文件夹。
     */
    protected static final String BASE_DIR = "front";

    /**
     * 分析显示列表时每页显示的条目数。
     */
    protected static final int PAGE_SIZE = 20;

    /**
     * 当前登录用户的SESSION NAME。
     */
    public static final String USER_SESSION_NAME = "basket_curr_user";

    @Autowired
    private CsrfTokenManager csrfTokenManager;

    @Autowired
    private MemcachedClient memcachedClient;

    @Resource(name = "sessionManager")
    protected SessionManager sessionManager;


    /**
     * 从Session中读取内容。
     */
    protected Object getFromSession(HttpServletRequest request, String name) {
        return request.getSession().getAttribute(name);
    }

    /**
     * 从Session中删除内容。
     */
    protected void deleteFromSession(HttpServletRequest request, String name) {
        request.getSession().removeAttribute(name);
    }

    /**
     * 把内容保存在Session中。
     */
    protected void setToSession(HttpServletRequest request, String name, Object value) {
        request.getSession().setAttribute(name, value);
    }

    /**
     * 把数据存放在缓存中，同时设置缓存数据的过期时间。
     * @param key 此数据对应的key
     * @param exp 过期时间，单位：秒
     * @param obj 要存放在缓存中的数据
     */
    protected void setToCache(String key, int exp, Object obj) {
        if ((null != obj) && (obj instanceof java.io.Serializable)) {
            try {
                memcachedClient.set(key, exp, obj);
            } catch (Exception e) {
                logger.warn("把数据存放在缓存中时发生异常, key={}, Cause: ", key, e);
            }
        }
    }

    /**
     * 根据key从缓存中获取数据。
     * @param key 缓存数据对应的key
     * @return 缓存数据，如果无法获取或数据已过期则返回null
     */
    protected Object getFromCache(String key) {
        try {
            Object obj = memcachedClient.get(key);
            if (null != obj) {
                return obj;
            }
        } catch (Exception e) {
            logger.warn("从缓存中获取数据时发生异常, key={}, Cause: ", key, e);
        }
        return null;
    }

    /**
     * 根据key从缓存中删除。
     * @param key 缓存数据对应的key
     */
    protected void deleteFromCache(String key) {
        try {
            memcachedClient.delete(key);
        } catch (Exception e) {
            logger.warn("从缓存中删除数据时发生异常, key={}, Cause: ", key, e);
        }
    }

    /**
     * 获取客户端的IP地址。
     */
    protected String getIPAddress(HttpServletRequest request) {
        String ipv4 = request.getHeader("X-Real-IP");
        if ((null != ipv4) && (ipv4.length() > 0)) {
            return ipv4;
        }
        return request.getRemoteAddr();
    }

    /**
     * 获取当前会话的用户信息，如果用户未登录，则返回<code>null</code>.
     */
    protected CurrentUser getCurrentUser(HttpServletRequest request) {
        return (CurrentUser) this.getFromSession(request, USER_SESSION_NAME);
    }

    /**
     * 创建ModelAndView对象。
     */
    protected ModelAndView createModelAndView(HttpServletRequest request, HttpServletResponse response) {
        return this.createModelAndView(request, response, false);
    }

    /**
     * 创建一个ModelAndView对象，对象中包含了当前登录用户的数据。
     * @param req 当前HttpServletRequest对象
     * @param res 当前HttpServletResponse对象
     * @param csrf 是否预防CSRF攻击
     */
    protected ModelAndView createModelAndView(HttpServletRequest req, HttpServletResponse res, boolean csrf) {

        ModelAndView mav = new ModelAndView();
        mav.addObject("currentUser", this.getCurrentUser(req));

        if (csrf) {
            mav.addObject("csrfHiddenHtml", this.getCsrfHiddenHtml(req, res)); // 增加预防CSRF攻击的隐藏代码
        }
        if (null == this.getCurrentUser(req)) {
            try {
                String uri = req.getRequestURI();
                String params = req.getQueryString();
                String url = uri + (StringUtils.isBlank(params) ? "" : "?" + params);
                url = URLEncoder.encode(url, "UTF-8");
                mav.addObject("redirectUrl", url);
            } catch (Exception e) {
                // ignore
            }

        }
        return mav;
    }

    /**
     * 预防CSRF攻击的隐藏字段内容。
     */
    protected String getCsrfHiddenHtml(HttpServletRequest request, HttpServletResponse response) {
        String csrfTokenName = csrfTokenManager.getTokenName();
        String csrfTokenValue = csrfTokenManager.createCsrfToken(request, response);

        String hiddenFieldFormat = "<input type='hidden' id='%s' name='%s' value='%s' />";
        return String.format(hiddenFieldFormat, csrfTokenName, csrfTokenName, csrfTokenValue);
    }

    /**
     * 判断访问终端是否为移动端。
     */
    protected boolean isMobile(HttpServletRequest request) {
        return UserAgentDetector.isMobile(request.getHeader("User-Agent"));
    }

    /**
     * 判断访问终端是否为微信浏览器。
     */
    protected boolean isWeixin(HttpServletRequest request) {
        return UserAgentDetector.isWeixin(request.getHeader("User-Agent"));
    }

    /**
     * 处理成功的HTTP响应内容。
     * @param data 响应结果
     */
    protected ResponseEntity<WrappedResponse> success(Object data) {
        MediaType mediaType = new MediaType("application", "json", StandardCharsets.UTF_8);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(mediaType);

        WrappedResponse resp = WrappedResponse.success(data);
        return new ResponseEntity<WrappedResponse>(resp, headers, HttpStatus.OK);
    }

    /**
     * 处理失败，抛出异常。
     * @param message 失败代码或提示
     * @param cause 导致失败的异常或原因
     */
    protected ResponseEntity<WrappedResponse> fail(String message, Object cause) {
        MediaType mediaType = new MediaType("application", "json", StandardCharsets.UTF_8);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(mediaType);

        WrappedResponse resp = WrappedResponse.fail(message, cause);
        return new ResponseEntity<WrappedResponse>(resp, headers, HttpStatus.OK);
    }

    /**
     * 发生错误，由用户提交的参数非法而引起。
     * @param message 错误代码或提示
     */
    protected ResponseEntity<WrappedResponse> error(String message) {
        MediaType mediaType = new MediaType("application", "json", StandardCharsets.UTF_8);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(mediaType);

        WrappedResponse resp = WrappedResponse.error(message);
        return new ResponseEntity<WrappedResponse>(resp, headers, HttpStatus.OK);
    }

    /**
     * 发生错误，由用户提交的参数非法而引起。
     * @param message 错误代码或提示
     * @param cause 错误原因
     */
    protected ResponseEntity<WrappedResponse> error(String message, Object cause) {
        MediaType mediaType = new MediaType("application", "json", StandardCharsets.UTF_8);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(mediaType);

        WrappedResponse resp = WrappedResponse.error(message, cause);
        return new ResponseEntity<WrappedResponse>(resp, headers, HttpStatus.OK);
    }

}
