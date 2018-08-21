package com.leihou.interview.pojo;

import java.util.Date;

/**
 * �������
 * 
 * @author wcyong
 * 
 * @date 2018-08-21
 */
public class AuthToken {
    private String id;

    private String user_id;

    private String token;

    private Date create_time;

    private Date valid_time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id == null ? null : user_id.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getValid_time() {
        return valid_time;
    }

    public void setValid_time(Date valid_time) {
        this.valid_time = valid_time;
    }
}