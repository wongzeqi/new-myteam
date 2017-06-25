package priv.wzq.ssm.po;

public class Openid {
    private Integer id;

    private String openId;

    private Integer role;

    private String schoolnumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getSchoolnumber() {
        return schoolnumber;
    }

    public void setSchoolnumber(String schoolnumber) {
        this.schoolnumber = schoolnumber == null ? null : schoolnumber.trim();
    }
}