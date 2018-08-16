package com.leihou.interview;

import javax.persistence.*;

@Entity
@Table(name = "hm_user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;

    private String username;

    private String password;

    public User(){}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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
}
