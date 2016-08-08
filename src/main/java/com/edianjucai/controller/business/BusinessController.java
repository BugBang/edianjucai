package com.edianjucai.controller.business;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.edianjucai.model.Article;
import com.edianjucai.model.UserVo;
import com.edianjucai.page.ArticlePagination;
import com.edianjucai.page.UserPagination;
import com.edianjucai.service.ArticleServiceImpl;
import com.edianjucai.service.UserServiceImpl;

@Controller
@RequestMapping("/Business")
public class BusinessController {

    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private ArticleServiceImpl articleSerice;

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
        model.addObject("users", users);
        model.setViewName("/business/index");
        return model;
    }
    
    @RequestMapping(value = "/goToAddUser")
    public String goToAddUser() {
        return "/business/adduser";
    }
    
    @RequestMapping(value = "/addUser")
    public ModelAndView addUser(
            @RequestParam(value = "currentPage", defaultValue = "1") int currentPage,
            @RequestParam(value = "idNo", defaultValue = "") String idNo,
            @RequestParam(value = "realName", defaultValue = "") String realName,
            @RequestParam(value = "userName", defaultValue = "") String userName,
            @RequestParam(value = "isEffect", defaultValue = "-1") int isEffect,
            @RequestParam(value = "vipState", defaultValue = "-1") int vipState) {
        ModelAndView model = new ModelAndView();
        return model;
    }
    
    @RequestMapping(value = "/deleteUser")
    public ModelAndView deleteUser(
            @RequestParam(value = "currentPage", defaultValue = "1") int currentPage,
            @RequestParam(value = "idNo", defaultValue = "") String idNo,
            @RequestParam(value = "realName", defaultValue = "") String realName,
            @RequestParam(value = "userName", defaultValue = "") String userName,
            @RequestParam(value = "isEffect", defaultValue = "-1") int isEffect,
            @RequestParam(value = "vipState", defaultValue = "-1") int vipState
            ) {
        ModelAndView model = new ModelAndView();
        model.setViewName("redirect:/business/index?currentPage=" + currentPage + "&idNo=" + idNo 
                + "&realName=" + realName + "&userName=" + userName + "&isEffect=" + isEffect 
                + "&vipState=" + vipState);
        return model;
    }
    
    
    @RequestMapping(value = "/showAllArticle")
    public ModelAndView showAllArticle(
            @RequestParam(value = "currentPage", defaultValue = "1") int currentPage,
            @RequestParam(value = "title", defaultValue = "") String title
            ) {
        ModelAndView model = new ModelAndView();
        ArticlePagination articlePagination = new ArticlePagination();
        articlePagination.setTitle(title);
        articlePagination.setCurrentPage(currentPage);
        List<Article> articles = articleSerice.findAllArticle(articlePagination);
        model.addObject("articles", articles);
        model.setViewName("/business/article/list");
        return model;
    }
    
    @RequestMapping(value = "/goToAddArticle")
    public String goToAddArticle(HttpServletRequest request) {
        return "/business/article/create";
    }
    
    @RequestMapping(value = "/addArticle", method = RequestMethod.GET)
    public ModelAndView addArticle(@ModelAttribute("article")Article article) {
        ModelAndView model = new ModelAndView();
        article.setClickCount(123);
        article.setCreateTime(new Date().getTime() / 1000);
        article.setUpdateAdminId(2);
        article.setIsDelete(1);
        article.setIsEffect(1);
        article.setSeoDescription("seoDescription");
        article.setSeoKeyword("seokeyword");
        article.setSort(1);
        article.setUpdateTime(new Date().getTime() / 1000);
        article.setuName("uname");
        article.setSubTitle("subTile");
        if (articleSerice.createArticle(article)) {
            model.addObject("addMsg", "add success");
           /* model.addObject("articleTitle", stitle);
            model.addObject("currentPage", currentPage);
            model.setViewName("redirect:/business/showAllArticle?currentPage=" + currentPage
                    + "&title=" + stitle);*/
        } else {
            model.addObject("addFailMsg", "add fail");
            model.setViewName("/business/article/create");
        }
        return model;
    }

}
