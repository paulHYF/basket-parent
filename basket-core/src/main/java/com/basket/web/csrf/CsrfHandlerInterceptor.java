package com.basket.web.csrf;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.resource.DefaultServletHttpRequestHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * A Spring MVC {@code HandlerInterceptor} which is responsible to enforce CSRF token validity on incoming POST requests.
 * @author HuangYF
 */
public class CsrfHandlerInterceptor extends HandlerInterceptorAdapter {

    private CsrfTokenManager csrfTokenManager;

    /**
     * @param csrfTokenManager CSRF token manager.
     * @see com.basket.web.csrf.DefaultCsrfTokenManager
     * @see com.basket.web.csrf.DisabledCsrfTokenManager
     */
    public void setCsrfTokenManager(CsrfTokenManager csrfTokenManager) {
        this.csrfTokenManager = csrfTokenManager;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        if (handler instanceof DefaultServletHttpRequestHandler) {
            return true;
        }

        if (request.getMethod().equalsIgnoreCase("GET")) {
            // GET - allow the request
            return true;
        } else {
            // This is a POST request - need to verify the CSRF token
            String csrfTokenValue = csrfTokenManager.getTokenFromRequest(request, response);
            boolean isValidToken = csrfTokenManager.isValidCsrfToken(request, response, csrfTokenValue);

            if (isValidToken) {
                return true;
            } else {
                response.sendError(HttpServletResponse.SC_FORBIDDEN, "Bad or missing CSRF token.");
                return false;
            }
        }

    }

}
