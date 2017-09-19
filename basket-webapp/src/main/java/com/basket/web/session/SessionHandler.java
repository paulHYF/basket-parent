package com.basket.web.session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 定义Session相关内容处理的接口。
 * @author XnOU
 */
public interface SessionHandler {

    /**
     * 从当前会话中读取会话ID.
     * 如果create的值为false，则先查询Cookie中是否有sessionId，有就直接返回，没有新建一个；
     * 如果create的值为true，则直接新建一个sessionId.
     * 
     * @param create 是否需要新建一个sessionId
     * @throws SessionException 如果发生异常
     */
    String getSessionId(HttpServletRequest request, HttpServletResponse response, boolean create)
            throws SessionException;

    /**
     * 判断Session会话是否已存在。
     * @param sessionId 会话ID
     * @return 如果会话已存在则返回true，否则返回false
     * @throws SessionException 如果发生异常
     */
    boolean exists(String sessionId) throws SessionException;

    /**
     * 初始化会话。
     * @param sessionId 会话ID
     * @throws SessionException 如果发生异常
     */
    void initialize(String sessionId) throws SessionException;

    /**
     * 加载会话属性值。
     * @param sessionId 会话ID
     * @param name 属性名称
     * @return 属性值，如果没有则返回null
     * @throws SessionException 如果发生异常
     */
    Object loadAttribute(String sessionId, String name) throws SessionException;

    /**
     * 保存会话属性值。
     * @param sessionId 会话ID
     * @param name 属性名称
     * @param value 属性值
     * @throws SessionException 如果发生异常
     */
    void saveAttribute(String sessionId, String name, Object value) throws SessionException;

    /**
     * 删除会话属性值。
     * @param sessionId 会话ID
     * @param name 属性名称
     * @throws SessionException 如果发生异常
     */
    void removeAttribute(String sessionId, String name) throws SessionException;

    /**
     * 会话失效。
     * @param sessionId 会话ID
     * @throws SessionException 如果发生异常
     */
    void invalidate(String sessionId, HttpServletRequest request, HttpServletResponse response) throws SessionException;

}
