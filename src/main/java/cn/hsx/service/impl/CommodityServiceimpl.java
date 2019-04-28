package cn.hsx.service.impl;

import cn.hsx.dao.CommodityDao;
import cn.hsx.domain.Commodity;
import cn.hsx.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("commodityService")
public class CommodityServiceimpl implements CommodityService {

    @Autowired
    private CommodityDao commodityDao;

    public List<Commodity> findAll(int pageNum){
        System.out.println("查询所有商品");
        return commodityDao.findAll(pageNum*10);
    }
    public List<Commodity> findName(String commodityname){
        System.out.println("查询了商品名");
        return commodityDao.findName(commodityname);
    }
    public List<Commodity> findPrice(String price){
        System.out.println("price");
        return commodityDao.findPrice(price);
    }
//    public List<Commodity> findAlltwo(){
//        System.out.println("1");
//        return commodityDao.findAlltwo();
//    }
//    public List<Commodity> findAllthree(){
//        System.out.println("2");
//        return commodityDao.findAllthree();
//    }

}
