package com.edianjucai.controller.finance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Finance")
public class FinanceController {
    
    @RequestMapping("/test")
    public String Test() {
        return "/finance/index";
    }
}
