package com.springboot.spring_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")// задает адрес по которому будет доступен данный контролер
public class MainController {

    @RequestMapping
    public String mainPage(Model model){
        model.addAttribute("message", "Hello World!");
        return "main";
    }
}
