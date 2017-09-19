package com.basket.web.session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * {@link SessionManager}的实现。
 * @author XnOU
 */
public class MemcachedSessionManager implements SessionManager {

    // 会话处理器
    private SessionHandler sessionHandler;

    /**
     * No-argument constructor.
     */
    public MemcachedSessionManager() {
    }

    /**
     * @param sessionHandler 会话处理器
     */
    public MemcachedSessionManager(SessionHandler sessionHandler) {
        this.sessionHandler = sessionHandler;
    }

    /**
     * 设置会话处理器。
     * @param sessionHandler 会话处理器
     */
    public void setSessionHandler(SessionHandler sessionHandler) {
        this.sessionHandler = sessionHandler;
    }

    @Override
    public Session getSession(HttpServletRequest request, HttpServletResponse response) {
        Session session = (Session) request.getAttribute(REQUEST_SESSION_ATTRIBUTE_NAME);
        if (null == session) {
            String sessionId = sessionHandler.getSessionId(request, response, false);
            session = new Session(sessionId, sessionHandler, request, response);
            sessionHandler.initialize(sessionId);
            request.setAttribute(REQUEST_SESSION_ATTRIBUTE_NAME, session);
        }

        return session;
    }
}
