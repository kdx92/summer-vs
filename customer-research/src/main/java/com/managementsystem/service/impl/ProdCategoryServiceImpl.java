package com.managementsystem.service.impl;

import com.managementsystem.mapper.ProdCategoryMapper;
import com.managementsystem.mapper.ProdOrderMapper;
import com.managementsystem.model.MonthIncome;
import com.managementsystem.model.PageResult;
import com.managementsystem.model.ProdCategory;
import com.managementsystem.model.ProdOrder;
import com.managementsystem.service.ProdCategoryService;
import com.managementsystem.service.ProdOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProdCategoryServiceImpl implements ProdCategoryService {

    @Autowired
    ProdCategoryMapper categoryMapper;

    @Override
    public List<ProdCategory> findAllList() {

        return categoryMapper.findAllList();

    }
}
