package com.edianjucai.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edianjucai.model.Article;
import com.edianjucai.page.ArticlePagination;
import com.edianjucai.util.XMLReaderUtil;

@Repository
public class ArticleDao {

    @Autowired
    private SessionFactory sessionFactory;
    
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    
    @SuppressWarnings("unchecked")
    public List<Article> findAllArticle(ArticlePagination articlePagination) {
        String hql = XMLReaderUtil.getSql("article");
        
        Query query = getSession().createQuery(hql);
        query.setParameter(0, articlePagination.getTitle());
        query.setParameter(1, articlePagination.getStart());
        query.setParameter(2, articlePagination.getPageSize());
        
        return query.list();
    }
    
    public int getArticleCount(ArticlePagination articlePagination) {
        String sql = XMLReaderUtil.getSql("articleCount");
        SQLQuery query = getSession().createSQLQuery(sql);
        query.setParameter(0, articlePagination.getTitle());
        String countStr = query.uniqueResult().toString();
        int count = Integer.valueOf(countStr);
        return count;
    }
    
    public boolean addArticle(Article article) {
        try {
            getSession().save(article);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
