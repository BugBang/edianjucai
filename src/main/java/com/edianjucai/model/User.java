package com.edianjucai.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "edian_user")
public class User implements Serializable{

    private static final long serialVersionUID = 2700148626779553838L;

    @Id
    private int id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "short_name")
    private String shortName;
    @Column(name = "brief")
    private String brief;
    @Column(name = "header")
    private String header;
    @Column(name = "company_brief")
    private String companyBrief;
    @Column(name = "history")
    private String history;
    @Column(name = "content")
    private String content;
    @Column(name = "sort")
    private int sort;
    @Column(name = "acct_type")
    private int acctType;
    @Column(name = "user_pwd")
    private String password;
    @Column(name = "create_time")
    private int createTime;
    @Column(name = "update_time")
    private int updateTime;
    @Column(name = "login_ip")
    private String loginIp;
    @Column(name = "group_id")
    private int groupId;
    @Column(name = "is_effect")
    private int isEffect;
    @Column(name = "is_delete")
    private int isDelete;
    @Column(name = "email")
    private String email;
    @Column(name = "idno")
    private String idno;
    @Column(name = "idcardpassed")
    private int idCardpassed;
    @Column(name = "idcardpassed_time")
    private int idCardpassedTime;
    @Column(name = "real_name")
    private String realName;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "mobilepassed")
    private int mobilePassed;
    @Column(name = "score")
    private int score;
    @Column(name = "money")
    private BigDecimal money;
    @Column(name = "quota")
    private BigDecimal quota;
    @Column(name = "lock_money")
    private BigDecimal lockMoney;
    @Column(name = "verify")
    private String verify;
    @Column(name = "code")
    private String code;
    @Column(name = "pid")
    private int pid;
    @Column(name = "referer_memo")
    private String refererMeno;
    @Column(name = "login_time")
    private int loginTime;
    @Column(name = "referral_count")
    private int referralCount;
    @Column(name = "password_verify")
    private String passwordVerify;
    @Column(name = "integerate_id")
    private int integerateId;
    @Column(name = "sina_id")
    private String sinaId;
    @Column(name = "renren_id")
    private int renrenId;
    @Column(name = "kaixin_id")
    private int kaiXinId;
    @Column(name = "sohu_id")
    private int sohuId;
    @Column(name = "bind_verify")
    private String bindVerify;
    @Column(name = "verify_create_time")
    private int verifyCreateTime;
    @Column(name = "tencent_id")
    private String tencentId;
    @Column(name = "referer")
    private String referer;
    @Column(name = "login_pay_time")
    private int loginPayTime;
    @Column(name = "focus_count")
    private int focusCount;
    @Column(name = "focused_count")
    private int focusedCount;
    @Column(name = "n_province_id")
    private int nProvinceId;
    @Column(name = "n_city_id")
    private int nCityId;
    @Column(name = "province_id")
    private int provinceId;
    @Column(name = "city_id")
    private int city_id;
    @Column(name = "sex")
    private int sex;
    @Column(name = "step")
    private int step;
    @Column(name = "byear")
    private int byear;
    @Column(name = "bmonth")
    private int bmonth;
    @Column(name = "bday")
    private int bday;
    @Column(name = "graduation")
    private String graduation;
    @Column(name = "graduatedyear")
    private int graduatedYear;
    @Column(name = "university")
    private String university;
    @Column(name = "edu_validcode")
    private String eduValidCode;
    @Column(name = "has_send_video")
    private int hasSendVideo;
    @Column(name = "marriage")
    private String marriage;
    @Column(name = "haschild")
    private int hasChild;
    @Column(name = "hashouse")
    private int hasHouse;
    @Column(name = "houseloan")
    private int houseloan;
    @Column(name = "hascar")
    private int hasCar;
    @Column(name = "carloan")
    private int carloan;
    @Column(name = "car_brand")
    private String carBrand;
    @Column(name = "car_year")
    private int carYear;
    @Column(name = "car_number")
    private String carNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private String phone;
    @Column(name = "postcode")
    private String postCode;
    @Column(name = "locate_time")
    private int locateTime;
    @Column(name = "xpoint")
    private float xPoint;
    @Column(name = "ypoint")
    private float yPoint;
    @Column(name = "topic_count")
    private int topicCount;
    @Column(name = "fav_count")
    private int favCount;
    @Column(name = "faved_count")
    private int favedCount;
    @Column(name = "insite_count")
    private int insiteCount;
    @Column(name = "outsite_count")
    private int outSiteCount;
    @Column(name = "level_id")
    private int levelId;
    @Column(name = "point")
    private int point;
    @Column(name = "sina_app_key")
    private String sinaAppKey;
    @Column(name = "sina_app_secret")
    private String sinaAppSecret;
    @Column(name = "is_syn_sina")
    private int isSynSina;
    @Column(name = "tencent_app_key")
    private String tencentAppKey;
    @Column(name = "tencent_app_secret")
    private String tencentAppSecret;
    @Column(name = "is_syn_tencent")
    private int isSynTencent;
    @Column(name = "t_access_token")
    private String tAccessToken;
    @Column(name = "t_openkey")
    private String tOpenkey;
    @Column(name = "t_openid")
    private String tOpenid;
    @Column(name = "sina_token")
    private String sinaToken;
    @Column(name = "is_borrow_out")
    private int isBorrowOut;
    @Column(name = "is_borrow_int")
    private int isBorrowInt;
    @Column(name = "creditpassed")
    private int creditpassed;
    @Column(name = "creditpassed_time")
    private int creditpassedTime;
    @Column(name = "workpassed")
    private int workpassed;
    @Column(name = "workpassed_time")
    private int workpassed_time;
    @Column(name = "incomepassed")
    private int incomepassed;
    @Column(name = "incomepassed_time")
    private int incomepassedTime;
    @Column(name = "housepassed")
    private int housepassed;
    @Column(name = "housepassed_time")
    private int housepassedTime;
    @Column(name = "carpassed")
    private int carpassed;
    @Column(name = "carpassed_time")
    private int carpassedTime;
    @Column(name = "marrypassed")
    private int marrypassed;
    @Column(name = "marrypassed_time")
    private int marrypassedTime;
    @Column(name = "edupassed")
    private int edupassed;
    @Column(name = "edupassed_time")
    private int edupassedTime;
    @Column(name = "skillpassed")
    private int skillpassed;
    @Column(name = "skillpassed_time")
    private int skillpassedTime;
    @Column(name = "videopassed")
    private int videopassed;
    @Column(name = "videopassed_time")
    private int videopassedTime;
    @Column(name = "mobiletruepassed")
    private int mobiletruepassed;
    @Column(name = "mobiletruepassed_time")
    private int mobiletruepassedTime;
    @Column(name = "residencepassed")
    private int residencepassed;
    @Column(name = "residencepassed_time")
    private int residencepassedTime;
    @Column(name = "alipay_id")
    private String allipyId;
    @Column(name = "qq_id")
    private String qqId;
    @Column(name = "taobao_id")
    private String taoBaoId;
    @Column(name = "info_down")
    private String infoDown;
    @Column(name = "sealpassed")
    private int sealpassed;
    @Column(name = "paypassword")
    private String paypassword;
    @Column(name = "apns_code")
    private String apnsCode;
    @Column(name = "ips_acct_no")
    private String ipsAcctNo;
    @Column(name = "emailpassed")
    private int emailpassed;
    @Column(name = "tmp_email")
    private String tmpEmail;
    @Column(name = "view_info")
    private String viewInfo;
    @Column(name = "referral_rate")
    private BigDecimal referralRate;
    @Column(name = "user_type")
    private int userType;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "register_ip")
    private String registerIp;
    @Column(name = "admin_id")
    private int adminId;
    @Column(name = "customer_id")
    private int customerId;
    @Column(name = "is_black")
    private int isBlack;
    @Column(name = "vip_id")
    private int vipId;
    @Column(name = "vip_state")
    private int vipState;
    @Column(name = "nmc_amount")
    private BigDecimal nmcAmount;
    @Column(name = "ips_mer_code")
    private String ipsMerCode;
    @Column(name = "enterpriseName")
    private String enterpriseName;
    @Column(name = "bankLicense")
    private String bankLicense;
    @Column(name = "orgNo")
    private String orgNo;
    @Column(name = "businessLicense")
    private String businessLicense;
    @Column(name = "taxNo")
    private String taxNo;
    @Column(name = "u_year")
    private String uYear;
    @Column(name = "u_special")
    private String uSpecial;
    @Column(name = "u_alipay")
    private String Ualipay;
    @Column(name = "email_encrypt")
    private String emailEncrypt;
    @Column(name = "real_name_encrypt")
    private String realNameEncrypt;
    @Column(name = "idno_encrypt")
    private String idNoEncrypt;
    @Column(name = "mobile_encrypt")
    private String mobileEncrypt;
    @Column(name = "money_encrypt")
    private String moneyEncrypt;
    @Column(name = "wx_openid")
    private String wxOpenId;
    @Column(name = "total_invite_borrow_money")
    private BigDecimal totalInviteBorrowMoney;
    @Column(name = "total_invite_invest_money")
    private BigDecimal totalInviteInvestMoney;
    @Column(name = "vip_end_time")
    private int vipEndTime;
    @Column(name = "UsrId")
    private String usrId;
    @Column(name = "CardId")
    private String cardId;
    @Column(name = "openBankId")
    private String openBankId;
    @Column(name = "tuiguang")
    private String tuiGuang;
    @Column(name = "service")
    private String service;
    @Column(name = "mobile_status")
    private int mobileStatus;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getCompanyBrief() {
        return companyBrief;
    }

    public void setCompanyBrief(String companyBrief) {
        this.companyBrief = companyBrief;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getAcctType() {
        return acctType;
    }

    public void setAcctType(int acctType) {
        this.acctType = acctType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public int getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(int updateTime) {
        this.updateTime = updateTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public int getIdCardpassed() {
        return idCardpassed;
    }

    public void setIdCardpassed(int idCardpassed) {
        this.idCardpassed = idCardpassed;
    }

    public int getIdCardpassedTime() {
        return idCardpassedTime;
    }

    public void setIdCardpassedTime(int idCardpassedTime) {
        this.idCardpassedTime = idCardpassedTime;
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

    public int getMobilePassed() {
        return mobilePassed;
    }

    public void setMobilePassed(int mobilePassed) {
        this.mobilePassed = mobilePassed;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getQuota() {
        return quota;
    }

    public void setQuota(BigDecimal quota) {
        this.quota = quota;
    }

    public BigDecimal getLockMoney() {
        return lockMoney;
    }

    public void setLockMoney(BigDecimal lockMoney) {
        this.lockMoney = lockMoney;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getRefererMeno() {
        return refererMeno;
    }

    public void setRefererMeno(String refererMeno) {
        this.refererMeno = refererMeno;
    }

    public int getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(int loginTime) {
        this.loginTime = loginTime;
    }

    public int getReferralCount() {
        return referralCount;
    }

    public void setReferralCount(int referralCount) {
        this.referralCount = referralCount;
    }

    public String getPasswordVerify() {
        return passwordVerify;
    }

    public void setPasswordVerify(String passwordVerify) {
        this.passwordVerify = passwordVerify;
    }

    public int getIntegerateId() {
        return integerateId;
    }

    public void setIntegerateId(int integerateId) {
        this.integerateId = integerateId;
    }

    public String getSinaId() {
        return sinaId;
    }

    public void setSinaId(String sinaId) {
        this.sinaId = sinaId;
    }

    public int getRenrenId() {
        return renrenId;
    }

    public void setRenrenId(int renrenId) {
        this.renrenId = renrenId;
    }

    public int getKaiXinId() {
        return kaiXinId;
    }

    public void setKaiXinId(int kaiXinId) {
        this.kaiXinId = kaiXinId;
    }

    public int getSohuId() {
        return sohuId;
    }

    public void setSohuId(int sohuId) {
        this.sohuId = sohuId;
    }

    public String getBindVerify() {
        return bindVerify;
    }

    public void setBindVerify(String bindVerify) {
        this.bindVerify = bindVerify;
    }

    public int getVerifyCreateTime() {
        return verifyCreateTime;
    }

    public void setVerifyCreateTime(int verifyCreateTime) {
        this.verifyCreateTime = verifyCreateTime;
    }

    public String getTencentId() {
        return tencentId;
    }

    public void setTencentId(String tencentId) {
        this.tencentId = tencentId;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public int getLoginPayTime() {
        return loginPayTime;
    }

    public void setLoginPayTime(int loginPayTime) {
        this.loginPayTime = loginPayTime;
    }

    public int getFocusCount() {
        return focusCount;
    }

    public void setFocusCount(int focusCount) {
        this.focusCount = focusCount;
    }

    public int getFocusedCount() {
        return focusedCount;
    }

    public void setFocusedCount(int focusedCount) {
        this.focusedCount = focusedCount;
    }

    public int getnProvinceId() {
        return nProvinceId;
    }

    public void setnProvinceId(int nProvinceId) {
        this.nProvinceId = nProvinceId;
    }

    public int getnCityId() {
        return nCityId;
    }

    public void setnCityId(int nCityId) {
        this.nCityId = nCityId;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getByear() {
        return byear;
    }

    public void setByear(int byear) {
        this.byear = byear;
    }

    public int getBmonth() {
        return bmonth;
    }

    public void setBmonth(int bmonth) {
        this.bmonth = bmonth;
    }

    public int getBday() {
        return bday;
    }

    public void setBday(int bday) {
        this.bday = bday;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    public int getGraduatedYear() {
        return graduatedYear;
    }

    public void setGraduatedYear(int graduatedYear) {
        this.graduatedYear = graduatedYear;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getEduValidCode() {
        return eduValidCode;
    }

    public void setEduValidCode(String eduValidCode) {
        this.eduValidCode = eduValidCode;
    }

    public int getHasSendVideo() {
        return hasSendVideo;
    }

    public void setHasSendVideo(int hasSendVideo) {
        this.hasSendVideo = hasSendVideo;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public int getHasChild() {
        return hasChild;
    }

    public void setHasChild(int hasChild) {
        this.hasChild = hasChild;
    }

    public int getHasHouse() {
        return hasHouse;
    }

    public void setHasHouse(int hasHouse) {
        this.hasHouse = hasHouse;
    }

    public int getHouseloan() {
        return houseloan;
    }

    public void setHouseloan(int houseloan) {
        this.houseloan = houseloan;
    }

    public int getHasCar() {
        return hasCar;
    }

    public void setHasCar(int hasCar) {
        this.hasCar = hasCar;
    }

    public int getCarloan() {
        return carloan;
    }

    public void setCarloan(int carloan) {
        this.carloan = carloan;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public int getLocateTime() {
        return locateTime;
    }

    public void setLocateTime(int locateTime) {
        this.locateTime = locateTime;
    }

    public float getxPoint() {
        return xPoint;
    }

    public void setxPoint(float xPoint) {
        this.xPoint = xPoint;
    }

    public float getyPoint() {
        return yPoint;
    }

    public void setyPoint(float yPoint) {
        this.yPoint = yPoint;
    }

    public int getTopicCount() {
        return topicCount;
    }

    public void setTopicCount(int topicCount) {
        this.topicCount = topicCount;
    }

    public int getFavCount() {
        return favCount;
    }

    public void setFavCount(int favCount) {
        this.favCount = favCount;
    }

    public int getFavedCount() {
        return favedCount;
    }

    public void setFavedCount(int favedCount) {
        this.favedCount = favedCount;
    }

    public int getInsiteCount() {
        return insiteCount;
    }

    public void setInsiteCount(int insiteCount) {
        this.insiteCount = insiteCount;
    }

    public int getOutSiteCount() {
        return outSiteCount;
    }

    public void setOutSiteCount(int outSiteCount) {
        this.outSiteCount = outSiteCount;
    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getSinaAppKey() {
        return sinaAppKey;
    }

    public void setSinaAppKey(String sinaAppKey) {
        this.sinaAppKey = sinaAppKey;
    }

    public String getSinaAppSecret() {
        return sinaAppSecret;
    }

    public void setSinaAppSecret(String sinaAppSecret) {
        this.sinaAppSecret = sinaAppSecret;
    }

    public int getIsSynSina() {
        return isSynSina;
    }

    public void setIsSynSina(int isSynSina) {
        this.isSynSina = isSynSina;
    }

    public String getTencentAppKey() {
        return tencentAppKey;
    }

    public void setTencentAppKey(String tencentAppKey) {
        this.tencentAppKey = tencentAppKey;
    }

    public String getTencentAppSecret() {
        return tencentAppSecret;
    }

    public void setTencentAppSecret(String tencentAppSecret) {
        this.tencentAppSecret = tencentAppSecret;
    }

    public int getIsSynTencent() {
        return isSynTencent;
    }

    public void setIsSynTencent(int isSynTencent) {
        this.isSynTencent = isSynTencent;
    }

    public String gettAccessToken() {
        return tAccessToken;
    }

    public void settAccessToken(String tAccessToken) {
        this.tAccessToken = tAccessToken;
    }

    public String gettOpenkey() {
        return tOpenkey;
    }

    public void settOpenkey(String tOpenkey) {
        this.tOpenkey = tOpenkey;
    }

    public String gettOpenid() {
        return tOpenid;
    }

    public void settOpenid(String tOpenid) {
        this.tOpenid = tOpenid;
    }

    public String getSinaToken() {
        return sinaToken;
    }

    public void setSinaToken(String sinaToken) {
        this.sinaToken = sinaToken;
    }

    public int getIsBorrowOut() {
        return isBorrowOut;
    }

    public void setIsBorrowOut(int isBorrowOut) {
        this.isBorrowOut = isBorrowOut;
    }

    public int getIsBorrowInt() {
        return isBorrowInt;
    }

    public void setIsBorrowInt(int isBorrowInt) {
        this.isBorrowInt = isBorrowInt;
    }

    public int getCreditpassed() {
        return creditpassed;
    }

    public void setCreditpassed(int creditpassed) {
        this.creditpassed = creditpassed;
    }

    public int getCreditpassedTime() {
        return creditpassedTime;
    }

    public void setCreditpassedTime(int creditpassedTime) {
        this.creditpassedTime = creditpassedTime;
    }

    public int getWorkpassed() {
        return workpassed;
    }

    public void setWorkpassed(int workpassed) {
        this.workpassed = workpassed;
    }

    public int getWorkpassed_time() {
        return workpassed_time;
    }

    public void setWorkpassed_time(int workpassed_time) {
        this.workpassed_time = workpassed_time;
    }

    public int getIncomepassed() {
        return incomepassed;
    }

    public void setIncomepassed(int incomepassed) {
        this.incomepassed = incomepassed;
    }

    public int getIncomepassedTime() {
        return incomepassedTime;
    }

    public void setIncomepassedTime(int incomepassedTime) {
        this.incomepassedTime = incomepassedTime;
    }

    public int getHousepassed() {
        return housepassed;
    }

    public void setHousepassed(int housepassed) {
        this.housepassed = housepassed;
    }

    public int getHousepassedTime() {
        return housepassedTime;
    }

    public void setHousepassedTime(int housepassedTime) {
        this.housepassedTime = housepassedTime;
    }

    public int getCarpassed() {
        return carpassed;
    }

    public void setCarpassed(int carpassed) {
        this.carpassed = carpassed;
    }

    public int getCarpassedTime() {
        return carpassedTime;
    }

    public void setCarpassedTime(int carpassedTime) {
        this.carpassedTime = carpassedTime;
    }

    public int getMarrypassed() {
        return marrypassed;
    }

    public void setMarrypassed(int marrypassed) {
        this.marrypassed = marrypassed;
    }

    public int getMarrypassedTime() {
        return marrypassedTime;
    }

    public void setMarrypassedTime(int marrypassedTime) {
        this.marrypassedTime = marrypassedTime;
    }

    public int getEdupassed() {
        return edupassed;
    }

    public void setEdupassed(int edupassed) {
        this.edupassed = edupassed;
    }

    public int getEdupassedTime() {
        return edupassedTime;
    }

    public void setEdupassedTime(int edupassedTime) {
        this.edupassedTime = edupassedTime;
    }

    public int getSkillpassed() {
        return skillpassed;
    }

    public void setSkillpassed(int skillpassed) {
        this.skillpassed = skillpassed;
    }

    public int getSkillpassedTime() {
        return skillpassedTime;
    }

    public void setSkillpassedTime(int skillpassedTime) {
        this.skillpassedTime = skillpassedTime;
    }

    public int getVideopassed() {
        return videopassed;
    }

    public void setVideopassed(int videopassed) {
        this.videopassed = videopassed;
    }

    public int getVideopassedTime() {
        return videopassedTime;
    }

    public void setVideopassedTime(int videopassedTime) {
        this.videopassedTime = videopassedTime;
    }

    public int getMobiletruepassed() {
        return mobiletruepassed;
    }

    public void setMobiletruepassed(int mobiletruepassed) {
        this.mobiletruepassed = mobiletruepassed;
    }

    public int getMobiletruepassedTime() {
        return mobiletruepassedTime;
    }

    public void setMobiletruepassedTime(int mobiletruepassedTime) {
        this.mobiletruepassedTime = mobiletruepassedTime;
    }

    public int getResidencepassed() {
        return residencepassed;
    }

    public void setResidencepassed(int residencepassed) {
        this.residencepassed = residencepassed;
    }

    public int getResidencepassedTime() {
        return residencepassedTime;
    }

    public void setResidencepassedTime(int residencepassedTime) {
        this.residencepassedTime = residencepassedTime;
    }

    public String getAllipyId() {
        return allipyId;
    }

    public void setAllipyId(String allipyId) {
        this.allipyId = allipyId;
    }

    public String getQqId() {
        return qqId;
    }

    public void setQqId(String qqId) {
        this.qqId = qqId;
    }

    public String getTaoBaoId() {
        return taoBaoId;
    }

    public void setTaoBaoId(String taoBaoId) {
        this.taoBaoId = taoBaoId;
    }

    public String getInfoDown() {
        return infoDown;
    }

    public void setInfoDown(String infoDown) {
        this.infoDown = infoDown;
    }

    public int getSealpassed() {
        return sealpassed;
    }

    public void setSealpassed(int sealpassed) {
        this.sealpassed = sealpassed;
    }

    public String getPaypassword() {
        return paypassword;
    }

    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword;
    }

    public String getApnsCode() {
        return apnsCode;
    }

    public void setApnsCode(String apnsCode) {
        this.apnsCode = apnsCode;
    }

    public String getIpsAcctNo() {
        return ipsAcctNo;
    }

    public void setIpsAcctNo(String ipsAcctNo) {
        this.ipsAcctNo = ipsAcctNo;
    }

    public int getEmailpassed() {
        return emailpassed;
    }

    public void setEmailpassed(int emailpassed) {
        this.emailpassed = emailpassed;
    }

    public String getTmpEmail() {
        return tmpEmail;
    }

    public void setTmpEmail(String tmpEmail) {
        this.tmpEmail = tmpEmail;
    }

    public String getViewInfo() {
        return viewInfo;
    }

    public void setViewInfo(String viewInfo) {
        this.viewInfo = viewInfo;
    }

    public BigDecimal getReferralRate() {
        return referralRate;
    }

    public void setReferralRate(BigDecimal referralRate) {
        this.referralRate = referralRate;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getIsBlack() {
        return isBlack;
    }

    public void setIsBlack(int isBlack) {
        this.isBlack = isBlack;
    }

    public int getVipId() {
        return vipId;
    }

    public void setVipId(int vipId) {
        this.vipId = vipId;
    }

    public int getVipState() {
        return vipState;
    }

    public void setVipState(int vipState) {
        this.vipState = vipState;
    }

    public BigDecimal getNmcAmount() {
        return nmcAmount;
    }

    public void setNmcAmount(BigDecimal nmcAmount) {
        this.nmcAmount = nmcAmount;
    }

    public String getIpsMerCode() {
        return ipsMerCode;
    }

    public void setIpsMerCode(String ipsMerCode) {
        this.ipsMerCode = ipsMerCode;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getBankLicense() {
        return bankLicense;
    }

    public void setBankLicense(String bankLicense) {
        this.bankLicense = bankLicense;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public String getuYear() {
        return uYear;
    }

    public void setuYear(String uYear) {
        this.uYear = uYear;
    }

    public String getuSpecial() {
        return uSpecial;
    }

    public void setuSpecial(String uSpecial) {
        this.uSpecial = uSpecial;
    }

    public String getUalipay() {
        return Ualipay;
    }

    public void setUalipay(String ualipay) {
        Ualipay = ualipay;
    }

    public String getEmailEncrypt() {
        return emailEncrypt;
    }

    public void setEmailEncrypt(String emailEncrypt) {
        this.emailEncrypt = emailEncrypt;
    }

    public String getRealNameEncrypt() {
        return realNameEncrypt;
    }

    public void setRealNameEncrypt(String realNameEncrypt) {
        this.realNameEncrypt = realNameEncrypt;
    }

    public String getIdNoEncrypt() {
        return idNoEncrypt;
    }

    public void setIdNoEncrypt(String idNoEncrypt) {
        this.idNoEncrypt = idNoEncrypt;
    }

    public String getMobileEncrypt() {
        return mobileEncrypt;
    }

    public void setMobileEncrypt(String mobileEncrypt) {
        this.mobileEncrypt = mobileEncrypt;
    }

    public String getMoneyEncrypt() {
        return moneyEncrypt;
    }

    public void setMoneyEncrypt(String moneyEncrypt) {
        this.moneyEncrypt = moneyEncrypt;
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    public BigDecimal getTotalInviteBorrowMoney() {
        return totalInviteBorrowMoney;
    }

    public void setTotalInviteBorrowMoney(BigDecimal totalInviteBorrowMoney) {
        this.totalInviteBorrowMoney = totalInviteBorrowMoney;
    }

    public BigDecimal getTotalInviteInvestMoney() {
        return totalInviteInvestMoney;
    }

    public void setTotalInviteInvestMoney(BigDecimal totalInviteInvestMoney) {
        this.totalInviteInvestMoney = totalInviteInvestMoney;
    }

    public int getVipEndTime() {
        return vipEndTime;
    }

    public void setVipEndTime(int vipEndTime) {
        this.vipEndTime = vipEndTime;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getOpenBankId() {
        return openBankId;
    }

    public void setOpenBankId(String openBankId) {
        this.openBankId = openBankId;
    }

    public String getTuiGuang() {
        return tuiGuang;
    }

    public void setTuiGuang(String tuiGuang) {
        this.tuiGuang = tuiGuang;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getMobileStatus() {
        return mobileStatus;
    }

    public void setMobileStatus(int mobileStatus) {
        this.mobileStatus = mobileStatus;
    }

}
