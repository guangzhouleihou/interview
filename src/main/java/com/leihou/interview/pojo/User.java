package com.leihou.interview.pojo;

import java.util.Date;

public class User {
    private String id;
    private String username;
    private String loginid;
    private String password;
    private String mobile;
    private String email;
    private String avatar;
    private Date createTime;
    private Date lastUpdateTime;
    private Date lastLoginTime;
    private double securityLevel;
    private double type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public double getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(double securityLevel) {
        this.securityLevel = securityLevel;
    }

    public double getType() {
        return type;
    }

    public void setType(double type) {
        this.type = type;
    }
}
