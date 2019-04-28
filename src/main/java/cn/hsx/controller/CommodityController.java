package cn.hsx.controller;

import cn.hsx.domain.Commodity;
import cn.hsx.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/commodity")
public class CommodityController {

    @Autowired
    private CommodityService commodityService;
//    @RequestMapping("/findAll")
//    public String findAll(Model model){
//        List<Commodity> result = commodityService.findAll();
//        model.addAttribute("menu", result);
//        return "menu";
//    }

    @RequestMapping("/findAll/{pageNum}")
    public String findAll(@PathVariable("pageNum")int pageNum, Model model){
        List<Commodity> result = commodityService.findAll(pageNum);
        model.addAttribute("menu", result);
        return "menu";
    }
//    @RequestMapping("/findAllTwo")
//    public String findAlltwo(Model model){
//        List<Commodity> result = commodityService.findAlltwo();
//        model.addAttribute("menu", result);
//        return "menu";
//    }
//    @RequestMapping("/findAllThree")
//    public String findAllthree(Model model){
//        List<Commodity> result = commodityService.findAllthree();
//        model.addAttribute("menu", result);
//        return "menu";
//    }
    @RequestMapping("/findName")
    public String findName(String commodityname, Model model){
        List<Commodity> result = commodityService.findName(commodityname);
        model.addAttribute("menu2", result);
        if (result.size()>0) {
            return "menu2";
        }
        return "menu2";
    }
    @RequestMapping("/findPrice")
    public String findPrice(String price, Model model){
        List<Commodity> result = commodityService.findPrice(price);
        model.addAttribute("menu2", result);
        if (result.size()>0) {
            return "menu2";
        }
        return "menu2";
    }
}