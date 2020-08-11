package com.lhk.juc.future2;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/11 15:11
 */
public class Userinfo {
    private String username;
    private String password;
    public Userinfo(){
        super();
    }

    public Userinfo(String username, String password) {
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
