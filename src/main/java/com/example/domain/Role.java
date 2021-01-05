package com.example.domain;

public class Role {
    private Integer rId;
    private String rName;
    private Juri juri;

    public Role() {
    }

    public Role(Integer rId, String rName, Juri juri) {
        this.rId = rId;
        this.rName = rName;
        this.juri = juri;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public Juri getJuri() {
        return juri;
    }

    public void setJuri(Juri juri) {
        this.juri = juri;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rId=" + rId +
                ", rName='" + rName + '\'' +
                ", juri=" + juri +
                '}';
    }
}
