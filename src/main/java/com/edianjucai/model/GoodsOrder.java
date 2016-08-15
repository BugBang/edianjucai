package com.edianjucai.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "edian_goods_order")
public class GoodsOrder implements Serializable{

    private static final long serialVersionUID = 6068604301701928081L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "order_sn")
    private String orderSn;
    @Column(name = "goods_id")
    private int goodsId;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "score")
    private int score;
    @Column(name = "total_score")
    private int totalScore;
    @Column(name = "number")
    private int number;
    @Column(name = "delivery_sn")
    private String deliverSn;
    @Column(name = "order_status")
    private int orderStatus;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "ex_time")
    private long exTime;
    @Column(name = "ex_date")
    private Date exDate;
    @Column(name = "delivery_time")
    private long deliveryTime;
    @Column(name = "delivery_date")
    private Date deliveryDate;
    @Column(name = "delivery_addr")
    private String deliveryAddr;
    @Column(name = "delivery_tel")
    private String deliveryTel;
    @Column(name = "delivery_name")
    private String deliveryName;
    @Column(name = "is_delivery")
    private int isDelivery;
    @Column(name = "attr_stock_id")
    private int attrStockId;
    @Column(name = "attr")
    private String attr;
    @Column(name = "delivery_express")
    private String deliveryExpress;
    @Column(name = "memo")
    private String memo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDeliverSn() {
        return deliverSn;
    }

    public void setDeliverSn(String deliverSn) {
        this.deliverSn = deliverSn;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public long getExTime() {
        return exTime;
    }

    public void setExTime(long exTime) {
        this.exTime = exTime;
    }

    public Date getExDate() {
        return exDate;
    }

    public void setExDate(Date exDate) {
        this.exDate = exDate;
    }

    public long getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(long deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryAddr() {
        return deliveryAddr;
    }

    public void setDeliveryAddr(String deliveryAddr) {
        this.deliveryAddr = deliveryAddr;
    }

    public String getDeliveryTel() {
        return deliveryTel;
    }

    public void setDeliveryTel(String deliveryTel) {
        this.deliveryTel = deliveryTel;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public int getIsDelivery() {
        return isDelivery;
    }

    public void setIsDelivery(int isDelivery) {
        this.isDelivery = isDelivery;
    }

    public int getAttrStockId() {
        return attrStockId;
    }

    public void setAttrStockId(int attrStockId) {
        this.attrStockId = attrStockId;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public String getDeliveryExpress() {
        return deliveryExpress;
    }

    public void setDeliveryExpress(String deliveryExpress) {
        this.deliveryExpress = deliveryExpress;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

}
