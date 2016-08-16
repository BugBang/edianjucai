package com.edianjucai.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "edian_deal_load")
public class DealLoad implements Serializable {

    private static final long serialVersionUID = -4883608111900044950L;
    @Id
    private int id;
    @Column(name = "deal_id")
    private int dealId;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "money")
    private BigDecimal money;
    @Column(name = "create_time")
    private int createTime;
    @Column(name = "is_repay")
    private int isRepay;
    @Column(name = "is_rebate")
    private int isRebate;
    @Column(name = "is_auto")
    private int isAuto;
    @Column(name = "pP2PBillNo")
    private String pP2PBillNo;
    @Column(name = "pContractNo")
    private String pContractNo;
    @Column(name = "pMerBillNo")
    private String pMerBillNo;
    @Column(name = "is_has_loans")
    private int isHasLoans;
    @Column(name = "msg")
    private String msg;
    @Column(name = "is_old_loan")
    private int isOldLoan;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "rebate_money")
    private BigDecimal rebateMoney;
    @Column(name = "is_winning")
    private int isWinning;
    @Column(name = "income_type")
    private int incomeType;
    @Column(name = "income_value")
    private String incomValue;
    @Column(name = "bid_score")
    private int bidScore;
    @Column(name = "ecv_id")
    private int ecvId;
    @Column(name = "ecv_money")
    private BigDecimal ecvMoney;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDealId() {
        return dealId;
    }

    public void setDealId(int dealId) {
        this.dealId = dealId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public int getIsRepay() {
        return isRepay;
    }

    public void setIsRepay(int isRepay) {
        this.isRepay = isRepay;
    }

    public int getIsRebate() {
        return isRebate;
    }

    public void setIsRebate(int isRebate) {
        this.isRebate = isRebate;
    }

    public int getIsAuto() {
        return isAuto;
    }

    public void setIsAuto(int isAuto) {
        this.isAuto = isAuto;
    }

    public String getpP2PBillNo() {
        return pP2PBillNo;
    }

    public void setpP2PBillNo(String pP2PBillNo) {
        this.pP2PBillNo = pP2PBillNo;
    }

    public String getpContractNo() {
        return pContractNo;
    }

    public void setpContractNo(String pContractNo) {
        this.pContractNo = pContractNo;
    }

    public String getpMerBillNo() {
        return pMerBillNo;
    }

    public void setpMerBillNo(String pMerBillNo) {
        this.pMerBillNo = pMerBillNo;
    }

    public int getIsHasLoans() {
        return isHasLoans;
    }

    public void setIsHasLoans(int isHasLoans) {
        this.isHasLoans = isHasLoans;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getIsOldLoan() {
        return isOldLoan;
    }

    public void setIsOldLoan(int isOldLoan) {
        this.isOldLoan = isOldLoan;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getRebateMoney() {
        return rebateMoney;
    }

    public void setRebateMoney(BigDecimal rebateMoney) {
        this.rebateMoney = rebateMoney;
    }

    public int getIsWinning() {
        return isWinning;
    }

    public void setIsWinning(int isWinning) {
        this.isWinning = isWinning;
    }

    public int getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(int incomeType) {
        this.incomeType = incomeType;
    }

    public String getIncomValue() {
        return incomValue;
    }

    public void setIncomValue(String incomValue) {
        this.incomValue = incomValue;
    }

    public int getBidScore() {
        return bidScore;
    }

    public void setBidScore(int bidScore) {
        this.bidScore = bidScore;
    }

    public int getEcvId() {
        return ecvId;
    }

    public void setEcvId(int ecvId) {
        this.ecvId = ecvId;
    }

    public BigDecimal getEcvMoney() {
        return ecvMoney;
    }

    public void setEcvMoney(BigDecimal ecvMoney) {
        this.ecvMoney = ecvMoney;
    }

}
