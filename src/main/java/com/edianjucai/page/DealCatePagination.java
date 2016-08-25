package com.edianjucai.page;

public class DealCatePagination extends Pagination {

    private String name;
    private String userName;
    private Integer userId;
    private Integer cateId;
    private Integer loantype;
    private Integer dealStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getLoantype() {
        return loantype;
    }

    public void setLoantype(Integer loantype) {
        this.loantype = loantype;
    }

    public Integer getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(Integer dealStatus) {
        this.dealStatus = dealStatus;
    }

}
