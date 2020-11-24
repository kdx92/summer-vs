package com.managementsystem.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prodorder")
public class ProdOrderController {
    @RequestMapping("/list")
    public String prodorderlist(){

        return "prodorder/list";
    }
}
