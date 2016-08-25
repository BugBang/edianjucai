package com.edianjucai.model;

public class DealMappingMsg {
    private User user;
    private String loadtype;//还款方式
    private String dealStatus;//投标状态
    private String isHasLoans;//放款
    private String isHasReceived;//流标返回
    private String isRecommend;//推荐
    private String isAdvance;//预告  
    private String isNew;//新手享 
    private String isEffect;//状态 
    private String isHidden;//隐藏
    
    private Deal deal;
    
    
    
    public Deal getDeal() {
        return deal;
    }
    public void setDeal(Deal deal) {
        this.deal = deal;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getLoadtype() {
        return loadtype;
    }
    public void setLoadtype(String loadtype) {
        this.loadtype = loadtype;
    }
    public String getDealStatus() {
        return dealStatus;
    }
    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }
    public String getIsHasLoans() {
        return isHasLoans;
    }
    public void setIsHasLoans(String isHasLoans) {
        this.isHasLoans = isHasLoans;
    }
    public String getIsHasReceived() {
        return isHasReceived;
    }
    public void setIsHasReceived(String isHasReceived) {
        this.isHasReceived = isHasReceived;
    }
    public String getIsRecommend() {
        return isRecommend;
    }
    public void setIsRecommend(String isRecommend) {
        this.isRecommend = isRecommend;
    }
    public String getIsAdvance() {
        return isAdvance;
    }
    public void setIsAdvance(String isAdvance) {
        this.isAdvance = isAdvance;
    }
    public String getIsNew() {
        return isNew;
    }
    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }
    public String getIsEffect() {
        return isEffect;
    }
    public void setIsEffect(String isEffect) {
        this.isEffect = isEffect;
    }
    public String getIsHidden() {
        return isHidden;
    }
    public void setIsHidden(String isHidden) {
        this.isHidden = isHidden;
    }
    
    
}
