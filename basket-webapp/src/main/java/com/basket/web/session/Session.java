package com.basket.web.session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HTTP请求的会话内容。
 * @author XnOU
 */
public class Session implements java.io.Serializable {

    private static final long serialVersionUID = -6732700458996145004L;

    private String id; // Session ID
    private SessionHandler handler;
    private HttpServletRequest request;
    private HttpServletResponse response;

    /**
     * @param id Session ID
     * @param handler Session处理器
     * @param request HTTP请求
     * @param response HTTP响应
     */
    public Session(String id, SessionHandler handler, HttpServletRequest request, HttpServletResponse response) {
        this.id = id;
        this.handler = handler;
        this.request = request;
        this.response = response;
    }

    /**
     * 获取当前会话的ID
     */
    public String getId() {
        return id;
    }

    /**
     * 读取会话属性值，如果没有则返回null
     */
    public Object getAttribute(String name) {
        return handler.loadAttribute(id, name);
    }

    /**
     * 设置会话属性。
     * @param name 属性名称
     * @param value 属性值
     */
    public void setAttribute(String name, Object value) {
        handler.saveAttribute(id, name, value);
    }

    /**
     * 删除会话属性。
     */
    public void removeAttribute(String name) {
        handler.removeAttribute(id, name);
    }

    /**
     * 会话失效。
     */
    public void invalidate() {
        request.removeAttribute(SessionManager.REQUEST_SESSION_ATTRIBUTE_NAME);
        handler.invalidate(id, request, response);
        id = handler.getSessionId(request, response, true);
    }

}
