package com.basket.web.session;

/**
 * 当Session处理发生错误时抛出此异常。
 * @author XnOU
 */
public class SessionException extends RuntimeException {

    private static final long serialVersionUID = 8045010707855433271L;

    public SessionException(String message) {
        super(message);
    }

    public SessionException(Throwable cause) {
        super(cause);
    }

    public SessionException(String message, Throwable cause) {
        super(message, cause);
    }
}
