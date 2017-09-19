package com.basket.web.session;

import net.spy.memcached.MemcachedClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * {@link SessionHandler}接口的实现，使用SpyMemcached客户端。
 * @author XnOU
 */
public class MemcachedSessionHandler implements SessionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(MemcachedSessionHandler.class);

    private MemcachedClient memcachedClient;

    private String cookieName = "basket-sessionid"; // 默认存储sessionId的Cookie名
    private String cookieDomain;
    private String cookiePath = "/";
    private int cookieMaxAge = 7200; // 2 hours

    public MemcachedSessionHandler() {
    }

    public MemcachedSessionHandler(MemcachedClient memcachedClient) {
        this.memcachedClient = memcachedClient;
    }

    public void setMemcachedClient(MemcachedClient memcachedClient) {
        this.memcachedClient = memcachedClient;
    }

    public String getCookieName() {
        return cookieName;
    }

    public void setCookieName(String cookieName) {
        this.cookieName = cookieName;
    }

    public String getCookieDomain() {
        return cookieDomain;
    }

    public void setCookieDomain(String cookieDomain) {
        this.cookieDomain = cookieDomain;
    }

    public String getCookiePath() {
        return cookiePath;
    }

    public void setCookiePath(String cookiePath) {
        this.cookiePath = cookiePath;
    }

    public int getCookieMaxAge() {
        return cookieMaxAge;
    }

    public void setCookieMaxAge(int cookieMaxAge) {
        this.cookieMaxAge = cookieMaxAge;
    }

    @Override
    public String getSessionId(HttpServletRequest request, HttpServletResponse response, boolean create)
            throws SessionException {

        String sessionId = null;

        // 从Cookie中查找sessionId
        if (!create) {
            Cookie[] cookies = request.getCookies();
            if (null != cookies) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals(cookieName)) {
                        sessionId = cookie.getValue();
                        break;
                    }
                }
            }
        }

        // 新建Session
        if (null == sessionId) {
            sessionId = generateSessionId();
            Cookie cookie = new Cookie(cookieName, sessionId);
            cookie.setPath(cookiePath);
            cookie.setMaxAge(cookieMaxAge);

            if (null != cookieDomain) {
                cookie.setDomain(cookieDomain);
            }

            response.addCookie(cookie);
        }

        return sessionId;
    }

    @Override
    public boolean exists(String sessionId) throws SessionException {
        try {
            String key = sessionKey(sessionId);
            Object obj = memcachedClient.get(key);
            return (null != obj) ? true : false;
        } catch (Exception e) {
            LOG.error("An error occurs when checking sessionId={} exists. Cause:", sessionId, e);
            throw new SessionException(e);
        }
    }

    @Override
    public void initialize(String sessionId) throws SessionException {
        try {
            String key = sessionKey(sessionId);
            memcachedClient.set(key, 0, Boolean.TRUE);
        } catch (Exception e) {
            LOG.error("initialize sessionId={} error. Cause:", sessionId, e);
            throw new SessionException(e);
        }
    }

    @Override
    public Object loadAttribute(String sessionId, String name) throws SessionException {
        try {
            String key = attributeKey(sessionId, name);
            return memcachedClient.get(key);
        } catch (Exception e) {
            LOG.error("loadAttribute sessionId={} error. Cause:", sessionId, e);
            throw new SessionException(e);
        }
    }

    @Override
    public void saveAttribute(String sessionId, String name, Object value) throws SessionException {
        try {
            String key = attributeKey(sessionId, name);
            memcachedClient.set(key, 0, value);
        } catch (Exception e) {
            LOG.error("saveAttribute sessionId={} error. Cause:", sessionId, e);
            throw new SessionException(e);
        }
    }

    @Override
    public void removeAttribute(String sessionId, String name) throws SessionException {
        try {
            String key = attributeKey(sessionId, name);
            memcachedClient.delete(key);
        } catch (Exception e) {
            LOG.error("removeAttribute sessionId={} error. Cause:", sessionId, e);
            throw new SessionException(e);
        }
    }

    @Override
    public void invalidate(String sessionId, HttpServletRequest request, HttpServletResponse response)
            throws SessionException {

        try {
            Cookie cookie = new Cookie(cookieName, null);
            cookie.setDomain(cookieDomain);
            cookie.setPath(cookiePath);
            cookie.setMaxAge(0);

            // 清除客户端Cookie
            response.addCookie(cookie);

            // 清理Memcached中的内容
            String key = sessionKey(sessionId);
            memcachedClient.delete(key);

        } catch (Exception e) {
            LOG.error("An error occurs while invalidate sessionId={}", sessionId, e);
            throw new SessionException(e);
        }

    }

    /**
     * 新建sessionId
     */
    private String generateSessionId() {
        String sessionId = null;
        do {
            sessionId = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        } while (exists(sessionId));

        return sessionId;
    }

    /**
     * 构建sessionId存储的KEY
     */
    private String sessionKey(String sessionId) {
        return "session;" + sessionId;
    }

    /**
     * 构建Session属性存储的KEY
     */
    public String attributeKey(String sessionId, String name) {
        return "session;" + sessionId + "?attr=" + name;
    }
}