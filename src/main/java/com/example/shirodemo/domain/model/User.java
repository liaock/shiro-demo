package com.example.shirodemo.domain.model;

import java.util.Date;

public class User {

    private Integer id;

    private String username;

    private String password;

    private Date createTime;

    private String status;

    public User(Integer id, String username, String password, Date createTime, String status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.createTime = createTime;
        this.status = status;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}