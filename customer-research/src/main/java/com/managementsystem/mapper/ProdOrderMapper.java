package com.managementsystem.mapper;

import com.managementsystem.model.MonthIncome;
import com.managementsystem.model.ProdOrder;
import java.util.List;
import java.util.Map;

public interface ProdOrderMapper {

    public int findCountByMap(Map<String, Object> map);

	public List<ProdOrder> findListByMap(Map<String, Object> map);

    void insert(ProdOrder order);

    public ProdOrder findByOrderId(String order_id);

    public void deleteByOrderId(String order_id);

    public void update(ProdOrder order);

    public List<MonthIncome> getMonthIncomes();

}
