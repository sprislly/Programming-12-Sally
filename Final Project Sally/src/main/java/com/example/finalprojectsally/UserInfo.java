package com.example.finalprojectsally;

public class UserInfo {
    String username;
    String password;
    UserInfo(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
