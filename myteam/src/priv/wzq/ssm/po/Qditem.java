package priv.wzq.ssm.po;

import java.util.Date;

public class Qditem {
    private Integer id;

    private String qdtype;

    private String qdweek;

    private Integer mId;

    private Double jd;

    private Double wd;

    private Date qdtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQdtype() {
        return qdtype;
    }

    public void setQdtype(String qdtype) {
        this.qdtype = qdtype == null ? null : qdtype.trim();
    }

    public String getQdweek() {
        return qdweek;
    }

    public void setQdweek(String qdweek) {
        this.qdweek = qdweek == null ? null : qdweek.trim();
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Double getJd() {
        return jd;
    }

    public void setJd(Double jd) {
        this.jd = jd;
    }

    public Double getWd() {
        return wd;
    }

    public void setWd(Double wd) {
        this.wd = wd;
    }

    public Date getQdtime() {
        return qdtime;
    }

    public void setQdtime(Date qdtime) {
        this.qdtime = qdtime;
    }
}