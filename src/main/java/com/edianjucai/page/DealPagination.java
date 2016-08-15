package com.edianjucai.page;

public class DealPagination extends Pagination {

    private String name;
    private String userName;
    private int cateId;
    private int loantype;
    private int dealStatus;

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

    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }

    public int getLoantype() {
        return loantype;
    }

    public void setLoantype(int loantype) {
        this.loantype = loantype;
    }

    public int getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(int dealStatus) {
        this.dealStatus = dealStatus;
    }

}
