package com.managementsystem.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stuinfo")
public class StuInfoController {
    @RequestMapping("/list")
    public String stuinfolist(){

        return "stuinfo/list";
    }
}
