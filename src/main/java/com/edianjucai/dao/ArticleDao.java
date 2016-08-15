package com.edianjucai.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edianjucai.model.Article;
import com.edianjucai.model.ArticleCate;
import com.edianjucai.page.ArticleCatePagination;
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
        query.setString("title", "%"+(articlePagination.getTitle() != null ? articlePagination.getTitle() : "")+"%");
        query.setFirstResult(articlePagination.getStart()); //从第0条开始   
        query.setMaxResults(articlePagination.getPageSize()); //取出10条
        
        return query.list();
    }
    
    public int getArticleCount(ArticlePagination articlePagination) {
        String sql = XMLReaderUtil.getSql("articleCount");
        sql += " where title like \'%" + (articlePagination.getTitle() != null ? articlePagination.getTitle() : "") + "%\'";
        SQLQuery query = getSession().createSQLQuery(sql);
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
    
    public Article getArticleById(int id) {
        Article article = (Article) getSession().get(Article.class, id);
        return article;
    }
    
    public boolean updateArticle(Article article) {
        try {
            getSession().update(article);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    //article cate
    
    @SuppressWarnings("unchecked")
    public List<ArticleCate> findAllArticleCate(ArticleCatePagination articleCatePagination) {
        String hql = XMLReaderUtil.getSql("articleCate");
        Query query = getSession().createQuery(hql);
        query.setString("title", "%"+(articleCatePagination.getTitle() != null ? articleCatePagination.getTitle() : "")+"%");
        query.setFirstResult(articleCatePagination.getStart());
        query.setMaxResults(articleCatePagination.getPageSize());
        
        return query.list();
    }
    
    public int getArticleCateCount(ArticleCatePagination articleCatePagination) {
        String sql = XMLReaderUtil.getSql("articleCateCount");
        sql += " where title like \'%" + (articleCatePagination.getTitle() != null ? articleCatePagination.getTitle() : "") + "%\'";
        SQLQuery query = getSession().createSQLQuery(sql);
        String countStr = query.uniqueResult().toString();
        int count = Integer.valueOf(countStr);
        return count;
    }
    
    public ArticleCate getArticleCateById(int id) {
        ArticleCate articleCate = (ArticleCate) getSession().get(ArticleCate.class, id);
        return articleCate;
    }
    
    public boolean addArticleCate(ArticleCate articleCate) {
        try {
            getSession().save(articleCate);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean updateArticleCate(ArticleCate articleCate) {
        try {
            getSession().update(articleCate);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
