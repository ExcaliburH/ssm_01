package cn.hsx.domain;

import java.io.Serializable;

public class Commodity implements Serializable {
    private Integer commodityid;
    private String commodityname;
    private Float price;
    private String descriptions;
    private String place;

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "commodityid=" + commodityid +
                ", commodityname='" + commodityname + '\'' +
                ", price=" + price +
                ", descriptions='" + descriptions + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
