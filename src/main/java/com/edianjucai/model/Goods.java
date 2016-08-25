package com.edianjucai.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "edian_goods")
public class Goods implements Serializable{

    private static final long serialVersionUID = 4237199772344014466L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "sub_name")
    private String subName;
    @Column(name = "cate_id")
    private int cateId;
    @Column(name = "img")
    private String img;
    @Column(name = "brief")
    private String brief;
    @Column(name = "description")
    private String description;
    @Column(name = "sort")
    private int sort;
    @Column(name = "max_bought")
    private int maxBought;
    @Column(name = "is_delivery")
    private int isDelivery;
    @Column(name = "is_hot")
    private int isHot;
    @Column(name = "is_new")
    private int isNew;
    @Column(name = "score")
    private int score;
    @Column(name = "is_recommend")
    private int isRecommend;
    @Column(name = "seo_title")
    private String seoTitle;
    @Column(name = "seo_keyword")
    private String seoKeyword;
    @Column(name = "seo_description")
    private String seoDescription;
    @Column(name = "goods_type_id")
    private int goodsTypeId;
    @Column(name = "invented_number")
    private int inventedNumber;
    @Column(name = "buy_number")
    private int buyNumber;
    @Column(name = "money")
    private BigDecimal money;
    @Column(name = "url")
    private String url;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getMaxBought() {
        return maxBought;
    }

    public void setMaxBought(int maxBought) {
        this.maxBought = maxBought;
    }

    public int getIsDelivery() {
        return isDelivery;
    }

    public void setIsDelivery(int isDelivery) {
        this.isDelivery = isDelivery;
    }

    public int getIsHot() {
        return isHot;
    }

    public void setIsHot(int isHot) {
        this.isHot = isHot;
    }

    public int getIsNew() {
        return isNew;
    }

    public void setIsNew(int isNew) {
        this.isNew = isNew;
    }

    public int getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(int isRecommend) {
        this.isRecommend = isRecommend;
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    public String getSeoKeyword() {
        return seoKeyword;
    }

    public void setSeoKeyword(String seoKeyword) {
        this.seoKeyword = seoKeyword;
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    public int getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(int goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public int getInventedNumber() {
        return inventedNumber;
    }

    public void setInventedNumber(int inventedNumber) {
        this.inventedNumber = inventedNumber;
    }

    public int getBuyNumber() {
        return buyNumber;
    }

    public void setBuyNumber(int buyNumber) {
        this.buyNumber = buyNumber;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
