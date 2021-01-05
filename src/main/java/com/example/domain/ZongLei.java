package com.example.domain;

public class ZongLei {
    private Integer alId;
    private String alName;
    private Integer alLeft;
    private Integer alRight;

    public ZongLei() {
    }

    public ZongLei(Integer alId, String alName, Integer alLeft, Integer alRight) {
        this.alId = alId;
        this.alName = alName;
        this.alLeft = alLeft;
        this.alRight = alRight;
    }

    public Integer getAlId() {
        return alId;
    }

    public void setAlId(Integer alId) {
        this.alId = alId;
    }

    public String getAlName() {
        return alName;
    }

    public void setAlName(String alName) {
        this.alName = alName;
    }

    public Integer getAlLeft() {
        return alLeft;
    }

    public void setAlLeft(Integer alLeft) {
        this.alLeft = alLeft;
    }

    public Integer getAlRight() {
        return alRight;
    }

    public void setAlRight(Integer alRight) {
        this.alRight = alRight;
    }

    @Override
    public String
    toString() {
        return "ZongLei{" +
                "alId=" + alId +
                ", alName='" + alName + '\'' +
                ", alLeft=" + alLeft +
                ", alRight=" + alRight +
                '}';
    }
}
