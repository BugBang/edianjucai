package com.edianjucai.controller.riskcontrolling;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/RiskControlling")
public class RiskControllingController {
    
    @RequestMapping("/test")
    public String Test() {
        return "/riskcontrolling/index";
    }
}
