package com.basket.web.model;

/**
 * 当前会话的用户信息。
 * @author HuangYF
 */
public final class CurrentUser implements java.io.Serializable {

    private static final long serialVersionUID = -4506811203319690817L;

    private String cookieId; // CookieId，防止账号重复登录

    private String userId; // 用户ID
    private String nickname; // 用户昵称
    private String avatar; // 用户头像

    private boolean administrator; // 是否为老师

    /**
     * @param cookieId 用户登录时设置的CookieID
     * @param userId 用户ID
     */
    public CurrentUser(String cookieId, String userId) {
        this.cookieId = cookieId;
        this.userId = userId;
    }

    /**
     * @param cookieId 用户登录时设置的CookieID
     * @param userId 用户ID
     * @param nickname 用户昵称
     */
    public CurrentUser(String cookieId, String schoolId, String userId, String nickname) {
        this.cookieId = cookieId;
        this.userId = userId;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "{cookieId=" + cookieId + ", userId=" + userId + ", nickname=" + nickname
                + ", avatar=" + avatar + ", isAdministrator=" + administrator + "}";
    }

    public String getCookieId() {
        return cookieId;
    }

    public void setCookieId(String cookieId) {
        this.cookieId = cookieId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean isAdministrator() {
        return administrator;
    }

    public void setAdministrator(boolean isAdministrator) {
        this.administrator = isAdministrator;
    }

}
