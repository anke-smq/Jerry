package com.example.domain;

import org.w3c.dom.Text;

import java.sql.Timestamp;

public class Reply {
    private Integer rId;
    private Text text;
    private Timestamp rTime;
    private Title title;
    private User user;

    public Reply() {
    }

    public Reply(Integer rId, Text text, Timestamp rTime, Title title, User user) {
        this.rId = rId;
        this.text = text;
        this.rTime = rTime;
        this.title = title;
        this.user = user;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Timestamp getrTime() {
        return rTime;
    }

    public void setrTime(Timestamp rTime) {
        this.rTime = rTime;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "rId=" + rId +
                ", text=" + text +
                ", rTime=" + rTime +
                ", title=" + title +
                ", user=" + user +
                '}';
    }
}
