package com.edianjucai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edianjucai.dao.ArticleDao;
import com.edianjucai.model.Article;
import com.edianjucai.page.ArticlePagination;

@Service
public class ArticleServiceImpl {

    @Autowired
    private ArticleDao articleDao;
    
    @Transactional
    public List<Article> findAllArticle(ArticlePagination articlePagination) {
        articlePagination.setTotalCount(articleDao.getArticleCount(articlePagination));
        List<Article> articles = articleDao.findAllArticle(articlePagination);
        return articles;
    }
    
    @Transactional
    public boolean createArticle(Article article) {
        if (articleDao.addArticle(article)) {
            return true;
        } else {
            return false;
        }
    }
}
