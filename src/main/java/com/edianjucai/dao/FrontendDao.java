package com.edianjucai.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edianjucai.model.Adv;
import com.edianjucai.model.Nav;
import com.edianjucai.page.AdvPagination;
import com.edianjucai.page.NavPagination;
import com.edianjucai.util.XMLReaderUtil;

@Repository
public class FrontendDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    
    @SuppressWarnings("unchecked")
    public List<Nav> findAllNav(NavPagination navPagination) {
        String hql = XMLReaderUtil.getSql("nav");
        Query query = getSession().createQuery(hql);
        query.setString("name", "%" + (navPagination.getName() != null ? navPagination.getName() : "") + "%");
        query.setFirstResult(navPagination.getStart());
        query.setMaxResults(navPagination.getPageSize());
        return query.list();
    }
    
    public int getNavCount(NavPagination navPagination) {
        String sql = XMLReaderUtil.getSql("navCount");
        sql += " where name like \'%" + (navPagination.getName() != null ? navPagination.getName() : "") + "%\'";
        String countStr = getSession().createSQLQuery(sql).uniqueResult().toString();
        return Integer.valueOf(countStr);
    }
    
    public Nav getNavById(int id) {
        try {
            return (Nav) getSession().get(Nav.class, id);
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean modifyNav(Nav nav) {
        try {
            getSession().update(nav);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean addNav(Nav nav) {
        try {
            getSession().save(nav);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    //adv
    
    @SuppressWarnings("unchecked")
    public List<Adv> findAllAdv(AdvPagination advPagination) {
        String hql = XMLReaderUtil.getSql("adv");
        Query query = getSession().createQuery(hql);
        query.setString("name", "%" + (advPagination.getName() != null ? advPagination.getName() : "") + "%");
        query.setFirstResult(advPagination.getStart());
        query.setMaxResults(advPagination.getPageSize());
        return query.list();
    }
    
    public int getAdvCount(AdvPagination advPagination) {
        String sql = XMLReaderUtil.getSql("advCount");
        sql += " where name like \'%" + (advPagination.getName() != null ? advPagination.getName() : "") + "%\'";
        String countStr = getSession().createSQLQuery(sql).uniqueResult().toString();
        return Integer.valueOf(countStr);
    }
    
    public Adv getAdvById(int id) {
        try {
            return (Adv) getSession().get(Adv.class, id);
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean modifyAdv(Adv adv) {
        try {
            getSession().update(adv);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean addAdv(Adv adv) {
        try {
            getSession().save(adv);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
