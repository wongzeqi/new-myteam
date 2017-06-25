package com.nun.wjq.project.model;

public class Academy {
    private Integer aid;

    private String academyname;

    private String academycode;

    private Integer recommendnumber;

    private String time;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAcademyname() {
        return academyname;
    }

    public void setAcademyname(String academyname) {
        this.academyname = academyname == null ? null : academyname.trim();
    }

    public String getAcademycode() {
        return academycode;
    }

    public void setAcademycode(String academycode) {
        this.academycode = academycode == null ? null : academycode.trim();
    }

    public Integer getRecommendnumber() {
        return recommendnumber;
    }

    public void setRecommendnumber(Integer recommendnumber) {
        this.recommendnumber = recommendnumber;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }
}