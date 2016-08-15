package com.edianjucai.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "edian_deal_repay")
public class DealRepay {
    
    @Id
    private int id;
    @Column(name = "deal_id")
    private int dealId;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "repay_money")
    private BigDecimal repayMoney;
    @Column(name = "manage_money")
    private BigDecimal manageMoney;
    @Column(name = "impose_money")
    private BigDecimal imposeMoney;
    @Column(name = "repay_time")
    private long repayTime;
    @Column(name = "true_repay_time")
    private long trueRepayTime;
    @Column(name = "status")
    private int status;
    @Column(name = "l_key")
    private int lKey;
    @Column(name = "has_repay")
    private int hasRepay;
    @Column(name = "manage_impose_money")
    private BigDecimal manageImposeMoney;
    @Column(name = "is_site_bad")
    private int isSiteBad;
    @Column(name = "repay_date")
    private Date repayDate;
    @Column(name = "true_repay_date")
    private Date trueRepayDate;
    @Column(name = "true_repay_money")
    private double trueRepayMoney;
    @Column(name = "true_self_money")
    private BigDecimal trueSelfMoney;
    @Column(name = "interest_money")
    private BigDecimal interestMoney;
    @Column(name = "true_interest_money")
    private BigDecimal trueInterestMoney;
    @Column(name = "true_manage_money")
    private BigDecimal trueManageMoney;
    @Column(name = "self_money")
    private BigDecimal selfMoney;
    @Column(name = "loantype")
    private int loanType;
    @Column(name = "manage_money_rebate")
    private BigDecimal manageMoneyRebate;
    @Column(name = "true_manage_money_rebate")
    private BigDecimal trueManageMoneyRebate;
    @Column(name = "get_manage")
    private int getManage;
    @Column(name = "mortgage_fee")
    private BigDecimal mortgageFee;
    @Column(name = "true_mortgage_fee")
    private BigDecimal trueMortgageFee;
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
    public BigDecimal getRepayMoney() {
        return repayMoney;
    }
    public void setRepayMoney(BigDecimal repayMoney) {
        this.repayMoney = repayMoney;
    }
    public BigDecimal getManageMoney() {
        return manageMoney;
    }
    public void setManageMoney(BigDecimal manageMoney) {
        this.manageMoney = manageMoney;
    }
    public BigDecimal getImposeMoney() {
        return imposeMoney;
    }
    public void setImposeMoney(BigDecimal imposeMoney) {
        this.imposeMoney = imposeMoney;
    }
    public long getRepayTime() {
        return repayTime;
    }
    public void setRepayTime(long repayTime) {
        this.repayTime = repayTime;
    }
    public long getTrueRepayTime() {
        return trueRepayTime;
    }
    public void setTrueRepayTime(long trueRepayTime) {
        this.trueRepayTime = trueRepayTime;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public int getlKey() {
        return lKey;
    }
    public void setlKey(int lKey) {
        this.lKey = lKey;
    }
    public int getHasRepay() {
        return hasRepay;
    }
    public void setHasRepay(int hasRepay) {
        this.hasRepay = hasRepay;
    }
    public BigDecimal getManageImposeMoney() {
        return manageImposeMoney;
    }
    public void setManageImposeMoney(BigDecimal manageImposeMoney) {
        this.manageImposeMoney = manageImposeMoney;
    }
    public int getIsSiteBad() {
        return isSiteBad;
    }
    public void setIsSiteBad(int isSiteBad) {
        this.isSiteBad = isSiteBad;
    }
    public Date getRepayDate() {
        return repayDate;
    }
    public void setRepayDate(Date repayDate) {
        this.repayDate = repayDate;
    }
    public Date getTrueRepayDate() {
        return trueRepayDate;
    }
    public void setTrueRepayDate(Date trueRepayDate) {
        this.trueRepayDate = trueRepayDate;
    }
    public double getTrueRepayMoney() {
        return trueRepayMoney;
    }
    public void setTrueRepayMoney(double trueRepayMoney) {
        this.trueRepayMoney = trueRepayMoney;
    }
    public BigDecimal getTrueSelfMoney() {
        return trueSelfMoney;
    }
    public void setTrueSelfMoney(BigDecimal trueSelfMoney) {
        this.trueSelfMoney = trueSelfMoney;
    }
    public BigDecimal getInterestMoney() {
        return interestMoney;
    }
    public void setInterestMoney(BigDecimal interestMoney) {
        this.interestMoney = interestMoney;
    }
    public BigDecimal getTrueInterestMoney() {
        return trueInterestMoney;
    }
    public void setTrueInterestMoney(BigDecimal trueInterestMoney) {
        this.trueInterestMoney = trueInterestMoney;
    }
    public BigDecimal getTrueManageMoney() {
        return trueManageMoney;
    }
    public void setTrueManageMoney(BigDecimal trueManageMoney) {
        this.trueManageMoney = trueManageMoney;
    }
    public BigDecimal getSelfMoney() {
        return selfMoney;
    }
    public void setSelfMoney(BigDecimal selfMoney) {
        this.selfMoney = selfMoney;
    }
    public int getLoanType() {
        return loanType;
    }
    public void setLoanType(int loanType) {
        this.loanType = loanType;
    }
    public BigDecimal getManageMoneyRebate() {
        return manageMoneyRebate;
    }
    public void setManageMoneyRebate(BigDecimal manageMoneyRebate) {
        this.manageMoneyRebate = manageMoneyRebate;
    }
    public BigDecimal getTrueManageMoneyRebate() {
        return trueManageMoneyRebate;
    }
    public void setTrueManageMoneyRebate(BigDecimal trueManageMoneyRebate) {
        this.trueManageMoneyRebate = trueManageMoneyRebate;
    }
    public int getGetManage() {
        return getManage;
    }
    public void setGetManage(int getManage) {
        this.getManage = getManage;
    }
    public BigDecimal getMortgageFee() {
        return mortgageFee;
    }
    public void setMortgageFee(BigDecimal mortgageFee) {
        this.mortgageFee = mortgageFee;
    }
    public BigDecimal getTrueMortgageFee() {
        return trueMortgageFee;
    }
    public void setTrueMortgageFee(BigDecimal trueMortgageFee) {
        this.trueMortgageFee = trueMortgageFee;
    }
   
}
