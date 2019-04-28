package cn.hsx.service;

import cn.hsx.domain.Commodity;

import java.util.List;

public interface CommodityService {
    List<Commodity> findAll(int pageNum);
//    List<Commodity> findAlltwo();
//    List<Commodity> findAllthree();
    List<Commodity> findName(String commodityname);
    List<Commodity> findPrice(String price);
}
