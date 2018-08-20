package com.leihou.entity;

import java.sql.Date;

/**
 * 用户实体类
 */
public class User {
    private String id;
    private String username;
    private String loginid;
    private String password;
    private String mobile;
    private String email;
    private String avatal;
    private Date crate_time;
    private Date last_update_time;
    private Date last_login_time;
    private int security_level;
    private int type;


    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getLoginid() {
        return loginid;
    }

    public String getPassword() {
        return password;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getAvatal() {
        return avatal;
    }

    public Date getCrate_time() {
        return crate_time;
    }

    public Date getLast_update_time() {
        return last_update_time;
    }

    public Date getLast_login_time() {
        return last_login_time;
    }

    public int getSecurity_level() {
        return security_level;
    }

    public int getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAvatal(String avatal) {
        this.avatal = avatal;
    }

    public void setCrate_time(Date crate_time) {
        this.crate_time = crate_time;
    }

    public void setLast_update_time(Date last_update_time) {
        this.last_update_time = last_update_time;
    }

    public void setLast_login_time(Date last_login_time) {
        this.last_login_time = last_login_time;
    }

    public void setSecurity_level(int security_level) {
        this.security_level = security_level;
    }

    public void setType(int type) {
        this.type = type;
    }
}
