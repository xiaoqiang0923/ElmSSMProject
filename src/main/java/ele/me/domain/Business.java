package ele.me.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Business  implements Serializable {
    private Integer bid;

    private String bname;

    private String bpassword;

    private String bimg;

    private Double bscore;

    private String bdescription;

    private String courier;

    private String blocation;

    private Double delivery;

    private Double freight;

    private Date addTime;

    public Business() {
    }

    public Business(Integer bid, String bname, String bimg, Double bscore, String bdescription, String courier, String blocation, Double delivery, Double freight, Date addTime) {
        this.bid = bid;
        this.bname = bname;
        this.bimg = bimg;
        this.bscore = bscore;
        this.bdescription = bdescription;
        this.courier = courier;
        this.blocation = blocation;
        this.delivery = delivery;
        this.freight = freight;
        this.addTime = addTime;
    }


    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBpassword() {
        return bpassword;
    }

    public void setBpassword(String bpassword) {
        this.bpassword = bpassword;
    }

    public String getBimg() {
        return bimg;
    }

    public void setBimg(String bimg) {
        this.bimg = bimg;
    }

    public Double getBscore() {
        return bscore;
    }

    public void setBscore(Double bscore) {
        this.bscore = bscore;
    }

    public String getBdescription() {
        return bdescription;
    }

    public void setBdescription(String bdescription) {
        this.bdescription = bdescription;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public String getBlocation() {
        return blocation;
    }

    public void setBlocation(String blocation) {
        this.blocation = blocation;
    }

    public Double getDelivery() {
        return delivery;
    }

    public void setDelivery(Double delivery) {
        this.delivery = delivery;
    }

    public Double getFreight() {
        return freight;
    }

    public void setFreight(Double freight) {
        this.freight = freight;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}