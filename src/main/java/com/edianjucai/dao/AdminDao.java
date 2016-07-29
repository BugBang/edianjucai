package com.edianjucai.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edianjucai.model.Admin;

@Repository
public class AdminDao {

    @Autowired
    private SessionFactory sessionFactory;
    
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    
    @SuppressWarnings("unchecked")
    public List<Admin> findAllAdmin() {
        String hql = "from Admin";
        Query query = getSession().createQuery(hql);
        return query.list();
    }

    @SuppressWarnings("unchecked")
    public List<Admin> getAdmin(String userName, String password) {
        String hql = "from Admin where name = ? and password = ?";
        Query query = getSession().createQuery(hql);
        query.setParameter(0, userName);
        query.setParameter(1, password);
        return query.list();
    }
}
