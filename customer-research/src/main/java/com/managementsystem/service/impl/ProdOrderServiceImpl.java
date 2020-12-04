package com.managementsystem.service.impl;

import com.managementsystem.mapper.ProdOrderMapper;
import com.managementsystem.model.MonthIncome;
import com.managementsystem.model.PageResult;
import com.managementsystem.model.ProdOrder;
import com.managementsystem.service.ProdOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProdOrderServiceImpl implements ProdOrderService {

    @Autowired
    ProdOrderMapper orderMapper;
    @Override
    public PageResult<ProdOrder> findPageResult(ProdOrder condition, int page, int pageSize) {
        PageResult<ProdOrder> result=new PageResult<ProdOrder>();
        result.setCode(0);
        /**
         * 查询参数先设置为空
         */
        Map<String,Object> params = new HashMap<String,Object>();
//        select * from 表 limit 0,10
        params.put("condition",condition);
//        模糊查询条件
        params.put("start",(page-1) * pageSize);
        params.put("pageSize",pageSize);
//        获取总记录数据
        int totalCount = orderMapper.findCountByMap(params);
        result.setCount(totalCount);
//        获取查询的数据
        List<ProdOrder> list = orderMapper.findListByMap(params);
        result.setData(list);
        return result;
    }

    @Override
    public void save(ProdOrder order) {

        orderMapper.insert(order);

    }

    @Override
    public ProdOrder findByOrderId(String order_id) {

        return orderMapper.findByOrderId(order_id);
    }

    @Override
    public void deleteByOrderId(String order_id) {

        orderMapper.deleteByOrderId(order_id);

    }

    @Override
    public void update(ProdOrder order) {

        orderMapper.update(order);

    }

    @Override
    public List<MonthIncome> getMonthIncomes() {

        return orderMapper.getMonthIncomes();

    }
}
