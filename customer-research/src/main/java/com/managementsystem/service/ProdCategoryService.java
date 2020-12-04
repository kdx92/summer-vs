package com.managementsystem.service;

import com.managementsystem.model.MonthIncome;
import com.managementsystem.model.PageResult;
import com.managementsystem.model.ProdCategory;
import com.managementsystem.model.ProdOrder;

import java.util.List;
//课程分类的service
public interface ProdCategoryService {

   public List<ProdCategory> findAllList();

}
