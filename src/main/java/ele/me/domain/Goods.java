package ele.me.domain;

import java.util.Date;

public class Goods {
    private Integer gid;

    private String gname;

    private String gimg;

    private String gintroduction;

    private Double gprice;

    private Integer gcgid;

    private Integer gbid;

    private Date addTime;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGimg() {
        return gimg;
    }

    public void setGimg(String gimg) {
        this.gimg = gimg;
    }

    public String getGintroduction() {
        return gintroduction;
    }

    public void setGintroduction(String gintroduction) {
        this.gintroduction = gintroduction;
    }

    public Double getGprice() {
        return gprice;
    }

    public void setGprice(Double gprice) {
        this.gprice = gprice;
    }

    public Integer getGcgid() {
        return gcgid;
    }

    public void setGcgid(Integer gcgid) {
        this.gcgid = gcgid;
    }

    public Integer getGbid() {
        return gbid;
    }

    public void setGbid(Integer gbid) {
        this.gbid = gbid;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}