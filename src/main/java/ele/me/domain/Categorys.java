package ele.me.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class Categorys implements Serializable {
    private Integer cgid;

    private String cgname;

    private String cdes;

    private String cavatar;

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

    public String getCdes() {
        return cdes;
    }

    public void setCdes(String cdes) {
        this.cdes = cdes;
    }

    public String getCavatar() {
        return cavatar;
    }

    public void setCavatar(String cavatar) {
        this.cavatar = cavatar;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}