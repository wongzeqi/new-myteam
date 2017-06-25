package priv.wzq.ssm.po;

public class Zbitem {
    private Integer id;

    private Integer zj;

    private Integer ks;

    private String schoolnumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getZj() {
        return zj;
    }

    public void setZj(Integer zj) {
        this.zj = zj;
    }

    public Integer getKs() {
        return ks;
    }

    public void setKs(Integer ks) {
        this.ks = ks;
    }

    public String getSchoolnumber() {
        return schoolnumber;
    }

    public void setSchoolnumber(String schoolnumber) {
        this.schoolnumber = schoolnumber == null ? null : schoolnumber.trim();
    }

	@Override
	public String toString() {
		return "Zbitem [id=" + id + ", zj=" + zj + ", ks=" + ks
				+ ", schoolnumber=" + schoolnumber + "]";
	}
    
   
}