package com.basket.web.session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 定义Session管理的接口。
 * @author XnOU
 */
public interface SessionManager {

    /**
     * Request级别的Session属性名称，可用来覆盖Session里的内容。
     */
    public static final String REQUEST_SESSION_ATTRIBUTE_NAME = "_GLOBAL_SID";

    /**
     * 获取当前HTTP请求的会话。
     * @param request HTTP请求
     * @param response HTTP响应
     * @return 当前HTTP请求的会话，不会为null
     */
    Session getSession(HttpServletRequest request, HttpServletResponse response);
}
