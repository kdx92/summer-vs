package com.managementsystem.service.impl;

import com.managementsystem.mapper.ProdCategoryMapper;
import com.managementsystem.mapper.UserMapper;
import com.managementsystem.model.ProdCategory;
import com.managementsystem.model.User;
import com.managementsystem.service.ProdCategoryService;
import com.managementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findByUsername(String username) {

        return userMapper.findByUserName(username);

    }
}
