package com.nun.wjq.project.model;

public class ProjectWithBLOBs extends Project {
    private String pintroduction;

    private String pbackground;

    private String pcontent;

    private String pscheme;

    private String pcondition;

    private String ptarget;

    private String pprogress;

    private String schoolcondition;

    public String getPintroduction() {
        return pintroduction;
    }

    public void setPintroduction(String pintroduction) {
        this.pintroduction = pintroduction == null ? null : pintroduction.trim();
    }

    public String getPbackground() {
        return pbackground;
    }

    public void setPbackground(String pbackground) {
        this.pbackground = pbackground == null ? null : pbackground.trim();
    }

    public String getPcontent() {
        return pcontent;
    }

    public void setPcontent(String pcontent) {
        this.pcontent = pcontent == null ? null : pcontent.trim();
    }

    public String getPscheme() {
        return pscheme;
    }

    public void setPscheme(String pscheme) {
        this.pscheme = pscheme == null ? null : pscheme.trim();
    }

    public String getPcondition() {
        return pcondition;
    }

    public void setPcondition(String pcondition) {
        this.pcondition = pcondition == null ? null : pcondition.trim();
    }

    public String getPtarget() {
        return ptarget;
    }

    public void setPtarget(String ptarget) {
        this.ptarget = ptarget == null ? null : ptarget.trim();
    }

    public String getPprogress() {
        return pprogress;
    }

    public void setPprogress(String pprogress) {
        this.pprogress = pprogress == null ? null : pprogress.trim();
    }

    public String getSchoolcondition() {
        return schoolcondition;
    }

    public void setSchoolcondition(String schoolcondition) {
        this.schoolcondition = schoolcondition == null ? null : schoolcondition.trim();
    }
}