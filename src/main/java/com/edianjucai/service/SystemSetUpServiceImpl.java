package com.edianjucai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edianjucai.dao.SystemSetUpDao;
import com.edianjucai.model.MAdv;
import com.edianjucai.page.MAdvPagination;

@Service
public class SystemSetUpServiceImpl {

    @Autowired
    private SystemSetUpDao systemSetUpDao;
    
    @Transactional
    public List<MAdv> findAllMAdv(MAdvPagination mAdvPagination) {
        mAdvPagination.setTotalCount(systemSetUpDao.getMAdvCount(mAdvPagination));
        List<MAdv> mAdvs = systemSetUpDao.showAllMAdv(mAdvPagination);
        return mAdvs;
    }
}
