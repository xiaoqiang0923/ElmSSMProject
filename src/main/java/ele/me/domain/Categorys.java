package ele.me.domain;

import java.util.Date;

public class Categorys {
    private Integer cgid;

    private String cgname;

    private Date addTime;

    public Integer getCgid() {
        return cgid;
    }

    public void setCgid(Integer cgid) {
        this.cgid = cgid;
    }

    public String getCgname() {
        return cgname;
    }

    public void setCgname(String cgname) {
        this.cgname = cgname;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}