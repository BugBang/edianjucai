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
@Table(name = "edian_ecv")
public class Ecv implements Serializable {

    private static final long serialVersionUID = -7089934843906458774L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "sn")
    private String sn;
    @Column(name = "password")
    private String password;
    @Column(name = "use_limit")
    private int useLimit;
    @Column(name = "use_count")
    private int useCount;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "begin_time")
    private long beginTime;
    @Column(name = "end_time")
    private long endTime;
    @Column(name = "money")
    private BigDecimal money;
    @Column(name = "ecv_type_id")
    private int ecvTypeId;

    public Ecv() {
    }

    public Ecv(String sn, String password, int useLimit, int useCount, int userId, long beginTime, long endTime,
            BigDecimal money, int ecvTypeId) {
        this.sn = sn;
        this.password = password;
        this.useLimit = useLimit;
        this.useCount = useCount;
        this.userId = userId;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.money = money;
        this.ecvTypeId = ecvTypeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUseLimit() {
        return useLimit;
    }

    public void setUseLimit(int useLimit) {
        this.useLimit = useLimit;
    }

    public int getUseCount() {
        return useCount;
    }

    public void setUseCount(int useCount) {
        this.useCount = useCount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public int getEcvTypeId() {
        return ecvTypeId;
    }

    public void setEcvTypeId(int ecvTypeId) {
        this.ecvTypeId = ecvTypeId;
    }

}
