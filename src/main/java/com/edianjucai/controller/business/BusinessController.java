package com.edianjucai.controller.business;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.edianjucai.model.UserVo;
import com.edianjucai.page.UserPagination;
import com.edianjucai.service.UserServiceImpl;
import com.edianjucai.util.ReadFromFile;
import com.edianjucai.util.VerificationUtil;

@Controller
@RequestMapping("/Business")
public class BusinessController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/index")
    public ModelAndView showUserList(HttpServletRequest request, HttpServletResponse response) {
        UserPagination userPagination = new UserPagination();
        //test
        userPagination.setCurrentPage(2);
        userPagination.setIsEffect(-1);
        userPagination.setVipState(-1);
        /*if (VerificationUtil.isNumeric(request.getParameter("currentPage"))) {
            userPagination.setCurrentPage(Integer.valueOf(request.getParameter("currentPage")));
        }

        userPagination.setIdno(request.getParameter("idNo"));
        userPagination.setMobile(request.getParameter("mobile"));
        userPagination.setRealName(request.getParameter("realName"));
        userPagination.setUserName(request.getParameter("userName"));
        userPagination.setIsEffect(Integer.valueOf(request.getParameter("isEffect")));
        userPagination.setVipState(Integer.valueOf(request.getParameter("vipState")));*/
        ModelAndView model = new ModelAndView();
        List<UserVo> users = userService.findAllUser(userPagination);
        System.out.println(users.size());
        System.out.println(this.getClass().getResource("/").toString().substring(0, 46+("WEB-INF".length() + 1)));
        model.addObject("users", users);
        model.setViewName("/business/index");
        return model;
    }

}
