package com.nun.wjq.project.model;

public class Major {
    private Integer mid;

    private Integer aid;

    private String majorname;

    private String majorcode;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname == null ? null : majorname.trim();
    }

    public String getMajorcode() {
        return majorcode;
    }

    public void setMajorcode(String majorcode) {
        this.majorcode = majorcode == null ? null : majorcode.trim();
    }
}