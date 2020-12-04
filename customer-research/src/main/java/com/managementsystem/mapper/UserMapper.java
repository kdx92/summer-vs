package com.managementsystem.mapper;

import com.managementsystem.model.ProdCategory;
import com.managementsystem.model.User;

import java.util.List;

public interface UserMapper {

    public User findByUserName(String username);

}
