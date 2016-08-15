package com.edianjucai.controller.login;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.edianjucai.model.Admin;
import com.edianjucai.service.LoginServiceImpl;
import com.edianjucai.util.MD5Util;

@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    private LoginServiceImpl loginService;
    
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String login() {
        return "/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(String userName, String password, HttpSession httpSession) {
        ModelAndView mv = new ModelAndView();
        Admin admin = loginService.login(userName, MD5Util.MD5(password));
        if (admin == null) {
            mv.addObject("loginMsg", "用户名密码有误！");
            mv.setViewName("/login");
        } else {
            httpSession.setAttribute("admin", admin);
            int roleId = admin.getRoleId();
            roleId = loginService.getRoleId(roleId);
            switch (roleId) {
            case 1:
            mv.setViewName("redirect:/Admin");
                break;
            case 2:
            mv.setViewName("redirect:/Business/index");
                break;
            case 3:
            mv.setViewName("redirect:/RiskControlling/test");
                break;
            case 4:
            mv.setViewName("redirect:/Operation/test");
                break;
            case 5:
            mv.setViewName("redirect:/Finance/test");
                break;
            default:
                break;
            }
        }

        return mv;
    }
    
    @RequestMapping(value = "/Admin")
    public ModelAndView showAllAdmin(HttpSession httpSession) {
        ModelAndView mv = new ModelAndView();
        List<Admin> admins = loginService.showAllAdmin();
        mv.addObject("admins", admins);
        mv.setViewName("/index");
        return mv;
    }
}
