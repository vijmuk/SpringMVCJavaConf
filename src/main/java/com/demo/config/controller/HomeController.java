package com.demo.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model){
        model.addAttribute("message", "Spring MVC Java Configuration Example");
        return "index";
    }
}
