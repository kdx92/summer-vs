package com.managementsystem.mapper;

import com.managementsystem.model.MonthIncome;
import com.managementsystem.model.ProdCategory;
import com.managementsystem.model.ProdOrder;

import java.util.List;
import java.util.Map;

//import com.gyf.szcrm.model.MonthIncome;


public interface ProdCategoryMapper {

//    返回所有的商品类型信息
    public List<ProdCategory> findAllList();

}
