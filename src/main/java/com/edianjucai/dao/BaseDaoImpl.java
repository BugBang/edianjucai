package com.edianjucai.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDaoImpl{

    @Autowired
    protected SessionFactory sessionFactory;

    @Resource
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public List<?> getListBySql(String sql, Class<?> clazz, Map<String, org.hibernate.type.Type> scalars,
            Object... parameters) {
        SQLQuery query = getSession().createSQLQuery(sql);
        
        if (scalars != null) {
            for (String column : scalars.keySet()) {
                query.addScalar(column, scalars.get(column));
            }
        }

        query.setResultTransformer(Transformers.aliasToBean(clazz));
        
        for (int i = 0; parameters != null && i < parameters.length; i++) {
            query.setParameter(i, parameters[i]);
        }
        
        return query.list();
    }

    public List<?> getListByHql(String hql, Object... parameters) {
        Query query = getSession().createQuery(hql);

        for (int i = 0; parameters != null && i < parameters.length; i++) {
            query.setParameter(i, parameters[i]);
        }

        return query.list();
    }

}
