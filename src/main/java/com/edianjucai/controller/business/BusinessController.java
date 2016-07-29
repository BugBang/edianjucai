package com.edianjucai.controller.business;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Business")
public class BusinessController {
    
    @RequestMapping("/test")
    public String Test() {
        return "/business/index";
    }
}
