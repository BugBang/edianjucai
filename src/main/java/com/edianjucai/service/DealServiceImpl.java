package com.edianjucai.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edianjucai.dao.DealDao;
import com.edianjucai.dao.UserDao;
import com.edianjucai.model.Deal;
import com.edianjucai.model.DealCate;
import com.edianjucai.model.DealMappingMsg;
import com.edianjucai.model.Goods;
import com.edianjucai.model.User;
import com.edianjucai.page.DealPagination;
import com.edianjucai.util.XMLReaderUtil;

@Service
public class DealServiceImpl {

    @Autowired
    private DealDao dealDao;
    @Autowired
    private UserDao userDao;

    @Transactional
    public List<Deal> findAllDeal(DealPagination dealPagination) {
        dealPagination.setUserId(
                userDao.getUserIdByName(dealPagination.getUserName() != null ? dealPagination.getUserName() : ""));
        dealPagination.setTotalCount(dealDao.getDealCount(dealPagination));
        List<Deal> deals = dealDao.findAllDeal(dealPagination);
        return deals;
    }

    /*
     * private User user; 
     * private String loadtype;//还款方式 
     * private String dealStatus;//投标状态 
     * private String isHasLoans;//放款 
     * private String isHasReceived;//流标返回 
     * private String isRecommend;//推荐 
     * private String isAdvance;//预告 
     * private String isNew;//新手享
     * private String isEffect;//状态
     * private String isHidden;//隐藏
     */


    @Transactional
    public List<DealMappingMsg> findDealMappingMsg(List<Deal> deals) {
        List<DealMappingMsg> mappingMsgs = new ArrayList<DealMappingMsg>();
        for(int i = 0;i<deals.size();i++){
            mappingMsgs.add(setDealData(deals.get(i)));
        }
        return mappingMsgs;
    }

    private DealMappingMsg setDealData(Deal deal){
        DealMappingMsg dealMappingMsg = new DealMappingMsg();
        User user = userDao.getUserById(deal.getUserId());
        dealMappingMsg.setUser(user);
        dealMappingMsg.setLoadtype(deal.getLoantype() == 1 ? "付息还本" : "到期还本息");
        int status = deal.getDealStatus();
        switch (status) {
        case 0:
            dealMappingMsg.setDealStatus("等待材料");
            break;
        case 1:
            dealMappingMsg.setDealStatus("进行中");
            break;
        case 2:
            dealMappingMsg.setDealStatus("满标");
            break;
        case 3:
            dealMappingMsg.setDealStatus("流标");
            break;
        case 4:
            dealMappingMsg.setDealStatus("还款中");
            break;
        case 5:
            dealMappingMsg.setDealStatus("已还清");
            break;
        default:
            dealMappingMsg.setDealStatus("未知");
            break;
        }
        dealMappingMsg.setDeal(deal);
        dealMappingMsg.setIsHasLoans(deal.getIsHasLoans()==1?"":"");
        dealMappingMsg.setIsHasReceived(deal.getIsHasReceived()==1?"":"");
        dealMappingMsg.setIsRecommend(deal.getIsRecommend()==1?"":"");
        dealMappingMsg.setIsAdvance(deal.getIsAdvance()==1?"":"");
        dealMappingMsg.setIsNew(deal.getIsNew()==1?"":"");
        dealMappingMsg.setIsEffect(deal.getIsEffect()==1?"":"");
        dealMappingMsg.setIsHidden(deal.getIsHidden()==1?"":"");
        return dealMappingMsg;
    }
    
    
    @Transactional
    public List<DealCate> findAllDealCate() {
        return dealDao.findAllDealCate();
    }

    @Transactional
    public Deal getDealById(int id) {
        return dealDao.getDealById(id);
    }

    @Transactional
    public boolean addDeal(Deal deal) {
        if (dealDao.addDeal(deal))
            return true;
        return false;
    }

    @Transactional
    public boolean modifyDeal(Deal deal) {
        if (dealDao.modifyDeal(deal))
            return true;
        return false;
    }

    @Transactional
    public int getDealCount(DealPagination dealPagination) {
        return dealDao.getDealCount(dealPagination);
    }

}
