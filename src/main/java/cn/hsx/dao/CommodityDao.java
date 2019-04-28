package cn.hsx.dao;

import cn.hsx.domain.Commodity;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CommodityDao {
    @Select("select * from commodity limit #{start}, 10")
    List<Commodity> findAll(int start);
//    @Select("select * from commodity limit 2, 2")
//    List<Commodity> findAlltwo();
//    @Select("select * from commodity limit 4, 2")
//    List<Commodity> findAllthree();

    @Select("select * from commodity where commodityname = #{commodityname}")
    List<Commodity> findName(String commodityname);

    @Select("select * from commodity where price = #{price}")
    List<Commodity> findPrice(String price);
}
