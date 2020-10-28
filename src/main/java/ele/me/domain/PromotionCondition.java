package ele.me.domain;

import java.io.Serializable;
import java.util.Date;

public class PromotionCondition extends Promotion implements Serializable {
    private Integer pidCondition;
    private Date startDate;
    private Date endDate;

    public PromotionCondition() {
    }

    public PromotionCondition(Integer pid, String pname, String introduction, Date addTime, Integer pidCondition, Date startDate, Date endDate) {
        super(pid, pname, introduction, addTime);
        this.pidCondition = pidCondition;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getPidCondition() {
        return pidCondition;
    }

    public void setPidCondition(Integer pidCondition) {
        this.pidCondition = pidCondition;
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
