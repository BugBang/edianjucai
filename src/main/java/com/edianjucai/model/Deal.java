package com.edianjucai.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "edian_deal")
public class Deal implements Serializable {

    private static final long serialVersionUID = 6023464305836903361L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "sub_name")
    private String subName;
    @Column(name = "cate_id")
    private int cateId;
    @Column(name = "agency_id")
    private int agencyId;
    @Column(name = "agency_status")
    private int agencyStatus;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "description")
    private String description;
    @Column(name = "is_effect")
    private int isEffect;
    @Column(name = "is_delete")
    private int isDelete;
    @Column(name = "sort")
    private int sort;
    @Column(name = "type_id")
    private int typeId;
    @Column(name = "icon_type")
    private int iconType;
    @Column(name = "icon")
    private String icon;
    @Column(name = "seo_title")
    private String seoTitle;
    @Column(name = "seo_keyword")
    private String seoKeyword;
    @Column(name = "seo_description")
    private String seoDescription;
    @Column(name = "is_hot")
    private int isHot;
    @Column(name = "is_new")
    private int isNew;
    @Column(name = "is_best")
    private int isBest;
    @Column(name = "borrow_amount")
    private BigDecimal borrowAmount;
    @Column(name = "apart_loan_money")
    private BigDecimal apartLoanMoney;
    @Column(name = "repay_time")
    private int repayTime;
    @Column(name = "rate")
    private BigDecimal rate;
    @Column(name = "day")
    private long day;
    @Column(name = "create_time")
    private long createTime;
    @Column(name = "update_time")
    private long updateTime;
    @Column(name = "name_match")
    private String nameMatch;
    @Column(name = "name_match_row")
    private String namMatchRow;
    @Column(name = "deal_cate_match")
    private String dealCateMatch;
    @Column(name = "deal_cate_match_row")
    private String dealCateMatchRow;
    @Column(name = "tag_match")
    private String tagMatch;
    @Column(name = "tag_match_row")
    private String tagMatchRow;
    @Column(name = "type_match")
    private String typeMatch;
    @Column(name = "type_match_row")
    private String typeMatchRow;
    @Column(name = "is_recommend")
    private int isRecommend;
    @Column(name = "buy_count")
    private int buyCount;
    @Column(name = "load_money")
    private BigDecimal loadMoney;
    @Column(name = "repay_money")
    private BigDecimal repayMoney;
    @Column(name = "start_time")
    private long startTime;
    @Column(name = "success_time")
    private long successTime;
    @Column(name = "repay_start_time")
    private long repayStartTime;
    @Column(name = "last_repay_time")
    private long lastRepayTime;
    @Column(name = "next_repay_time")
    private long nextRepayTime;
    @Column(name = "bad_time")
    private long badTime;
    @Column(name = "deal_status")
    private int dealStatus;
    @Column(name = "enddate")
    private long enddate;
    @Column(name = "voffice")
    private int voffice;
    @Column(name = "vposition")
    private int vposition;
    @Column(name = "services_fee")
    private String servicesFee;
    @Column(name = "publish_wait")
    private int publishWait;
    @Column(name = "is_send_bad_msg")
    private int isSendBadMsg;
    @Column(name = "bad_msg")
    private String badMsg;
    @Column(name = "send_half_msg_time")
    private long sendHalfMsgTime;
    @Column(name = "is_send_half_msg")
    private int isSendHalfMsg;
    @Column(name = "is_has_loans")
    private int isHasLoans;
    @Column(name = "loantype")
    private int loantype;
    @Column(name = "warrant")
    private int warrant;
    @Column(name = "titlecolor")
    private String titleColor;
    @Column(name = "is_send_contract")
    private int isSendContract;
    @Column(name = "repay_time_type")
    private int repayTimeType;
    @Column(name = "max_loan_money")
    private BigDecimal maxLoanMoney;
    @Column(name = "risk_rank")
    private int riskRank;
    @Column(name = "risk_security")
    private int riskSecurity;
    @Column(name = "is_send_success_msg")
    private int isSendSuccessMsg;
    @Column(name = "ips_bill_no")
    private String ipsBillNo;
    @Column(name = "guarantees_money")
    private BigDecimal guaranteesMoney;
    @Column(name = "ips_over")
    private int ipsOver;
    @Column(name = "deal_sn")
    private String dealSn;
    @Column(name = "is_has_received")
    private int isHasReceived;
    @Column(name = "manage_fee")
    private String manageFee;
    @Column(name = "user_loan_manage_fee")
    private String userLoanManageFee;
    @Column(name = "manage_impose_fee_day1")
    private String manageImposeFeeDay1;
    @Column(name = "manage_impose_fee_day2")
    private String manageImposeFeeDay2;
    @Column(name = "impose_fee_day1")
    private String imposeFeeDay1;
    @Column(name = "impose_fee_day2")
    private String imposeFeeDay2;
    @Column(name = "user_load_transfer_fee")
    private String userLoadTransferFee;
    @Column(name = "transfer_day")
    private int transferDay;
    @Column(name = "compensate_fee")
    private String compensateFee;
    @Column(name = "ips_do_transfer")
    private int ipsDoTransfer;
    @Column(name = "delete_msg")
    private String deleteMsg;
    @Column(name = "user_bid_rebate")
    private String userBidRebate;
    @Column(name = "guarantees_amt")
    private BigDecimal guaranteesAmt;
    @Column(name = "real_freezen_amt")
    private BigDecimal realFreezenAmt;
    @Column(name = "un_real_freezen_amt")
    private BigDecimal unRealFreezenAmt;
    @Column(name = "guarantor_amt")
    private BigDecimal guarantorAmt;
    @Column(name = "guarantor_margin_amt")
    private BigDecimal guarantorMarginAmt;
    @Column(name = "guarantor_real_freezen_amt")
    private BigDecimal guarantorRealFreezenAmt;
    @Column(name = "un_guarantor_real_freezen_amt")
    private BigDecimal unGuarantorRealFreezenAmt;
    @Column(name = "guarantor_pro_fit_amt")
    private BigDecimal guarantorProFitAmt;
    @Column(name = "guarantor_real_fit_amt")
    private BigDecimal guarantorRealFitAmt;
    @Column(name = "mer_bill_no")
    private String merBillNo;
    @Column(name = "ips_guarantor_bill_no")
    private String ipsGuarantorBillNo;
    @Column(name = "mer_guarantor_bill_no")
    private String merGuarantorBillNo;
    @Column(name = "view_info")
    private String viewInfo;
    @Column(name = "generation_position")
    private BigDecimal generationPosition;
    @Column(name = "uloadtype")
    private int uloadType;
    @Column(name = "portion")
    private int portion;
    @Column(name = "max_portion")
    private int maxPortion;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "repay_start_date")
    private Date repayStartDate;
    @Column(name = "bad_date")
    private Date badDate;
    @Column(name = "contract_id")
    private int contractId;
    @Column(name = "tcontract_id")
    private int tcontractId;
    @Column(name = "is_advance")
    private int isAdvance;
    @Column(name = "is_hidden")
    private int isHidden;
    @Column(name = "peizi_order_ids")
    private String peiziOrderIds;
    @Column(name = "score")
    private int score;
    @Column(name = "user_bid_score_fee")
    private String userBidScoreFee;
    @Column(name = "user_loan_interest_manage_fee")
    private String userLoanInterestManageFee;
    @Column(name = "attachment")
    private String attachment;
    @Column(name = "tattachment")
    private String tattachment;
    @Column(name = "publish_memo")
    private String publishMemo;
    @Column(name = "is_index_show")
    private int isIndexShow;
    @Column(name = "loans_pic")
    private String loansPic;
    @Column(name = "admin_id")
    private int adminId;
    @Column(name = "customers_id")
    private int customersId;
    @Column(name = "use_ecv")
    private int useEcv;
    @Column(name = "is_mortgage")
    private int isMortgage;
    @Column(name = "mortgage_desc")
    private String mortgageDesc;
    @Column(name = "mortgage_infos")
    private String mortgageInfos;
    @Column(name = "mortgage_contract")
    private String mortgageContract;
    @Column(name = "mortgage_fee")
    private BigDecimal mortgageFee;
    @Column(name = "contents")
    private String contents;
    @Column(name = "xx_name")
    private String xxName;
    @Column(name = "ywda_id")
    private String ywdaId;

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

    public int getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(int agencyId) {
        this.agencyId = agencyId;
    }

    public int getAgencyStatus() {
        return agencyStatus;
    }

    public void setAgencyStatus(int agencyStatus) {
        this.agencyStatus = agencyStatus;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIsEffect() {
        return isEffect;
    }

    public void setIsEffect(int isEffect) {
        this.isEffect = isEffect;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getIconType() {
        return iconType;
    }

    public void setIconType(int iconType) {
        this.iconType = iconType;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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

    public int getIsBest() {
        return isBest;
    }

    public void setIsBest(int isBest) {
        this.isBest = isBest;
    }

    public BigDecimal getBorrowAmount() {
        return borrowAmount;
    }

    public void setBorrowAmount(BigDecimal borrowAmount) {
        this.borrowAmount = borrowAmount;
    }

    public BigDecimal getApartLoanMoney() {
        return apartLoanMoney;
    }

    public void setApartLoanMoney(BigDecimal apartLoanMoney) {
        this.apartLoanMoney = apartLoanMoney;
    }

    public int getRepayTime() {
        return repayTime;
    }

    public void setRepayTime(int repayTime) {
        this.repayTime = repayTime;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public long getDay() {
        return day;
    }

    public void setDay(long day) {
        this.day = day;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public String getNameMatch() {
        return nameMatch;
    }

    public void setNameMatch(String nameMatch) {
        this.nameMatch = nameMatch;
    }

    public String getNamMatchRow() {
        return namMatchRow;
    }

    public void setNamMatchRow(String namMatchRow) {
        this.namMatchRow = namMatchRow;
    }

    public String getDealCateMatch() {
        return dealCateMatch;
    }

    public void setDealCateMatch(String dealCateMatch) {
        this.dealCateMatch = dealCateMatch;
    }

    public String getDealCateMatchRow() {
        return dealCateMatchRow;
    }

    public void setDealCateMatchRow(String dealCateMatchRow) {
        this.dealCateMatchRow = dealCateMatchRow;
    }

    public String getTagMatch() {
        return tagMatch;
    }

    public void setTagMatch(String tagMatch) {
        this.tagMatch = tagMatch;
    }

    public String getTagMatchRow() {
        return tagMatchRow;
    }

    public void setTagMatchRow(String tagMatchRow) {
        this.tagMatchRow = tagMatchRow;
    }

    public String getTypeMatch() {
        return typeMatch;
    }

    public void setTypeMatch(String typeMatch) {
        this.typeMatch = typeMatch;
    }

    public String getTypeMatchRow() {
        return typeMatchRow;
    }

    public void setTypeMatchRow(String typeMatchRow) {
        this.typeMatchRow = typeMatchRow;
    }

    public int getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(int isRecommend) {
        this.isRecommend = isRecommend;
    }

    public int getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }

    public BigDecimal getLoadMoney() {
        return loadMoney;
    }

    public void setLoadMoney(BigDecimal loadMoney) {
        this.loadMoney = loadMoney;
    }

    public BigDecimal getRepayMoney() {
        return repayMoney;
    }

    public void setRepayMoney(BigDecimal repayMoney) {
        this.repayMoney = repayMoney;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(long successTime) {
        this.successTime = successTime;
    }

    public long getRepayStartTime() {
        return repayStartTime;
    }

    public void setRepayStartTime(long repayStartTime) {
        this.repayStartTime = repayStartTime;
    }

    public long getLastRepayTime() {
        return lastRepayTime;
    }

    public void setLastRepayTime(long lastRepayTime) {
        this.lastRepayTime = lastRepayTime;
    }

    public long getNextRepayTime() {
        return nextRepayTime;
    }

    public void setNextRepayTime(long nextRepayTime) {
        this.nextRepayTime = nextRepayTime;
    }

    public long getBadTime() {
        return badTime;
    }

    public void setBadTime(long badTime) {
        this.badTime = badTime;
    }

    public int getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(int dealStatus) {
        this.dealStatus = dealStatus;
    }

    public long getEnddate() {
        return enddate;
    }

    public void setEnddate(long enddate) {
        this.enddate = enddate;
    }

    public int getVoffice() {
        return voffice;
    }

    public void setVoffice(int voffice) {
        this.voffice = voffice;
    }

    public int getVposition() {
        return vposition;
    }

    public void setVposition(int vposition) {
        this.vposition = vposition;
    }

    public String getServicesFee() {
        return servicesFee;
    }

    public void setServicesFee(String servicesFee) {
        this.servicesFee = servicesFee;
    }

    public int getPublishWait() {
        return publishWait;
    }

    public void setPublishWait(int publishWait) {
        this.publishWait = publishWait;
    }

    public int getIsSendBadMsg() {
        return isSendBadMsg;
    }

    public void setIsSendBadMsg(int isSendBadMsg) {
        this.isSendBadMsg = isSendBadMsg;
    }

    public String getBadMsg() {
        return badMsg;
    }

    public void setBadMsg(String badMsg) {
        this.badMsg = badMsg;
    }

    public long getSendHalfMsgTime() {
        return sendHalfMsgTime;
    }

    public void setSendHalfMsgTime(long sendHalfMsgTime) {
        this.sendHalfMsgTime = sendHalfMsgTime;
    }

    public int getIsSendHalfMsg() {
        return isSendHalfMsg;
    }

    public void setIsSendHalfMsg(int isSendHalfMsg) {
        this.isSendHalfMsg = isSendHalfMsg;
    }

    public int getIsHasLoans() {
        return isHasLoans;
    }

    public void setIsHasLoans(int isHasLoans) {
        this.isHasLoans = isHasLoans;
    }

    public int getLoantype() {
        return loantype;
    }

    public void setLoantype(int loantype) {
        this.loantype = loantype;
    }

    public int getWarrant() {
        return warrant;
    }

    public void setWarrant(int warrant) {
        this.warrant = warrant;
    }

    public String getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(String titleColor) {
        this.titleColor = titleColor;
    }

    public int getIsSendContract() {
        return isSendContract;
    }

    public void setIsSendContract(int isSendContract) {
        this.isSendContract = isSendContract;
    }

    public int getRepayTimeType() {
        return repayTimeType;
    }

    public void setRepayTimeType(int repayTimeType) {
        this.repayTimeType = repayTimeType;
    }

    public BigDecimal getMaxLoanMoney() {
        return maxLoanMoney;
    }

    public void setMaxLoanMoney(BigDecimal maxLoanMoney) {
        this.maxLoanMoney = maxLoanMoney;
    }

    public int getRiskRank() {
        return riskRank;
    }

    public void setRiskRank(int riskRank) {
        this.riskRank = riskRank;
    }

    public int getRiskSecurity() {
        return riskSecurity;
    }

    public void setRiskSecurity(int riskSecurity) {
        this.riskSecurity = riskSecurity;
    }

    public int getIsSendSuccessMsg() {
        return isSendSuccessMsg;
    }

    public void setIsSendSuccessMsg(int isSendSuccessMsg) {
        this.isSendSuccessMsg = isSendSuccessMsg;
    }

    public String getIpsBillNo() {
        return ipsBillNo;
    }

    public void setIpsBillNo(String ipsBillNo) {
        this.ipsBillNo = ipsBillNo;
    }

    public BigDecimal getGuaranteesMoney() {
        return guaranteesMoney;
    }

    public void setGuaranteesMoney(BigDecimal guaranteesMoney) {
        this.guaranteesMoney = guaranteesMoney;
    }

    public int getIpsOver() {
        return ipsOver;
    }

    public void setIpsOver(int ipsOver) {
        this.ipsOver = ipsOver;
    }

    public String getDealSn() {
        return dealSn;
    }

    public void setDealSn(String dealSn) {
        this.dealSn = dealSn;
    }

    public int getIsHasReceived() {
        return isHasReceived;
    }

    public void setIsHasReceived(int isHasReceived) {
        this.isHasReceived = isHasReceived;
    }

    public String getManageFee() {
        return manageFee;
    }

    public void setManageFee(String manageFee) {
        this.manageFee = manageFee;
    }

    public String getUserLoanManageFee() {
        return userLoanManageFee;
    }

    public void setUserLoanManageFee(String userLoanManageFee) {
        this.userLoanManageFee = userLoanManageFee;
    }

    public String getManageImposeFeeDay1() {
        return manageImposeFeeDay1;
    }

    public void setManageImposeFeeDay1(String manageImposeFeeDay1) {
        this.manageImposeFeeDay1 = manageImposeFeeDay1;
    }

    public String getManageImposeFeeDay2() {
        return manageImposeFeeDay2;
    }

    public void setManageImposeFeeDay2(String manageImposeFeeDay2) {
        this.manageImposeFeeDay2 = manageImposeFeeDay2;
    }

    public String getImposeFeeDay1() {
        return imposeFeeDay1;
    }

    public void setImposeFeeDay1(String imposeFeeDay1) {
        this.imposeFeeDay1 = imposeFeeDay1;
    }

    public String getImposeFeeDay2() {
        return imposeFeeDay2;
    }

    public void setImposeFeeDay2(String imposeFeeDay2) {
        this.imposeFeeDay2 = imposeFeeDay2;
    }

    public String getUserLoadTransferFee() {
        return userLoadTransferFee;
    }

    public void setUserLoadTransferFee(String userLoadTransferFee) {
        this.userLoadTransferFee = userLoadTransferFee;
    }

    public int getTransferDay() {
        return transferDay;
    }

    public void setTransferDay(int transferDay) {
        this.transferDay = transferDay;
    }

    public String getCompensateFee() {
        return compensateFee;
    }

    public void setCompensateFee(String compensateFee) {
        this.compensateFee = compensateFee;
    }

    public int getIpsDoTransfer() {
        return ipsDoTransfer;
    }

    public void setIpsDoTransfer(int ipsDoTransfer) {
        this.ipsDoTransfer = ipsDoTransfer;
    }

    public String getDeleteMsg() {
        return deleteMsg;
    }

    public void setDeleteMsg(String deleteMsg) {
        this.deleteMsg = deleteMsg;
    }

    public String getUserBidRebate() {
        return userBidRebate;
    }

    public void setUserBidRebate(String userBidRebate) {
        this.userBidRebate = userBidRebate;
    }

    public BigDecimal getGuaranteesAmt() {
        return guaranteesAmt;
    }

    public void setGuaranteesAmt(BigDecimal guaranteesAmt) {
        this.guaranteesAmt = guaranteesAmt;
    }

    public BigDecimal getRealFreezenAmt() {
        return realFreezenAmt;
    }

    public void setRealFreezenAmt(BigDecimal realFreezenAmt) {
        this.realFreezenAmt = realFreezenAmt;
    }

    public BigDecimal getUnRealFreezenAmt() {
        return unRealFreezenAmt;
    }

    public void setUnRealFreezenAmt(BigDecimal unRealFreezenAmt) {
        this.unRealFreezenAmt = unRealFreezenAmt;
    }

    public BigDecimal getGuarantorAmt() {
        return guarantorAmt;
    }

    public void setGuarantorAmt(BigDecimal guarantorAmt) {
        this.guarantorAmt = guarantorAmt;
    }

    public BigDecimal getGuarantorMarginAmt() {
        return guarantorMarginAmt;
    }

    public void setGuarantorMarginAmt(BigDecimal guarantorMarginAmt) {
        this.guarantorMarginAmt = guarantorMarginAmt;
    }

    public BigDecimal getGuarantorRealFreezenAmt() {
        return guarantorRealFreezenAmt;
    }

    public void setGuarantorRealFreezenAmt(BigDecimal guarantorRealFreezenAmt) {
        this.guarantorRealFreezenAmt = guarantorRealFreezenAmt;
    }

    public BigDecimal getUnGuarantorRealFreezenAmt() {
        return unGuarantorRealFreezenAmt;
    }

    public void setUnGuarantorRealFreezenAmt(BigDecimal unGuarantorRealFreezenAmt) {
        this.unGuarantorRealFreezenAmt = unGuarantorRealFreezenAmt;
    }

    public BigDecimal getGuarantorProFitAmt() {
        return guarantorProFitAmt;
    }

    public void setGuarantorProFitAmt(BigDecimal guarantorProFitAmt) {
        this.guarantorProFitAmt = guarantorProFitAmt;
    }

    public BigDecimal getGuarantorRealFitAmt() {
        return guarantorRealFitAmt;
    }

    public void setGuarantorRealFitAmt(BigDecimal guarantorRealFitAmt) {
        this.guarantorRealFitAmt = guarantorRealFitAmt;
    }

    public String getMerBillNo() {
        return merBillNo;
    }

    public void setMerBillNo(String merBillNo) {
        this.merBillNo = merBillNo;
    }

    public String getIpsGuarantorBillNo() {
        return ipsGuarantorBillNo;
    }

    public void setIpsGuarantorBillNo(String ipsGuarantorBillNo) {
        this.ipsGuarantorBillNo = ipsGuarantorBillNo;
    }

    public String getMerGuarantorBillNo() {
        return merGuarantorBillNo;
    }

    public void setMerGuarantorBillNo(String merGuarantorBillNo) {
        this.merGuarantorBillNo = merGuarantorBillNo;
    }

    public String getViewInfo() {
        return viewInfo;
    }

    public void setViewInfo(String viewInfo) {
        this.viewInfo = viewInfo;
    }

    public BigDecimal getGenerationPosition() {
        return generationPosition;
    }

    public void setGenerationPosition(BigDecimal generationPosition) {
        this.generationPosition = generationPosition;
    }

    public int getUloadType() {
        return uloadType;
    }

    public void setUloadType(int uloadType) {
        this.uloadType = uloadType;
    }

    public int getPortion() {
        return portion;
    }

    public void setPortion(int portion) {
        this.portion = portion;
    }

    public int getMaxPortion() {
        return maxPortion;
    }

    public void setMaxPortion(int maxPortion) {
        this.maxPortion = maxPortion;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getRepayStartDate() {
        return repayStartDate;
    }

    public void setRepayStartDate(Date repayStartDate) {
        this.repayStartDate = repayStartDate;
    }

    public Date getBadDate() {
        return badDate;
    }

    public void setBadDate(Date badDate) {
        this.badDate = badDate;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getTcontractId() {
        return tcontractId;
    }

    public void setTcontractId(int tcontractId) {
        this.tcontractId = tcontractId;
    }

    public int getIsAdvance() {
        return isAdvance;
    }

    public void setIsAdvance(int isAdvance) {
        this.isAdvance = isAdvance;
    }

    public int getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(int isHidden) {
        this.isHidden = isHidden;
    }

    public String getPeiziOrderIds() {
        return peiziOrderIds;
    }

    public void setPeiziOrderIds(String peiziOrderIds) {
        this.peiziOrderIds = peiziOrderIds;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getUserBidScoreFee() {
        return userBidScoreFee;
    }

    public void setUserBidScoreFee(String userBidScoreFee) {
        this.userBidScoreFee = userBidScoreFee;
    }

    public String getUserLoanInterestManageFee() {
        return userLoanInterestManageFee;
    }

    public void setUserLoanInterestManageFee(String userLoanInterestManageFee) {
        this.userLoanInterestManageFee = userLoanInterestManageFee;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getTattachment() {
        return tattachment;
    }

    public void setTattachment(String tattachment) {
        this.tattachment = tattachment;
    }

    public String getPublishMemo() {
        return publishMemo;
    }

    public void setPublishMemo(String publishMemo) {
        this.publishMemo = publishMemo;
    }

    public int getIsIndexShow() {
        return isIndexShow;
    }

    public void setIsIndexShow(int isIndexShow) {
        this.isIndexShow = isIndexShow;
    }

    public String getLoansPic() {
        return loansPic;
    }

    public void setLoansPic(String loansPic) {
        this.loansPic = loansPic;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getCustomersId() {
        return customersId;
    }

    public void setCustomersId(int customersId) {
        this.customersId = customersId;
    }

    public int getUseEcv() {
        return useEcv;
    }

    public void setUseEcv(int useEcv) {
        this.useEcv = useEcv;
    }

    public int getIsMortgage() {
        return isMortgage;
    }

    public void setIsMortgage(int isMortgage) {
        this.isMortgage = isMortgage;
    }

    public String getMortgageDesc() {
        return mortgageDesc;
    }

    public void setMortgageDesc(String mortgageDesc) {
        this.mortgageDesc = mortgageDesc;
    }

    public String getMortgageInfos() {
        return mortgageInfos;
    }

    public void setMortgageInfos(String mortgageInfos) {
        this.mortgageInfos = mortgageInfos;
    }

    public String getMortgageContract() {
        return mortgageContract;
    }

    public void setMortgageContract(String mortgageContract) {
        this.mortgageContract = mortgageContract;
    }

    public BigDecimal getMortgageFee() {
        return mortgageFee;
    }

    public void setMortgageFee(BigDecimal mortgageFee) {
        this.mortgageFee = mortgageFee;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getXxName() {
        return xxName;
    }

    public void setXxName(String xxName) {
        this.xxName = xxName;
    }

    public String getYwdaId() {
        return ywdaId;
    }

    public void setYwdaId(String ywdaId) {
        this.ywdaId = ywdaId;
    }

}
