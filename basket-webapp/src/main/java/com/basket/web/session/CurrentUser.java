package com.basket.web.session;

import org.apache.commons.lang3.StringUtils;

/**
 * 当前用户信息
 * 
 * @author alexydz
 */
public class CurrentUser implements java.io.Serializable {

    private static final long serialVersionUID = 8215239684156687068L;

    private String userId; // 用户ID
    private String email; // 用户Email
    private String name; // 用户名称或昵称
    private String userRole; // 用户角色
    private int deptId; // 用户所属部门

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    /**
     * Non argument constructor.
     */
    public CurrentUser() {
    }

    /**
     * @param userId 用户ID
     * @param email 用户Email
     * @param name 用户名称或昵称
     * @param userRole 用户角色
     * @param deptId
     */
    public CurrentUser(String userId, String email, String name, String userRole, int deptId) {
        if (StringUtils.isBlank(userId)) {
            throw new IllegalArgumentException("userId can not be null");
        }
        this.userId = userId;
        this.email = email;
        this.name = name;
        this.userRole = userRole;
        this.deptId = deptId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "CurrentUser {userId=" + userId + ", email=" + email + ", name=" + name + ", userRole=" + userRole  +", deptId=" + deptId + "}";
    }

}
