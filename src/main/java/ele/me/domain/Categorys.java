package ele.me.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

@JsonIgnoreProperties(value = "handler")  //用于解决mybatis关联查询时使用了懒加载方式过程中数据封装引发的问题
@Data
public class Categorys {
    private Integer cgid;

    private String cgname;

    private String cdes;

    private String cavatar;

    private Date addTime;

    public Categorys() {
    }

    public Categorys(Integer cgid, String cgname, String cdes, String cavatar, Date addTime) {
        this.cgid = cgid;
        this.cgname = cgname;
        this.cdes = cdes;
        this.cavatar = cavatar;
        this.addTime = addTime;
    }

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