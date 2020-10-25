package ele.me.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Orderlist  implements Serializable {
    private Integer oid;

    private Integer oamount;

    private Integer paysstatus;

    private Integer ogid;

    private Integer ocid;

    private Integer obid;

    private Date addTime;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getOamount() {
        return oamount;
    }

    public void setOamount(Integer oamount) {
        this.oamount = oamount;
    }

    public Integer getPaysstatus() {
        return paysstatus;
    }

    public void setPaysstatus(Integer paysstatus) {
        this.paysstatus = paysstatus;
    }

    public Integer getOgid() {
        return ogid;
    }

    public void setOgid(Integer ogid) {
        this.ogid = ogid;
    }

    public Integer getOcid() {
        return ocid;
    }

    public void setOcid(Integer ocid) {
        this.ocid = ocid;
    }

    public Integer getObid() {
        return obid;
    }

    public void setObid(Integer obid) {
        this.obid = obid;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}