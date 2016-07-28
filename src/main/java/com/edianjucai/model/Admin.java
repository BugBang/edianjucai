package com.edianjucai.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="edian_admin")
public class Admin implements Serializable{

    private static final long serialVersionUID = -5986448071594172088L;

    @Id
    private int id;
    @Column(name="adm_name")
    private String name;
    @Column(name="adm_pasword")
    private String password;
    @Column(name="role_id")
    private int roleId;
    @Column(name="login_time")
    private int loginTime;
    @Column(name="login_ip")
    private String loginIp;
    @Column(name="pid")
    private int pid;
    @Column(name="referrals_rate")
    private String referralsRate;
    @Column(name="referrals_count")
    private int referralsCount;
    @Column(name="referrals_money")
    private BigDecimal referralsMoney;
    @Column(name="real_name")
    private String realName;
    @Column(name="mobile")
    private String mobile;
    @Column(name="work_id")
    private String workId;
    @Column(name="is_effect")
    private Integer isEffect;
    @Column(name="is_delete")
    private Integer isDelete;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(int loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getReferralsRate() {
        return referralsRate;
    }

    public void setReferralsRate(String referralsRate) {
        this.referralsRate = referralsRate;
    }

    public int getReferralsCount() {
        return referralsCount;
    }

    public void setReferralsCount(int referralsCount) {
        this.referralsCount = referralsCount;
    }

    public BigDecimal getReferralsMoney() {
        return referralsMoney;
    }

    public void setReferralsMoney(BigDecimal referralsMoney) {
        this.referralsMoney = referralsMoney;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public Integer getIsEffect() {
        return isEffect;
    }

    public void setIsEffect(Integer isEffect) {
        this.isEffect = isEffect;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}
