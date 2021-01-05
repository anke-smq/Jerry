package com.example.domain;

public class UserAndRole {
    private Integer uId;
    private String uname;
    private Integer rId;

    public UserAndRole() {
    }

    public UserAndRole(Integer uId, String uname, Integer rId) {
        this.uId = uId;
        this.uname = uname;
        this.rId = rId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    @Override
    public String toString() {
        return "UserAndRole{" +
                "uId=" + uId +
                ", uname='" + uname + '\'' +
                ", rId=" + rId +
                '}';
    }
}
