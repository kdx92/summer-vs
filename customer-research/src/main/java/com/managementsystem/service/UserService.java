package com.managementsystem.service;

import com.managementsystem.model.ProdCategory;
import com.managementsystem.model.User;

import java.util.List;

//课程分类的service
public interface UserService {

   public User findByUsername(String username);

}
