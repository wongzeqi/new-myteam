package com.nun.wjq.project.model;

public class Sonmeun {
    private Integer sid;

    private Integer pid;

    private String smeunname;

    private String meunurl;

    private Integer sorder;

    private Integer role;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getSmeunname() {
        return smeunname;
    }

    public void setSmeunname(String smeunname) {
        this.smeunname = smeunname == null ? null : smeunname.trim();
    }

    public String getMeunurl() {
        return meunurl;
    }

    public void setMeunurl(String meunurl) {
        this.meunurl = meunurl == null ? null : meunurl.trim();
    }

    public Integer getSorder() {
        return sorder;
    }

    public void setSorder(Integer sorder) {
        this.sorder = sorder;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}