package com.edianjucai.controller.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.edianjucai.model.UserVo;
import com.edianjucai.service.UserServiceImpl;

@Controller
@RequestMapping("/Business")
public class BusinessController {
    
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/test")
    public ModelAndView Test() {
        ModelAndView model = new ModelAndView();
        List<UserVo> users = userService.findAllUser();
        model.addObject("users", users);
        model.setViewName("/business/index");
        return model;
    }
}
