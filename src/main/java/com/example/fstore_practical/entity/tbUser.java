package com.example.fstore_practical.entity;

import com.example.fstore_practical.annocation.Column;
import com.example.fstore_practical.annocation.Id;
import com.example.fstore_practical.annocation.Table;

@Table(name = "tbUser")
public class tbUser {
    @Id
    @Column(name = "username",type = "VARCHAR(255)")
    private String username;

    @Column(name = "password",type = "VARCHAR(255)")
    private String password;

    public tbUser() {
    }

    public tbUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
