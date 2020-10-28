package ele.me.domain;

import java.io.Serializable;
import java.util.Date;

public class BusinessCondition extends Business implements Serializable {
    private Double minBscore;
    private Double maxBscore;
    private Date startDate;
    private Date endDate;

    public BusinessCondition() {
    }

    public BusinessCondition(Integer bid, String bname, String bimg, Double bscore, String bdescription, String courier, String blocation, Double delivery, Double freight, Date addTime, Double minBscore, Double maxBscore, Date startDate, Date endDate) {
        super(bid, bname, bimg, bscore, bdescription, courier, blocation, delivery, freight, addTime);
        this.minBscore = minBscore;
        this.maxBscore = maxBscore;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Double getMinBscore() {
        return minBscore;
    }

    public void setMinBscore(Double minBscore) {
        this.minBscore = minBscore;
    }

    public Double getMaxBscore() {
        return maxBscore;
    }

    public void setMaxBscore(Double maxBscore) {
        this.maxBscore = maxBscore;
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
