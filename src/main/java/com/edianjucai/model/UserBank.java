package com.edianjucai.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "edian_user_bank")
public class UserBank implements Serializable{

    private static final long serialVersionUID = 7282933771304870488L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "bank_id")
    private int bankId;
    @Column(name = "bankcard")
    private String bankCard;
    @Column(name = "real_name")
    private String realName;
    @Column(name = "region_lv1")
    private Integer regionLv1;
    @Column(name = "region_lv2")
    private Integer regionLv2;
    @Column(name = "region_lv3")
    private Integer regionLv3;
    @Column(name = "region_v4")
    private Integer regionLv4;
    @Column(name = "bankzone")
    private String bankZone;
    @Column(name = "mobile")
    private String mobile;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getBankId() {
        return bankId;
    }
    public void setBankId(int bankId) {
        this.bankId = bankId;
    }
    public String getBankCard() {
        return bankCard;
    }
    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }
    public String getRealName() {
        return realName;
    }
    public void setRealName(String realName) {
        this.realName = realName;
    }
    public Integer getRegionLv1() {
        return regionLv1;
    }
    public void setRegionLv1(Integer regionLv1) {
        this.regionLv1 = regionLv1;
    }
    public Integer getRegionLv2() {
        return regionLv2;
    }
    public void setRegionLv2(Integer regionLv2) {
        this.regionLv2 = regionLv2;
    }
    public Integer getRegionLv3() {
        return regionLv3;
    }
    public void setRegionLv3(Integer regionLv3) {
        this.regionLv3 = regionLv3;
    }
    public Integer getRegionLv4() {
        return regionLv4;
    }
    public void setRegionLv4(Integer regionLv4) {
        this.regionLv4 = regionLv4;
    }
    public String getBankZone() {
        return bankZone;
    }
    public void setBankZone(String bankZone) {
        this.bankZone = bankZone;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

   
}
