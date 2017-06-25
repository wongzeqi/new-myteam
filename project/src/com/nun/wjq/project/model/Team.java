package com.nun.wjq.project.model;

public class Team {
    private Integer tmid;

    private String tmname;

    public Integer getTmid() {
        return tmid;
    }

    public void setTmid(Integer tmid) {
        this.tmid = tmid;
    }

    public String getTmname() {
        return tmname;
    }

    public void setTmname(String tmname) {
        this.tmname = tmname == null ? null : tmname.trim();
    }
}