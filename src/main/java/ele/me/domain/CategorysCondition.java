package ele.me.domain;


import java.io.Serializable;
import java.util.Date;

public class CategorysCondition extends Categorys {
    private double minPrice;
    private double maxPrice;
    private Date startDate;
    private Date endDate;

    public CategorysCondition() {
    }

    public CategorysCondition(Integer cgid, String cgname, String cdes, String cavatar, Date addTime, double minPrice, double maxPrice, Date startDate, Date endDate) {
        super(cgid, cgname, cdes, cavatar, addTime);
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public Integer getCgidCondition() {
        Integer cgidCondition = null;
        return cgidCondition;
    }
    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
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
