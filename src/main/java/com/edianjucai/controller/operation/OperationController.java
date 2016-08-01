package com.edianjucai.controller.operation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Operation")
public class OperationController {
    
    @RequestMapping("/test")
    public String Test() {
        return "/operation/index";
    }
}
