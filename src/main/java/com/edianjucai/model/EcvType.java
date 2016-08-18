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
@Table(name = "edian_ecv_type")
public class EcvType implements Serializable{

    private static final long serialVersionUID = 7246936882228128859L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "money")
    private BigDecimal money;
    @Column(name = "use_limit")
    private int useLimit;
    @Column(name = "begin_time")
    private long beginTime;
    @Column(name = "end_time")
    private long endTime;
    @Column(name = "gen_count")
    private int genCount;
    @Column(name = "send_type")
    private int sendType;
    @Column(name = "exchange_score")
    private int exchangScore;
    @Column(name = "exchange_limit")
    private int exchangeLimit;
    @Column(name = "exchange_sn")
    private String exchangeSn;

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

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public int getUseLimit() {
        return useLimit;
    }

    public void setUseLimit(int useLimit) {
        this.useLimit = useLimit;
    }

    public long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(long beginTime) {
        this.beginTime = beginTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public int getGenCount() {
        return genCount;
    }

    public void setGenCount(int genCount) {
        this.genCount = genCount;
    }

    public int getSendType() {
        return sendType;
    }

    public void setSendType(int sendType) {
        this.sendType = sendType;
    }

    public int getExchangScore() {
        return exchangScore;
    }

    public void setExchangScore(int exchangScore) {
        this.exchangScore = exchangScore;
    }

    public int getExchangeLimit() {
        return exchangeLimit;
    }

    public void setExchangeLimit(int exchangeLimit) {
        this.exchangeLimit = exchangeLimit;
    }

    public String getExchangeSn() {
        return exchangeSn;
    }

    public void setExchangeSn(String exchangeSn) {
        this.exchangeSn = exchangeSn;
    }

}
