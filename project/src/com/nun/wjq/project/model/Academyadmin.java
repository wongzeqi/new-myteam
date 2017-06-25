package com.nun.wjq.project.model;

public class Academyadmin {
    private Integer id;

    private String admincode;

    private String password;

    private String academyname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdmincode() {
        return admincode;
    }

    public void setAdmincode(String admincode) {
        this.admincode = admincode == null ? null : admincode.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAcademyname() {
        return academyname;
    }

    public void setAcademyname(String academyname) {
        this.academyname = academyname == null ? null : academyname.trim();
    }
}