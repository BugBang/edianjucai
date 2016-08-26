package com.edianjucai.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edianjucai.dao.GoodsDao;
import com.edianjucai.dao.UserDao;
import com.edianjucai.model.Goods;
import com.edianjucai.model.GoodsCate;
import com.edianjucai.model.GoodsOrder;
import com.edianjucai.model.GoodsType;
import com.edianjucai.model.vo.GoodsOrderVo;
import com.edianjucai.model.vo.GoodsVo;
import com.edianjucai.page.GoodsCatePagination;
import com.edianjucai.page.GoodsOrderPagination;
import com.edianjucai.page.GoodsPagination;
import com.edianjucai.util.DateFormatUtils;

@Service
public class GoodsServiceImpl {

    @Autowired
    private GoodsDao goodsDao;
    @Autowired
    private UserDao userDao;

    @Transactional
    public List<GoodsVo> findAllGoods(GoodsPagination goodsPagination) {
        goodsPagination.setTotalCount(goodsDao.getGoodsCount(goodsPagination));
        List<Goods> goods = goodsDao.findAllGoods(goodsPagination);
        List<GoodsVo> goodsVos = new ArrayList<>();
        for (Goods good : goods) {
            goodsVos.add(poToVo(good));
        }
        return goodsVos;
    }

    @Transactional
    public GoodsVo getGoodsById(int id) {
        Goods goods = goodsDao.getGoodsById(id);
        if (goods != null) {
            return poToVo(goods);
        } else {
            return null;
        }
    }

    @Transactional
    public boolean addGoods(Goods goods) {
        if (goodsDao.addGoods(goods)) {
            return true;
        } else {
            return false;
        }
    }

    @Transactional
    public boolean modifyGoods(Goods goods) {
        if (goodsDao.modifyGoods(goods)) {
            return true;
        } else {
            return false;
        }
    }

    // goods cate

    @Transactional
    public List<GoodsCate> findAllGoodsCate(GoodsCatePagination goodsCatePagination) {
        goodsCatePagination.setTotalCount(goodsDao.getGoodsCateCount(goodsCatePagination));
        List<GoodsCate> goodsCates = goodsDao.findAllGoodsCate(goodsCatePagination);
        return goodsCates;
    }
    
    @Transactional
    public List<GoodsCate> findAllGoodsCate() {
        return goodsDao.findAllGoodsCate();
    }

    @Transactional
    public GoodsCate getGoodsCateById(int id) {
        GoodsCate goodsCate = goodsDao.getGoodsCateById(id);
        if (goodsCate != null) {
            return goodsCate;
        } else {
            return null;
        }
    }

    @Transactional
    public boolean addGoodsCate(GoodsCate goodsCate) {
        if (goodsDao.addGoodsCate(goodsCate)) {
            return true;
        } else {
            return false;
        }
    }

    @Transactional
    public boolean modifyGoodsCate(GoodsCate GoodsCate) {
        if (goodsDao.modifyGoodsCate(GoodsCate)) {
            return true;
        } else {
            return false;
        }
    }

    // goods order

    @Transactional
    public List<GoodsOrderVo> findAllGoodsOrder(GoodsOrderPagination goodsOrderPagination) throws ParseException {
        List<GoodsOrderVo> govos = new ArrayList<>();
        goodsOrderPagination.setTotalCount(goodsDao.getGoodsOrderCount(goodsOrderPagination));
        List<GoodsOrder> gopos = goodsDao.findAllGoodsOrder(goodsOrderPagination);
        for (GoodsOrder gopo : gopos) {
            govos.add(poToVo(gopo));
        }
        return govos;
    }

    @Transactional
    public List<GoodsOrderVo> findAllGoodsOrder() {
        List<GoodsOrderVo> govos = new ArrayList<>();
        List<GoodsOrder> gopos = goodsDao.findAllGoodsOrder();

        for (GoodsOrder gopo : gopos) {
            govos.add(poToVo(gopo));
        }

        return govos;
    }

    @Transactional
    public GoodsOrder getGoodsOrderById(int id) {
        GoodsOrder goodsOrder = goodsDao.getGoodsOrderById(id);

        if (goodsOrder != null) {
            return goodsOrder;
        } else {
            return null;
        }
    }

    @Transactional
    public boolean modifyGoodsOrder(GoodsOrder goodsOrder) {
        if (goodsDao.modifyGoodsOrder(goodsOrder)) {
            return true;
        } else {
            return false;
        }
    }

    @Transactional
    private GoodsVo poToVo(Goods gopo) {
        GoodsVo govo = new GoodsVo();
        govo.setId(gopo.getId());
        govo.setName(gopo.getName());
        govo.setSubName(gopo.getSubName());
        govo.setCateid(gopo.getCateId());
        govo.setCateName(goodsDao.getGoodsCateById(gopo.getCateId()).getName());
        govo.setImg(gopo.getImg());
        govo.setBrief(gopo.getBrief());
        govo.setDescription(gopo.getDescription());
        govo.setSort(gopo.getSort());
        govo.setMaxBought(gopo.getMaxBought());
        if (gopo.getIsDelivery() == 0) {
            govo.setIsDelivery("否");
        }
        
        if (gopo.getIsDelivery() == 1) {
            govo.setIsDelivery("是");
        }
        
        if (gopo.getIsHot() == 1) {
            govo.setIsHot("热卖");
        } else {
            govo.setIsHot("");
        }
        
        if (gopo.getIsNew() == 1) {
            govo.setIsNew("新品");
        } else {
            govo.setIsNew("");
        }
        
        govo.setScore(gopo.getScore());
        
        if (gopo.getIsRecommend() == 1) {
            govo.setIsRecommend("推荐");
        } else {
            govo.setIsRecommend("");
        }
        
        govo.setSeoDescription(gopo.getSeoDescription());
        govo.setSeoTitle(gopo.getSeoTitle());
        govo.setSeoKeyword(gopo.getSeoKeyword());
        govo.setGoodsTypeId(gopo.getGoodsTypeId());
        govo.setGoodsTypeName(goodsDao.getGoodsTypeById(gopo.getGoodsTypeId()) != null ? goodsDao.getGoodsTypeById(gopo.getGoodsTypeId()).getName() : "");
        govo.setInventedNumber(gopo.getInventedNumber());
        govo.setBuyNumber(gopo.getBuyNumber());
        govo.setMoney(gopo.getMoney());
        govo.setUrl(gopo.getUrl());

        return govo;
    }
    @Transactional
    private GoodsOrderVo poToVo(GoodsOrder gopo) {
        GoodsOrderVo govo = new GoodsOrderVo();
        govo.setId(gopo.getId());
        govo.setOrderSn(gopo.getOrderSn());
        govo.setGoodsId(gopo.getGoodsId());
        govo.setGoodsName(gopo.getGoodsName());
        govo.setScore(gopo.getScore());
        govo.setTotalScore(gopo.getTotalScore());
        govo.setNumber(gopo.getNumber());
        govo.setDeliverSn(gopo.getDeliverSn());

        switch (gopo.getOrderStatus()) {
        case 0:
        govo.setOrderStatus("未发货");
            break;
        case 1:
        govo.setOrderStatus("已发货 ");
            break;
        case 2:
        govo.setOrderStatus("无效订单");
            break;
        case 3:
        govo.setOrderStatus("用户删除");
            break;
        default:
            break;
        }

        govo.setUserName(userDao.getUserById(gopo.getUserId()) != null
                ? userDao.getUserById(gopo.getUserId()).getUserName() : "没有该会员");
        Date exTime = new Date();
        exTime.setTime(gopo.getExTime() * 1000);
        govo.setExTime(DateFormatUtils.dateToString(exTime));
        govo.setExDate(gopo.getExDate());
        Date deliveryTime = new Date();
        deliveryTime.setTime(gopo.getDeliveryTime() * 1000);
        govo.setDeliveryTime(DateFormatUtils.dateToString(deliveryTime));
        govo.setDeliveryDate(gopo.getDeliveryDate());
        govo.setDeliveryAddr(gopo.getDeliveryAddr());
        govo.setDeliveryTel(gopo.getDeliveryTel());
        govo.setDeliveryName(gopo.getDeliveryName());
        
        if (gopo.getIsDelivery() == 1) {
            govo.setIsDelivery("是");
        } else {
            govo.setIsDelivery("否");
        }

        govo.setAttrStockId(gopo.getAttrStockId());
        govo.setAttr(gopo.getAttr());
        govo.setDeliveryExpress(gopo.getDeliveryExpress());
        govo.setMemo(gopo.getMemo());

        return govo;
    }
    
    //goods type
    
    @Transactional
    public List<GoodsType> findAllGoodsType() {
        return goodsDao.findAllGoodsType();
    }
}
