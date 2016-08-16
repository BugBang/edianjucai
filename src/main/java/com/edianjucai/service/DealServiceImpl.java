package com.edianjucai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edianjucai.dao.DealDao;
import com.edianjucai.dao.UserDao;
import com.edianjucai.model.Deal;
import com.edianjucai.model.DealCate;
import com.edianjucai.page.DealPagination;

@Service
public class DealServiceImpl {

    @Autowired
    private DealDao dealDao;
    @Autowired
    private UserDao userDao;
    
    @Transactional
    public List<Deal> findAllDeal(DealPagination dealPagination) {
        dealPagination.setUserId(userDao.getUserIdByName(dealPagination.getUserName()));
        dealPagination.setTotalCount(dealDao.getDealCount(dealPagination));
        List<Deal> deals = dealDao.findAllDeal(dealPagination);
        return deals;
    }
    
    @Transactional
    public List<DealCate> findAllDealCate() {
        return dealDao.findAllDealCate();
    }
    
}
