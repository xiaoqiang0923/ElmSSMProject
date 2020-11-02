package ele.me.domain;

import java.io.Serializable;
import java.util.Date;

public class GoodsCondition extends Goods implements Serializable {
    private Double minprice;
    private Double maxprice;
    private Date startDate;
    private Date endDate;

    public GoodsCondition() {
    }

    public GoodsCondition(Integer gid, String gname, String gimg, String gintroduction, Double gprice, Integer gcgid, Integer gbid,
                          Date addTime, Business business, Categorys categorys, Double minprice, Double maxprice, Date startDate, Date endDate) {
        super(gid, gname, gimg, gintroduction, gprice, gcgid, gbid, addTime, business, categorys);
        this.minprice = minprice;
        this.maxprice = maxprice;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "GoodsCondition{" +
                "minprice=" + minprice +
                ", maxprice=" + maxprice +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    public Double getMinprice() {
        return minprice;
    }

    public void setMinprice(Double minprice) {
        this.minprice = minprice;
    }

    public Double getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(Double maxprice) {
        this.maxprice = maxprice;
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
