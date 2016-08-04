package com.edianjucai.dao;

import java.math.BigDecimal;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DealLoadDao {

    @Autowired
    private SessionFactory sessionFactory;
    
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    
    public BigDecimal getSumDealLoadByUserId(int userId) {
        String hql = "select sum(money) from DealLoad where userId = ?";
        Query query = getSession().createQuery(hql);
        query.setParameter(0, userId);
        return (BigDecimal) query.uniqueResult();
    }
}
