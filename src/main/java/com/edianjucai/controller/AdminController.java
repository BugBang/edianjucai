package com.edianjucai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edianjucai.model.Admin;
import com.edianjucai.service.LoginServiceImpl;

@Controller
@RequestMapping("/login")
public class AdminController {

    @Autowired
    private LoginServiceImpl loginService;

    @RequestMapping(value="/login")
    @ResponseBody
    public String goLogin() {
        Admin admin = loginService.loign("admin", "admin");
        if (admin == null) {
            return "login fail";
        } else {
            return "欢迎你" + admin.getName();
        }
    }
    
}
