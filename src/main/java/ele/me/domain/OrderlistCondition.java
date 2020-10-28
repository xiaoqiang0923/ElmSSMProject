package ele.me.domain;

import java.io.Serializable;
import java.util.Date;

public class OrderlistCondition extends Orderlist implements Serializable {
    private Date startDate;
    private Date endDate;

    public OrderlistCondition() {
    }

    public OrderlistCondition(Integer oid, Integer oamount, Integer paysstatus, Integer ogid, Goods goods, Integer ocid, Customer customer, Integer obid, Business business, Date addTime, Date startDate, Date endDate) {
        super(oid, oamount, paysstatus, ogid, goods, ocid, customer, obid, business, addTime);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
