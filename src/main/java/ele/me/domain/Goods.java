package ele.me.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data //启用了lombok插件,相当于@ToString、@EqualsAndHashCode、@Getter、@Setter和@RequiredArgsConstrutor
@NoArgsConstructor //lombok自动生成空参构造器
@AllArgsConstructor //lombok自动生成全参构造器
@JsonIgnoreProperties(value = "handler")    //用于解决mybatis关联查询时使用了懒加载方式过程中数据封装引发的问题
public class Goods  implements Serializable {
    private Integer gid;

    private String gname;

    private String gimg;

    private String gintroduction;

    private Double gprice;

    private Integer gcgid;

    private Integer gbid;

    private Date addTime;

    private Business business;

    private Categorys categorys;



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

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public Categorys getCategorys() {
        return categorys;
    }

    public void setCategorys(Categorys categorys) {
        this.categorys = categorys;
    }
}