package com.edianjucai.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edianjucai.dao.ArticleDao;
import com.edianjucai.model.Article;
import com.edianjucai.model.ArticleCate;
import com.edianjucai.page.ArticleCatePagination;
import com.edianjucai.page.ArticlePagination;
import com.edianjucai.util.DateFormatUtils;
import com.edianjucai.util.ReadFromFile;

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
        
        String content = article.getContent();
        Date date = new Date();
        String folderName = DateFormatUtils.dateToString(date, "yyyyMMdd");
        String fileName = DateFormatUtils.dateToString(date, "yyMMddHHmmss");
        ReadFromFile.writeFile(content, fileName, folderName);
        article.setContent(folderName + "/" + fileName);
        article.setContentFileName(folderName + "/" + fileName);
        
        if (articleDao.addArticle(article)) {
            return true;
        } else {
            return false;
        }
    }
    
    @Transactional
    public Article getArticleById(int id) {
        Article article = articleDao.getArticleById(id);
        if (article != null) {
            String fileName = article.getContent();
            article.setContentFileName(fileName);
            article.setContent(ReadFromFile.readFile(fileName));
            return article;
        } else {
            return null;
        }
    }
    
    @Transactional
    public boolean modifyArticle(Article article) {
        
        String[] s = article.getContentFileName().split("/");
        String folderName = s[0];
        String fileName = s[1];
        ReadFromFile.writeFile(article.getContent(), fileName, folderName);
        article.setContent(folderName + "/" + fileName);
        if (articleDao.updateArticle(article)) {
            return true;
        } else {
            return false;
        }
    }
    
    @Transactional
    public List<ArticleCate> findAllArticleCate(ArticleCatePagination articleCatePagination) {
        articleCatePagination.setTotalCount(articleDao.getArticleCateCount(articleCatePagination));
        List<ArticleCate> articleCates = articleDao.findAllArticleCate(articleCatePagination);
        return articleCates;
    }
    
    @Transactional
    public boolean addArticleCate(ArticleCate articleCate) {
        if (articleDao.addArticleCate(articleCate)) {
            return true;
        } else {
            return false;
        }
    }
    
    @Transactional
    public ArticleCate getArticleCateById(int id) {
        ArticleCate articleCate = articleDao.getArticleCateById(id);
        
        if (articleCate != null) {
            return articleCate;
        } else {
            return null;
        }
    }
    
    @Transactional
    public boolean modifyArticleCate(ArticleCate articleCate) {
        if (articleDao.updateArticleCate(articleCate)) {
            return true;
        } else {
            return false;
        }
    }
}
