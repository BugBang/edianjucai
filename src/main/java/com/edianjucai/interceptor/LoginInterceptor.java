package com.edianjucai.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.edianjucai.model.Admin;

public class LoginInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        /*Admin admin = (Admin)request.getSession().getAttribute("admin");
        modelAndView.addObject("admin", admin);
        if (admin == null) {
            modelAndView.setViewName("/login");
            return;
        }
        int roleId = admin.getRoleId();
        switch (roleId) {
        case 5:
            //request.getRequestDispatcher("/Business/test").forward(request, response);
            modelAndView.setViewName("redirect:/Business/test");
            break;
        case 24:
            modelAndView.setViewName("redirect:/Business/test");
            break;
        case 23:
            modelAndView.setViewName("redirect:/RiskControlling/test");
            break;
        case 20:
            modelAndView.setViewName("redirect:/Finance/test");
            break;
        case 22:
            modelAndView.setViewName("redirect:/Operation/test");
            break;
        default:
            break;
        }*/
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        //DO SOMETHING
    }

}
