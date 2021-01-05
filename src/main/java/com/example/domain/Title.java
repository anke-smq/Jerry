package com.example.domain;

import org.w3c.dom.Text;

import java.sql.Timestamp;

public class Title {
    private Integer tId;
    private String BiaoTi;
    private Text text;
    private Integer count;
    private User user;
    private Timestamp lastTime;
    private User lastUser;
    private ZongLei al;

    public Title() {
    }

    public Title(Integer tId, String biaoTi, Text text, Integer count, User user, Timestamp lastTime, User lastUser, ZongLei al) {
        this.tId = tId;
        BiaoTi = biaoTi;
        this.text = text;
        this.count = count;
        this.user = user;
        this.lastTime = lastTime;
        this.lastUser = lastUser;
        this.al = al;
    }

    public int gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String getBiaoTi() {
        return BiaoTi;
    }

    public void setBiaoTi(String biaoTi) {
        BiaoTi = biaoTi;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public int getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Timestamp getLastTime() {
        return lastTime;
    }

    public void setLastTime(Timestamp lastTime) {
        this.lastTime = lastTime;
    }

    public User getLastUser() {
        return lastUser;
    }

    public void setLastUser(User lastUser) {
        this.lastUser = lastUser;
    }

    public ZongLei getAl() {
        return al;
    }

    public void setAl(ZongLei al) {
        this.al = al;
    }
}
