package com.edianjucai.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "edian_deal_city")
public class DealCity implements Serializable {

    private static final long serialVersionUID = 5755412325792904515L;
    @Id
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "uname")
    private String uname;
    @Column(name = "is_effect")
    private int isEffect;
    @Column(name = "is_delete")
    private int isDelete;
    @Column(name = "pid")
    private int pid;
    @Column(name = "is_default")
    private int isDefault;
    @Column(name = "seo_title")
    private String seoTitle;
    @Column(name = "seo_keyword")
    private String seoKeyword;
    @Column(name = "seo_description")
    private String seoDescription;
    @Column(name = "sort")
    private int sort;
    @Column(name = "code")
    private String code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getIsEffect() {
        return isEffect;
    }

    public void setIsEffect(int isEffect) {
        this.isEffect = isEffect;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
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

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
