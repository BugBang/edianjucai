package com.edianjucai.controller.business;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.edianjucai.model.Adv;
import com.edianjucai.model.Article;
import com.edianjucai.model.ArticleCate;
import com.edianjucai.model.Deal;
import com.edianjucai.model.DealCate;
import com.edianjucai.model.DealMappingMsg;
import com.edianjucai.model.Ecv;
import com.edianjucai.model.EcvType;
import com.edianjucai.model.Goods;
import com.edianjucai.model.GoodsCate;
import com.edianjucai.model.GoodsOrder;
import com.edianjucai.model.GoodsType;
import com.edianjucai.model.MAdv;
import com.edianjucai.model.MsgSystem;
import com.edianjucai.model.Nav;
import com.edianjucai.model.User;
import com.edianjucai.model.vo.GoodsOrderVo;
import com.edianjucai.model.vo.GoodsVo;
import com.edianjucai.model.vo.UserBankVo;
import com.edianjucai.model.vo.UserVo;
import com.edianjucai.page.AdvPagination;
import com.edianjucai.page.ArticleCatePagination;
import com.edianjucai.page.ArticlePagination;
import com.edianjucai.page.DealPagination;
import com.edianjucai.page.EcvPagination;
import com.edianjucai.page.EcvTypePagination;
import com.edianjucai.page.GoodsCatePagination;
import com.edianjucai.page.GoodsOrderPagination;
import com.edianjucai.page.GoodsPagination;
import com.edianjucai.page.MAdvPagination;
import com.edianjucai.page.MsgSystemPagination;
import com.edianjucai.page.NavPagination;
import com.edianjucai.page.UserBankPagination;
import com.edianjucai.page.UserPagination;
import com.edianjucai.service.ArticleServiceImpl;
import com.edianjucai.service.DealServiceImpl;
import com.edianjucai.service.FrontendServiceImpl;
import com.edianjucai.service.GoodsServiceImpl;
import com.edianjucai.service.SystemSetUpServiceImpl;
import com.edianjucai.service.UserServiceImpl;
import com.edianjucai.util.ExportExcelUtil;

@Controller
@RequestMapping("/Business")
public class BusinessController {

    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private ArticleServiceImpl articleService;
    @Autowired
    private GoodsServiceImpl goodsService;
    @Autowired
    private FrontendServiceImpl frontendService;
    @Autowired
    private DealServiceImpl dealService;
    @Autowired
    private SystemSetUpServiceImpl systemSetUpServiceImpl;

    @RequestMapping(value = "/index")
    public ModelAndView showUserList(UserPagination userPagination) {
        ModelAndView model = new ModelAndView();
        try {
            List<UserVo> users = userService.findAllUser(userPagination);
            model.addObject("users", users);
            model.addObject("pagination", userPagination);
            model.setViewName("/business/user/list");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return model;
    }

    @RequestMapping(value = "/goToAddUser")
    public String goToAddUser() {
        return "/business/user/create";
    }

    @RequestMapping(value = "/addUser")
    public ModelAndView addUser(User user, HttpSession session) {
        ModelAndView model = new ModelAndView();
        return model;
    }

    @RequestMapping(value = "/goToModifyUser")
    public ModelAndView goToModifyUser(@RequestParam(value = "id", defaultValue = "-1") int id) {
        ModelAndView model = new ModelAndView();
        model.addObject("test", id);
        model.setViewName("/business/user/modify");
        return model;
    }

    @RequestMapping(value = "/deleteUser")
    public ModelAndView deleteUser(@RequestParam(value = "currentPage", defaultValue = "1") int currentPage,
            @RequestParam(value = "idNo", defaultValue = "") String idNo,
            @RequestParam(value = "realName", defaultValue = "") String realName,
            @RequestParam(value = "userName", defaultValue = "") String userName,
            @RequestParam(value = "isEffect", defaultValue = "-1") int isEffect,
            @RequestParam(value = "vipState", defaultValue = "-1") int vipState) {
        ModelAndView model = new ModelAndView();
        model.setViewName("redirect:/business/index?currentPage=" + currentPage + "&idNo=" + idNo + "&realName="
                + realName + "&userName=" + userName + "&isEffect=" + isEffect + "&vipState=" + vipState);
        return model;
    }

    @RequestMapping(value = "/showAllArticle")
    public ModelAndView showAllArticle(@RequestParam(value = "currentPage", defaultValue = "1") int currentPage,
            @RequestParam(value = "title", defaultValue = "") String title) {
        ModelAndView model = new ModelAndView();
        ArticlePagination articlePagination = new ArticlePagination();
        articlePagination.setTitle(title);
        articlePagination.setCurrentPage(currentPage);
        List<Article> articles = articleService.findAllArticle(articlePagination);
        model.addObject("articles", articles);
        model.setViewName("/business/article/list");
        return model;
    }

    @RequestMapping(value = "/goToAddArticle")
    public String goToAddArticle(HttpServletRequest request) {
        return "/business/article/create";
    }

    @RequestMapping(value = "/addArticle", method = RequestMethod.GET)
    public ModelAndView addArticle(@ModelAttribute("article") Article article, HttpSession session) {
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
        if (articleService.createArticle(article)) {
            session.setAttribute("successMsg", "add success!");
            model.addObject("currentPage", 1);
            model.addObject("title", "");
            model.setViewName("redirect:/Business/showAllArticle");
        } else {
            model.addObject("addFailMsg", "add fail");
            model.setViewName("/business/article/create");
        }
        return model;
    }

    @RequestMapping(value = "/goToModifyArticle")
    public ModelAndView goToModify(@RequestParam(value = "id", defaultValue = "-1") int id) {
        ModelAndView model = new ModelAndView();
        if (id == -1) {
            model.setViewName("/business/article/create");
        } else {
            Article article = articleService.getArticleById(id);
            model.addObject("article", article);
            model.setViewName("/business/article/modify");
        }
        return model;
    }

    @RequestMapping(value = "/modifyArticle")
    public ModelAndView modifyArticle(@ModelAttribute("article") Article article, HttpSession session) {
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
        if (articleService.modifyArticle(article)) {
            session.setAttribute("msg", "modify success!");
            model.addObject("currentPage", 1);
            model.addObject("title", article.getTitle());
            model.setViewName("redirect:/Business/showAllArticle");
        } else {
            session.setAttribute("msg", "modify fail");
            model.setViewName("redirect:/Business/goToModify?id=" + article.getId());
        }
        return model;
    }

    @RequestMapping(value = "/showAllArticleCate")
    public ModelAndView showAllArticleCate(
            @ModelAttribute("articleCatePagination") ArticleCatePagination articleCatePagination) {
        ModelAndView model = new ModelAndView();
        List<ArticleCate> articleCates = articleService.findAllArticleCate(articleCatePagination);
        model.addObject("articleCates", articleCates);
        model.setViewName("/business/article/cate/list");
        return model;
    }

    @RequestMapping(value = "/goToAddArticleCate")
    public String goToAddArticleCate() {
        return "/business/article/cate/create";
    }

    @RequestMapping(value = "/addArticleCate")
    public ModelAndView addArticleCate(@ModelAttribute("articleCate") ArticleCate articleCate, HttpSession session) {
        ModelAndView model = new ModelAndView();
        if (articleService.addArticleCate(articleCate)) {
            session.setAttribute("msg", "add success");
            model.addObject("title", "");
            model.addObject("currentPage", 1);
            model.setViewName("redirect:/Business/showAllArticleCate");
        } else {
            session.setAttribute("errMsg", "add fail");
            model.setViewName("/business/article/cate/create");
        }
        return model;
    }

    @RequestMapping(value = "/goToModifyArticleCate")
    public ModelAndView goToModifyArticleCate(@RequestParam(value = "id", defaultValue = "-1") int id) {
        ModelAndView model = new ModelAndView();
        ArticleCate articleCate = articleService.getArticleCateById(id);
        if (articleCate != null) {
            model.addObject("articleCate", articleCate);
            model.setViewName("/business/article/cate/modify");
        } else {
            model.addObject("title", "");
            model.addObject("currentPage", 1);
            model.setViewName("redirect:/Business/showAllArticleCate");
        }
        return model;
    }

    @RequestMapping(value = "/modifyArticleCate")
    public ModelAndView modifyArticleCate(@ModelAttribute("articleCate") ArticleCate articleCate, HttpSession session) {
        ModelAndView model = new ModelAndView();
        if (articleService.modifyArticleCate(articleCate)) {
            session.setAttribute("msg", "modify success");
            model.addObject("title", "");
            model.addObject("currentPage", 1);
            model.setViewName("redirect:/Business/showAllArticleCate");
        } else {
            model.addObject("id", articleCate.getId());
            model.setViewName("redirect:/Business/goToModifyArticleCate");
        }
        return model;
    }

    @RequestMapping(value = "/showAllGoods")
    public ModelAndView showAllGoods(@ModelAttribute("goodsPagination") GoodsPagination goodsPagination) {
        ModelAndView model = new ModelAndView();
        List<GoodsVo> goods = goodsService.findAllGoods(goodsPagination);
        model.addObject("goods", goods);
        model.addObject("pagination", goodsPagination);
        model.setViewName("/business/goods/list");
        return model;
    }

    @RequestMapping(value = "/goToAddGoods")
    public String goToAddGoods() {
        return "/business/goods/create";
    }

    @RequestMapping(value = "/addGoods")
    public ModelAndView addGoods(@ModelAttribute("goods") Goods goods, HttpSession session) {
        ModelAndView model = new ModelAndView();
        if (goodsService.addGoods(goods)) {
            session.setAttribute("msg", "add success");
            model.addObject("name", "");
            model.addObject("currentPage", 1);
            model.setViewName("redirect:/Business/showAllGoods");
        } else {
            model.addObject("addMsg", "add fail");
            model.setViewName("/business/goods/create");
        }
        return model;
    }

    @RequestMapping(value = "/goToModifyGoods")
    public ModelAndView goToModefyGoods(@RequestParam(value = "id", defaultValue = "-1") int id) {
        ModelAndView model = new ModelAndView();
        GoodsVo good = goodsService.getGoodsById(id);
        if (good != null) {
            List<GoodsCate> goodsCates = goodsService.findAllGoodsCate();
            List<GoodsType> goodsTypes = goodsService.findAllGoodsType();
            model.addObject("goodsCates", goodsCates);
            model.addObject("goodsTypes", goodsTypes);
            model.addObject("good", good);
            model.setViewName("/business/goods/modify");
        } else {
            model.addObject("name", "");
            model.addObject("currentPage", 1);
            model.setViewName("redirect:/Business/showAllGoods");
        }
        return model;
    }
    
    @RequestMapping(value = "/setImage")
    @ResponseBody
    public Map<String, String> setImage(String imgUrl, String imgName) {
        System.out.println("========进来了====================================================================================");
        Map<String, String> map = new HashMap<String, String>(1); 
        
        map.put("success", "true");
        return map;
    }
    
    @RequestMapping(value = "/modifyGoods")
    public ModelAndView modifyGoods(Goods goods) {
        
        return null;
    }

    @RequestMapping(value = "/showAllGoodsCate")
    public ModelAndView showAllGoodsCate(
            @ModelAttribute("goodsCatePagination") GoodsCatePagination goodsCatePagination) {
        ModelAndView model = new ModelAndView();
        List<GoodsCate> goodsCates = goodsService.findAllGoodsCate(goodsCatePagination);
        model.addObject("goodsCates", goodsCates);
        model.addObject("pagination", goodsCatePagination);
        model.setViewName("/business/goods/cate/list");
        return model;
    }

    @RequestMapping(value = "/goToAddGoodsCate")
    public String goToGoodsCate() {
        return "/business/goods/cate/create";
    }

    @RequestMapping(value = "/addGoodsCate")
    public ModelAndView addGoodsCate(@ModelAttribute("goodsCate") GoodsCate goodsCate, HttpSession session) {
        ModelAndView model = new ModelAndView();
        if (goodsService.addGoodsCate(goodsCate)) {
            session.setAttribute("msg", "add success");
            model.setViewName("redirect:/Business/showAllGoodsCate");
        } else {
            model.addObject("errMsg", "add fail");
            model.setViewName("/business/goods/cate/create");
        }
        return model;
    }

    @RequestMapping(value = "/goToModifyGoodsCate")
    public ModelAndView goToModifyGoodsCate(@RequestParam(value = "id", defaultValue = "-1") int id) {
        ModelAndView model = new ModelAndView();
        GoodsCate goodsCate = goodsService.getGoodsCateById(id);
        if (goodsCate != null) {
            model.addObject("goodsCate", goodsCate);
            model.setViewName("/business/goods/cate/modify");
        } else {
            model.setViewName("redirect:/Business/showAllGoodsCate");
        }
        return model;
    }

    @RequestMapping(value = "/modifyGoodsCate")
    public ModelAndView modifyGoodsCate(@ModelAttribute("goodsCate") GoodsCate goodsCate, HttpSession session) {
        ModelAndView model = new ModelAndView();
        if (goodsService.addGoodsCate(goodsCate)) {
            session.setAttribute("msg", "modify success");
            model.setViewName("redirect:/Business/showAllGoodsCate");
        } else {
            model.addObject("id", goodsCate.getId());
            model.setViewName("redirect:/Bussiness/goToModifyGoodsCate");
        }
        return model;
    }

    @RequestMapping(value = "/showAllGoodsOrder")
    public ModelAndView showAllGoodsOrder(GoodsOrderPagination goodsOrderPagination) {
        ModelAndView model = new ModelAndView();
        try {
            List<GoodsOrder> goodsOrders = goodsService.findAllGoodsOrder(goodsOrderPagination);
            model.addObject("goodsOrders", goodsOrders);
            model.setViewName("/business/goods/order/list");
        } catch (ParseException e) {
            e.printStackTrace();
            model.addObject("msg", "时间转换出问题");
            model.setViewName("/business/goods/order/list");
        }
        return model;
    }

    @RequestMapping(value = "/exportProject")
    public void exportProject(HttpServletResponse response) {
        List<GoodsOrderVo> goodsOrderVos;
        try {
            goodsOrderVos = goodsService.findAllGoodsOrder();
            String[] excelHeader = { "编号#id", "订单号#orderSn", "商品名称#goodsName", "用户名#userName", "所需积分#score",
                    "兑换时间#exTime", "发货时间#deliveryTime", "订单状态#orderStatus", "是否配送#isDelivery" };
            ExportExcelUtil.export(response, "Test", excelHeader, goodsOrderVos);
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/goToModifyGoodsOrder")
    public ModelAndView goToModifyGoodsOrder(@RequestParam(value = "id", defaultValue = "-1") int id) {
        ModelAndView model = new ModelAndView();
        GoodsOrder goodsOrder = goodsService.getGoodsOrderById(id);

        if (goodsOrder != null) {
            model.addObject("goodsOrder", goodsOrder);
            model.setViewName("/business/goods/order/modify");
        } else {
            model.addObject("currentPage", 1);
            model.addObject("beginTime", "");
            model.addObject("endTime", "");
            model.setViewName("redirect:/Business/showAllGoodsOrder");
        }
        return model;
    }

    // Nav

    @RequestMapping(value = "/showAllNav")
    public ModelAndView showAllNav(NavPagination navPagination) {
        ModelAndView model = new ModelAndView();
        List<Nav> navs = frontendService.findAllNav(navPagination);
        model.addObject("navs", navs);
        model.setViewName("/business/frontend/nav/list");
        return model;
    }

    @RequestMapping(value = "/goToAddNav")
    public String goToAddNav() {
        return "/business/frontend/nav/create";
    }

    @RequestMapping(value = "/addNav")
    public ModelAndView addNav(Nav nav, HttpSession session) {
        ModelAndView model = new ModelAndView();
        if (frontendService.addNav(nav)) {
            session.setAttribute("msg", "add success");
            model.addObject("name", "");
            model.addObject("currentPage", 1);
            model.setViewName("redirect:/Business/showAllNav");
        } else {
            model.addObject("msg", "add fail");
            model.setViewName("/business/frontend/nav/create");
        }
        return model;
    }

    @RequestMapping(value = "/goToModifyNav")
    public ModelAndView goToModifyNav(@RequestParam(value = "id", defaultValue = "-1") int id) {
        ModelAndView model = new ModelAndView();
        Nav nav = frontendService.getNavById(id);
        if (nav != null) {
            model.addObject("nav", nav);
            model.setViewName("/business/frontend/nav/modify");
        } else {
            model.addObject("name", "");
            model.addObject("currentPage", 1);
            model.setViewName("redirect:/Business/showAllNav");
        }
        return model;
    }

    @RequestMapping(value = "/modifyNav")
    public ModelAndView modifyNav(Nav nav, HttpSession session) {
        ModelAndView model = new ModelAndView();
        if (frontendService.modifyNav(nav)) {
            session.setAttribute("msg", "modify success");
            model.addObject("name", "");
            model.addObject("currentPage", 1);
            model.setViewName("/redirect:/Business/showAllNav");
        } else {
            model.addObject("msg", "modify fail");
            model.setViewName("/business/frontend/nav/modify");
        }
        return model;
    }

    // adv

    @RequestMapping(value = "/showAllAdv")
    public ModelAndView showAllAdv(AdvPagination advPagination) {
        ModelAndView model = new ModelAndView();
        List<Adv> advs = frontendService.findAllAdv(advPagination);
        model.addObject("advs", advs);
        model.setViewName("/business/frontend/adv/list");
        return model;
    }

    @RequestMapping(value = "/goToModifyAdv")
    public ModelAndView goToModifyAdv(@RequestParam(value = "id", defaultValue = "-1") int id) {
        ModelAndView model = new ModelAndView();
        Adv adv = frontendService.getAdvById(id);
        if (adv != null) {
            model.addObject("adv", adv);
            model.setViewName("/business/frontend/adv/modify");
        } else {
            model.addObject("msg", "not have the adv");
            model.setViewName("/business/frontend/adv/list");
        }
        return model;
    }

    @RequestMapping(value = "/modifyAdv")
    public ModelAndView modifyAdv(Adv adv, HttpSession session) {
        ModelAndView model = new ModelAndView();
        if (frontendService.modifyAdv(adv)) {
            session.setAttribute("msg", "modify success!");
            model.addObject("name", "");
            model.addObject("currentPage", 1);
            model.setViewName("redirect:/Business/showAllAdv");
        } else {
            model.addObject("msg", "modify fail");
            model.setViewName("/business/frontend/adv/modify");
        }
        return model;
    }

    @RequestMapping(value = "/goToAddAdv")
    public String goToAddAdv() {
        return "/business/frontend/adv/create";
    }

    @RequestMapping(value = "/addAdv")
    public ModelAndView addAdv(Adv adv, HttpSession session) {
        ModelAndView model = new ModelAndView();
        if (frontendService.addAdv(adv)) {
            session.setAttribute("msg", "Add success");
            model.addObject("name", "");
            model.addObject("currentPage", 1);
            model.setViewName("redirect:/Business/showAllAdv");
        } else {
            model.addObject("addMsg", "Add fail");
            model.setViewName("/business/frontend/adv/create");
        }
        return model;
    }

    // deal
    @RequestMapping(value = "/showAllDeal")
    public ModelAndView showAllDeal(DealPagination dealPagination) {
        ModelAndView model = new ModelAndView();
        List<Deal> deals = dealService.findAllDeal(dealPagination);
        List<DealCate> dealCates = dealService.findAllDealCate();
        List<DealMappingMsg> mappingMsgs = dealService.findDealMappingMsg(deals);
        model.addObject("deals", deals);
        model.addObject("dealCates", dealCates);
        model.addObject("pagination", dealPagination);
        model.addObject("mappingMsgs", mappingMsgs);
        model.setViewName("/business/deal/list");
        return model;
    }
    
    @RequestMapping(value = "/goToAddDeal")
    public String goToAddDeal() {
        return "/business/deal/create";
    }
    
    @RequestMapping(value = "/addDeal")
    public ModelAndView addAdv(Deal deal, HttpSession session) {
        ModelAndView model = new ModelAndView();
        if (dealService.addDeal(deal)) {
            session.setAttribute("msg", "Add success");
            model.setViewName("redirect:/Business/showAllDeal");
        } else {
            model.addObject("addMsg", "Add fail");
            model.setViewName("/business/showAllDeal");
        }
        return model;
    }
    
    @RequestMapping(value = "/goToModifyDeal")
    public ModelAndView goToModifyDeal(@RequestParam(value = "id", defaultValue = "-1") int id) {
        ModelAndView model = new ModelAndView();
        model.addObject("test", id);
        model.setViewName("/business/deal/modify");
        return model;
    }
    
    // ==============================

    
    
    // userbank

    @RequestMapping(value = "/showAllUserBank")
    public ModelAndView showAllUserBank(UserBankPagination userBankPagination) {
        ModelAndView model = new ModelAndView();
        List<UserBankVo> userBanks = userService.findAllUserBank(userBankPagination);
        model.addObject("userBanks", userBanks);
        model.addObject("pagination", userBankPagination);
        model.setViewName("/business/user/bank/list");
        return model;
    }
    // 使用ajax请求 接受json对象
    /*
     * @RequestMapping(value = "/deleteUserBank") public ModelAndView
     * deleteUserBank(List<Integer> ids) { ModelAndView model = new
     * ModelAndView(); if (userService.deleteUserBankById(ids)) {
     * 
     * } }
     */

    // ecv

    @RequestMapping(value = "/showAllEcvType")
    public ModelAndView showAllEcvType(EcvTypePagination ecvTypePagination) {
        ModelAndView model = new ModelAndView();
        List<EcvType> ecvTypes = userService.findAllEcvType(ecvTypePagination);
        model.addObject("ecvTypes", ecvTypes);
        model.addObject("pagination", ecvTypePagination);
        model.setViewName("/business/user/ecv/typeList");
        return model;
    }

    @RequestMapping(value = "/goToModifyEcvType")
    public ModelAndView goToModifyEcvType(@RequestParam(value = "id", defaultValue = "-1") int id) {
        ModelAndView model = new ModelAndView();
        EcvType ecvType = userService.getEcvTypeById(id);
        if (ecvType != null) {
            model.addObject("ecvType", ecvType);
            model.setViewName("/business/user/ecv/typeModify");
        } else {
            model.addObject("msg", "not have the ecv type");
            model.setViewName("/business/user/ecv/typeList");
        }
        return model;
    }

    @RequestMapping(value = "/modifyEcvType")
    public ModelAndView modifyEcvType(EcvType ecvType, HttpSession session) {
        ModelAndView model = new ModelAndView();
        if (userService.modifyEcvType(ecvType)) {
            session.setAttribute("msg", "modify success");
            model.setViewName("redirect:/Business/showAllEcvType");
        } else {
            model.addObject("msg", "add fail");
            model.setViewName("/business/user/ecv/typeModify");
        }
        return model;
    }

    @RequestMapping(value = "/goToAddEcvType")
    public String goToAddEcvType() {
        return "/business/user/ecv/typeCreate";
    }

    @RequestMapping(value = "/addEcvType")
    public ModelAndView addEcvType(EcvType ecvType, HttpSession session) {
        ModelAndView model = new ModelAndView();
        if (userService.addEcvType(ecvType)) {
            session.setAttribute("msg", "add success");
            model.setViewName("redirect:/Business/showAllEcvType");
        } else {
            model.addObject("msg", "add fail");
            model.setViewName("/business/user/ecv/typeCreate");
        }
        return model;
    }

    @RequestMapping(value = "/grantEcv")
    public ModelAndView grantEcv(@RequestParam(value = "ecvTypeId", defaultValue = "-1") int ecvTypeId,
            @RequestParam(value = "ids", defaultValue = "") String ids,
            @RequestParam(value = "grantType", defaultValue = "0") int grantType,
            @RequestParam(value = "isCreatePassword", defaultValue = "false") boolean isCreatePassword,
            HttpSession session) {
        ModelAndView model = new ModelAndView();
        if (userService.createEcv(ecvTypeId, ids, grantType, isCreatePassword)) {
            session.setAttribute("msg", "send success");
            model.setViewName("redirect:/Business/showAllEcvType");
        } else {
            model.addObject("msg", "send fail");
            model.setViewName("/business/user/ecv/typeList");
        }
        return model;
    }

    @RequestMapping(value = "/showAllEcv")
    public ModelAndView showAllEcv(EcvPagination ecvPagination) {
        ModelAndView model = new ModelAndView();
        List<Ecv> ecvs = userService.findAllEcv(ecvPagination);
        model.addObject("ecvs", ecvs);
        model.setViewName("/business/user/ecv/list");
        return model;
    }

    @RequestMapping(value = "/showAllMsgSystem")
    public ModelAndView showAllMsgSystem(MsgSystemPagination msgSystemPagination) {
        ModelAndView model = new ModelAndView();
        List<MsgSystem> msgSystems = userService.findAllMsgSystem(msgSystemPagination);
        model.addObject("msgSystems", msgSystems);
        model.addObject("pagination", msgSystemPagination);
        model.setViewName("/business/user/msg/systemList");
        return model;
    }

    @RequestMapping(value = "/goToModifyMsgSystem")
    public ModelAndView goToModifyMsgSystem(@RequestParam(value = "id", defaultValue = "-1") int id) {
        ModelAndView model = new ModelAndView();
        MsgSystem msgSystem = userService.getMsgSystemById(id);
        if (msgSystem != null) {
            model.addObject("msgSystem", msgSystem);
            model.setViewName("/business/user/msg/systemModify");
        } else {
            model.addObject("msg", "not have the msgSystem");
            model.setViewName("/business/user/msg/systemList");
        }
        return model;
    }

    @RequestMapping(value = "/modifyMsgSystem")
    public ModelAndView modifyMsgSystem(MsgSystem msgSystem, HttpSession session) {
        ModelAndView model = new ModelAndView();
        if (userService.modifyMsgSystem(msgSystem)) {
            session.setAttribute("msg", "modify success");
            model.setViewName("redirect:/Business/showAllMsgSystem");
        } else {
            model.addObject("msg", "modify fail");
            model.setViewName("/business/user/msg/systemModify");
        }
        return model;
    }

    @RequestMapping(value = "/goToAddMsgSystem")
    public String goToAddMsgSystem() {
        return "/business/user/msg/systemCreate";
    }

    @RequestMapping(value = "/addMsgSystem")
    public ModelAndView addMsgSystem(MsgSystem msgSystem, HttpSession session) {
        ModelAndView model = new ModelAndView();
        if (userService.addMsgSystem(msgSystem)) {
            session.setAttribute("msg", "add success");
            model.setViewName("redirect:/Business/showAllMsgSystem");
        } else {
            model.addObject("addMsg", "add fial");
            model.setViewName("/business/user/msg/systemCreate");
        }
        return model;
    }
    
    @RequestMapping(value = "/systemSetUp")
    public ModelAndView systemSetUp(MAdvPagination mAdvPagination) {
        ModelAndView model = new ModelAndView();
        List<MAdv> mAdvs = systemSetUpServiceImpl.findAllMAdv(mAdvPagination);
        model.addObject("mAdvs", mAdvs);
        model.addObject("pagination", mAdvPagination);
        model.setViewName("/business/systemSetUp/mAdvList");
        return model;
    }
}
