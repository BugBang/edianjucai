package com.edianjucai.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edianjucai.model.MAdv;
import com.edianjucai.page.MAdvPagination;
import com.edianjucai.util.XMLReaderUtil;

@Repository
public class SystemSetUpDao {

    @Autowired
    private SessionFactory sessionFactory;
    
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    
    @SuppressWarnings("unchecked")
    public List<MAdv> showAllMAdv(MAdvPagination mAdvPagination) {
        String hql = XMLReaderUtil.getSql("showAllMAdv");
        Query query = getSession().createQuery(hql);
        query.setFirstResult(mAdvPagination.getStart());
        query.setMaxResults(mAdvPagination.getPageSize());
        return query.list();
    }
    
    public int getMAdvCount(MAdvPagination mAdvPagination) {
        String hql = XMLReaderUtil.getSql("getMAdvCount");
        Query query = getSession().createQuery(hql);
        String countStr = query.uniqueResult().toString();
        return Integer.valueOf(countStr);
    }
}
