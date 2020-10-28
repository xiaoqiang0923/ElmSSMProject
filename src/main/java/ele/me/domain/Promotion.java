package ele.me.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Promotion  implements Serializable {
    private Integer pid;

    private String pname;

    private String introduction;

    private Date addTime;

    public Promotion() {
    }

    public Promotion(Integer pid, String pname, String introduction, Date addTime) {
        this.pid = pid;
        this.pname = pname;
        this.introduction = introduction;
        this.addTime = addTime;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}