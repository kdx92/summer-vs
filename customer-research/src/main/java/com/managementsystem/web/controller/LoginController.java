package com.managementsystem.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

//    @RequestMapping("login")
//        @RequestMapping(value = "login",method = RequestMethod.GET)
    @GetMapping("/login")
    public String login(){
//        return "login";
//        return "index";
            return "login";
    }
//    @RequestMapping("/user/login")
//    public String login(@RequestParam("username") String username,
//                        @RequestParam("password") String password,
//                        Map<String,Object> map, HttpSession session){
//        if (!StringUtils.isEmpty(username) && "123456".equals(password)){
////            登录成功
////            防止表单重复提交，可以重定向到主页
////            return "dashboard";
//            session.setAttribute("loginUser",username);
//            return "redirect:/index.html";
//        }else{
////            登录失败
//            map.put("msg","用户名密码错误");
//            return "login";
//        }
//    }


//    @RequestMapping(value = "login",method = RequestMethod.GET)
//    @GetMapping("login")


//    @RequestMapping("login-error")
//    public String loginError(){
//        return "login-error";
//    }
}
