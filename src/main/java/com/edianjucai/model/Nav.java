package com.edianjucai.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "edian_nav")
public class Nav implements Serializable {

    private static final long serialVersionUID = 5496131303879919339L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "url")
    private String url;
    @Column(name = "blank")
    private int blank;
    @Column(name = "is_effect")
    private int isEffect;
    @Column(name = "u_module")
    private String uModule;
    @Column(name = "u_action")
    private String uAction;
    @Column(name = "u_id")
    private int uId;
    @Column(name = "u_param")
    private String uParam;
    @Column(name = "is_shop")
    private int isShop;
    @Column(name = "app_index")
    private String appIndex;
    @Column(name = "pid")
    private int pid;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getBlank() {
        return blank;
    }

    public void setBlank(int blank) {
        this.blank = blank;
    }

    public int getIsEffect() {
        return isEffect;
    }

    public void setIsEffect(int isEffect) {
        this.isEffect = isEffect;
    }

    public String getuModule() {
        return uModule;
    }

    public void setuModule(String uModule) {
        this.uModule = uModule;
    }

    public String getuAction() {
        return uAction;
    }

    public void setuAction(String uAction) {
        this.uAction = uAction;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuParam() {
        return uParam;
    }

    public void setuParam(String uParam) {
        this.uParam = uParam;
    }

    public int getIsShop() {
        return isShop;
    }

    public void setIsShop(int isShop) {
        this.isShop = isShop;
    }

    public String getAppIndex() {
        return appIndex;
    }

    public void setAppIndex(String appIndex) {
        this.appIndex = appIndex;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

}
