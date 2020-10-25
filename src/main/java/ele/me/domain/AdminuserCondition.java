package ele.me.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/10/22 0022
 * @描述
 */
public class AdminuserCondition extends Adminuser implements Serializable{
    private Integer uidCondition;
    private Date startDate;
    private Date endDate;

    public AdminuserCondition() {
    }

    public AdminuserCondition(Integer uid,String username,Date addTime,Integer uidCondition, Date startDate, Date endDate) {
        super(uid,username,addTime);
        this.uidCondition = uidCondition;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "UserCondition{" +
                "uidCondition=" + uidCondition +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                "} " + super.toString();
    }

    public Integer getUidCondition() {
        return uidCondition;
    }

    public void setUidCondition(Integer uidCondition) {
        this.uidCondition = uidCondition;
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
