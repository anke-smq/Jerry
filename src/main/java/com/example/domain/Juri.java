package com.example.domain;

public class Juri {
    private Integer jId;
    private String JName;

    public Juri() {
    }

    public Juri(Integer jId, String JName) {
        this.jId = jId;
        this.JName = JName;
    }

    public int getjId() {
        return jId;
    }

    public void setjId(Integer jId) {
        this.jId = jId;
    }

    public String getJName() {
        return JName;
    }

    public void setJName(String JName) {
        this.JName = JName;
    }

    @Override
    public String toString() {
        return "Juri{" +
                "jId=" + jId +
                ", JName='" + JName + '\'' +
                '}';
    }
}
