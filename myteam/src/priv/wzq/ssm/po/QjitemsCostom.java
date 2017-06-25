package priv.wzq.ssm.po;

import java.util.Date;

public class QjitemsCostom {
	private Integer id;

    private String qjtype;

    private String qjweek;

    private Integer mId;

    private String reason;

    private Date qjtime;
    
    public String getSchoolnumber() {
		return schoolnumber;
	}

	public void setSchoolnumber(String schoolnumber) {
		this.schoolnumber = schoolnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String schoolnumber;
    
    private String name;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQjtype() {
        return qjtype;
    }

    public void setQjtype(String qjtype) {
        this.qjtype = qjtype == null ? null : qjtype.trim();
    }

    public String getQjweek() {
        return qjweek;
    }

    public void setQjweek(String qjweek) {
        this.qjweek = qjweek == null ? null : qjweek.trim();
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getQjtime() {
        return qjtime;
    }

    public void setQjtime(Date qjtime) {
        this.qjtime = qjtime;
    }
    
    
}
