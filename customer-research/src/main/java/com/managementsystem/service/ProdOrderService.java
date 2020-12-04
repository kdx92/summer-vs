package com.managementsystem.service;

import com.managementsystem.model.MonthIncome;
import com.managementsystem.model.PageResult;
import com.managementsystem.model.ProdOrder;

import java.util.List;

public interface ProdOrderService {

    public PageResult<ProdOrder> findPageResult(ProdOrder condition,int page,int pageSize);

    public  void save(ProdOrder order);

    public ProdOrder findByOrderId(String order_id);

    public void deleteByOrderId(String order_id);

    public void update(ProdOrder order);

    public List<MonthIncome> getMonthIncomes();

}
