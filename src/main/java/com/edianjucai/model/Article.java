package com.edianjucai.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "edian_article")
public class Article implements Serializable{

    private static final long serialVersionUID = 4023136967347037321L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "icon")
    private String icon;
    @Column(name = "content")
    private String content;
    @Column(name = "cate_id")
    private int cateId;
    @Column(name = "create_time")
    private long createTime;
    @Column(name = "update_time")
    private long updateTime;
    @Column(name = "add_admin_id")
    private int addAdminId;
    @Column(name = "is_effect")
    private int isEffect;
    @Column(name = "rel_url")
    private String relUrl;
    @Column(name = "update_admin_id")
    private int updateAdminId;
    @Column(name = "is_delete")
    private int isDelete;
    @Column(name = "click_count")
    private int clickCount;
    @Column(name = "sort")
    private int sort;
    @Column(name = "seo_title")
    private String seoTitle;
    @Column(name = "seo_keyword")
    private String seoKeyword;
    @Column(name = "seo_description")
    private String seoDescription;
    @Column(name = "uname")
    private String uName;
    @Column(name = "sub_title")
    private String subTitle;
    @Column(name = "brief")
    private String brief;
    private String contentFileName;

    public String getContentFileName() {
        return contentFileName;
    }

    public void setContentFileName(String contentFileName) {
        this.contentFileName = contentFileName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public int getAddAdminId() {
        return addAdminId;
    }

    public void setAddAdminId(int addAdminId) {
        this.addAdminId = addAdminId;
    }

    public int getIsEffect() {
        return isEffect;
    }

    public void setIsEffect(int isEffect) {
        this.isEffect = isEffect;
    }

    public String getRelUrl() {
        return relUrl;
    }

    public void setRelUrl(String relUrl) {
        this.relUrl = relUrl;
    }

    public int getUpdateAdminId() {
        return updateAdminId;
    }

    public void setUpdateAdminId(int updateAdminId) {
        this.updateAdminId = updateAdminId;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public int getClickCount() {
        return clickCount;
    }

    public void setClickCount(int clickCount) {
        this.clickCount = clickCount;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    public String getSeoKeyword() {
        return seoKeyword;
    }

    public void setSeoKeyword(String seoKeyword) {
        this.seoKeyword = seoKeyword;
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

}
