package com.edianjucai.controller.login;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.edianjucai.model.Admin;
import com.edianjucai.service.LoginServiceImpl;

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
        Admin admin = loginService.login(userName, password);
        
        if (admin == null) {
            mv.addObject("loginMsg", "用户名密码有误！");
            mv.setViewName("/login");
        } else {
            httpSession.setAttribute("admin", admin);
            int roleId = admin.getRoleId();
            switch (roleId) {
            case 5:
                //request.getRequestDispatcher("/Business/test").forward(request, response);
            mv.setViewName("redirect:/Business/test");
                break;
            case 24:
            mv.setViewName("redirect:/Business/test");
                break;
            case 23:
            mv.setViewName("redirect:/RiskControlling/test");
                break;
            case 20:
            mv.setViewName("redirect:/Finance/test");
                break;
            case 22:
            mv.setViewName("redirect:/Operation/test");
                break;
            default:
                break;
            }
        }

        return mv;
    }
    
    @RequestMapping(value = "/showAllAdmin")
    public ModelAndView showAllAdmin(HttpSession httpSession) {
        ModelAndView mv = new ModelAndView();
        List<Admin> admins = loginService.showAllAdmin();
        mv.addObject("admins", admins);
        mv.setViewName("jsp1");
        return mv;
    }
}
