package com.managementsystem.web.controller;

import com.managementsystem.model.CURDResult;
import com.managementsystem.model.PageResult;
import com.managementsystem.model.ProdOrder;
import com.managementsystem.service.ProdOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("prodorder")
public class ProdOrderController {

    @Autowired
    ProdOrderService orderService;

    @RequestMapping("list")
    public String prodorderlist(){
        return "prodorder/list";
    }

    @RequestMapping("add")
    public String add(){

        return "prodorder/add";
    }

    @RequestMapping("edit")
    public String edit(Model model,String order_id){
        System.out.println("修改订单order_id="+order_id);
        ProdOrder order=orderService.findByOrderId(order_id);
        model.addAttribute("order",order);

        return "prodorder/edit";
    }

    @RequestMapping("detail")
    public String detail(Model model, String order_id){
        ProdOrder order=orderService.findByOrderId(order_id);
        model.addAttribute("order",order);
//        System.out.println(order_id);
        return "prodorder/detail";
    }

    @RequestMapping("delete")
    @ResponseBody
    public CURDResult delete(String order_id){
        CURDResult result=new CURDResult();
        orderService.deleteByOrderId(order_id);
        return result;
    }

    @RequestMapping("save")
    @ResponseBody
    public CURDResult save(ProdOrder order){
        CURDResult result=new CURDResult();
        if (order.getOrder_id() == null || order.getOrder_id().length()== 0){
            orderService.save(order);
        }
        else {
            orderService.update(order);
        }

        System.out.println(order);


        return result;

    }

    @RequestMapping("listJson")
    @ResponseBody
    public PageResult<ProdOrder> listJson(int page,int limit){
        PageResult<ProdOrder> result= orderService.findPageResult(null,page,limit);

        return result;
    }
    /**
     * page显示的当前页
     * limit每次显示多少条
     */
}
