package com.nun.wjq.project.model;

public class Parentmeun {
    private Integer pid;

    private Integer role;

    private String pmeunname;

    private Integer pmorder;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getPmeunname() {
        return pmeunname;
    }

    public void setPmeunname(String pmeunname) {
        this.pmeunname = pmeunname == null ? null : pmeunname.trim();
    }

    public Integer getPmorder() {
        return pmorder;
    }

    public void setPmorder(Integer pmorder) {
        this.pmorder = pmorder;
    }
}