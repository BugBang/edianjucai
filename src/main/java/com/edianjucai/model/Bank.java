package com.edianjucai.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "edian_bank")
public class Bank implements Serializable{

    private static final long serialVersionUID = 4077141067316794815L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "is_rec")
    private int isRec;
    @Column(name = "day")
    private long day;
    @Column(name = "sort")
    private int sort;
    @Column(name = "icon")
    private String icon;
    @Column(name = "huifu")
    private String huifu;

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

    public int getIsRec() {
        return isRec;
    }

    public void setIsRec(int isRec) {
        this.isRec = isRec;
    }

    public long getDay() {
        return day;
    }

    public void setDay(long day) {
        this.day = day;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getHuifu() {
        return huifu;
    }

    public void setHuifu(String huifu) {
        this.huifu = huifu;
    }

}
