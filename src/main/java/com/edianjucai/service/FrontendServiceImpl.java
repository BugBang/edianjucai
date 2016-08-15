package com.edianjucai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edianjucai.dao.FrontendDao;
import com.edianjucai.model.Adv;
import com.edianjucai.model.Nav;
import com.edianjucai.page.AdvPagination;
import com.edianjucai.page.NavPagination;

@Service
public class FrontendServiceImpl {

    @Autowired
    private FrontendDao frontendDao;
    
    @Transactional
    public List<Nav> findAllNav(NavPagination navPagination) {
        navPagination.setTotalCount(frontendDao.getNavCount(navPagination));
        List<Nav> navs = frontendDao.findAllNav(navPagination);
        return navs;
    }
    
    @Transactional
    public Nav getNavById(int id) {
        Nav nav = frontendDao.getNavById(id);
        if (nav != null) {
            return nav;
        } else {
            return nav;
        }
    }
    
    @Transactional
    public boolean addNav(Nav nav) {
        if (frontendDao.addNav(nav)) {
            return true;
        } else {
            return false;
        }
    }
    
    @Transactional
    public boolean modifyNav(Nav nav) {
        if (frontendDao.modifyNav(nav)) {
            return true;
        } else {
            return false;
        }
    }
    
    // adv
    
    @Transactional
    public List<Adv> findAllAdv(AdvPagination advPagination) {
        advPagination.setTotalCount(frontendDao.getAdvCount(advPagination));
        List<Adv> advs = frontendDao.findAllAdv(advPagination);
        return advs;
    }
    
    @Transactional
    public Adv getAdvById(int id) {
        return frontendDao.getAdvById(id);
    }
    
    @Transactional
    public boolean modifyAdv(Adv adv) {
        return frontendDao.modifyAdv(adv);
    }
    
    @Transactional
    public boolean addAdv(Adv adv) {
        return frontendDao.addAdv(adv);
    }
}
