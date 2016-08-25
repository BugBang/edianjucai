package com.edianjucai.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edianjucai.dao.UserDao;
import com.edianjucai.model.Ecv;
import com.edianjucai.model.EcvType;
import com.edianjucai.model.MsgBox;
import com.edianjucai.model.MsgSystem;
import com.edianjucai.model.User;
import com.edianjucai.model.UserBank;
import com.edianjucai.model.vo.UserBankVo;
import com.edianjucai.model.vo.UserVo;
import com.edianjucai.page.EcvPagination;
import com.edianjucai.page.EcvTypePagination;
import com.edianjucai.page.MsgSystemPagination;
import com.edianjucai.page.UserBankPagination;
import com.edianjucai.page.UserPagination;
import com.edianjucai.util.DateFormatUtils;
import com.edianjucai.util.MD5Util;
import com.edianjucai.util.StringUtil;

@Service
public class UserServiceImpl {

    @Autowired
    private UserDao userDao;
    
    @Transactional
    public List<UserVo> findAllUser(UserPagination userPagination) throws ParseException {
        userPagination.setPid(userDao.getUserIdByName((userPagination.getRefName() != null ? userPagination.getRefName() : "")));
        userPagination.setTotalCount(userDao.getUserCount(userPagination));
        List<UserVo> users = (List<UserVo>)userDao.findAllUser(userPagination);
        
        for (UserVo user : users) {
            Date date = new Date();
            date.setTime(user.getCreateTime() * 1000);
            user.setCreateDateStr(DateFormatUtils.dateToString(date, "yyyy年MM月dd日"));
        }
        return users;
    }
    
    @Transactional
    public List<UserBankVo> findAllUserBank(UserBankPagination userBankPagination) {
        List<User> users = userDao.getUserIdsByName(userBankPagination.getUserName());
        List<Integer> ids = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            ids.add(users.get(i).getId());
        }
        userBankPagination.setUserIds(ids);
        userBankPagination.setTotalCount(userDao.getUserBankCount(userBankPagination));
        List<UserBankVo> vos = new ArrayList<>();
        List<UserBank> pos = userDao.findAllUserBank(userBankPagination);
        for (UserBank po : pos) {
            vos.add(poToVo(po));
        }
        return vos;
    }
    
    @Transactional
    private UserBankVo poToVo(UserBank po) {
        UserBankVo vo = new UserBankVo();
        
        vo.setId(po.getId());
        vo.setUserName((userDao.getUserById(po.getUserId()) != null ?userDao.getUserById(po.getUserId()).getUserName() : "没有此会员"));
        vo.setBankName((userDao.getBankById(po.getBankId()) != null ? userDao.getBankById(po.getBankId()).getName() : ""));
        vo.setBankCard(po.getBankCard());
        vo.setBankZone(po.getBankZone());
        vo.setMobile(po.getMobile());
        vo.setRealName(po.getRealName());
        vo.setRegionLv1(po.getRegionLv1());
        vo.setRegionLv2(po.getRegionLv2());
        vo.setRegionLv3(po.getRegionLv3());
        vo.setRegionLv4(po.getRegionLv4());
        return vo;
    }
    @Transactional
    public boolean deleteUserBankById(List<Integer> ids) {
        if (userDao.deleteBankCountByIds(ids)) {
            return true;
        } else {
            return false;
        }
    }
    
    // ecv 
    
    @Transactional
    public List<EcvType> findAllEcvType(EcvTypePagination ecvTypePagination) {
        ecvTypePagination.setTotalCount(userDao.getEcvTypeCount(ecvTypePagination));
        List<EcvType> ecvTypes = userDao.findAllEcvType(ecvTypePagination);
        return ecvTypes;
    }
    
    @Transactional
    public EcvType getEcvTypeById(int id) {
        return userDao.getEcvTypeById(id);
    }
    
    @Transactional
    public boolean modifyEcvType(EcvType ecvType) {
        return userDao.modifyEcvType(ecvType);
    }
    
    @Transactional
    public boolean addEcvType(EcvType ecvType) {
        return userDao.addEcvType(ecvType);
    }
    
    @Transactional
    public boolean createEcv(int ecvTypeId, String idStr, int grantType, boolean isCreatePassword) {
        Ecv ecv = new Ecv();
        List<Integer> ids = new ArrayList<>();
        EcvType ecvType = userDao.getEcvTypeById(ecvTypeId);
        ecv.setMoney(ecvType.getMoney());
        ecv.setEcvTypeId(ecvTypeId);
        ecv.setBeginTime(ecvType.getBeginTime());
        ecv.setEndTime(ecvType.getEndTime());
        ecv.setUseLimit(ecvType.getUseLimit());
        if (grantType == 0) {
            ids = userDao.findAllIdToUser();
        } else {
            ids = StringUtil.stringToIntList(idStr);
        }
        
        
        List<Ecv> ecvs = new ArrayList<>();
        for (Integer id : ids) {
            String password = "";
            if (isCreatePassword) {
                password = MD5Util.generatePassword();
            }
            Ecv e = new Ecv(MD5Util.MD5Bit12(UUID.randomUUID().toString()), password, ecv.getUseLimit(), ecv.getUseCount(), id,
                    ecv.getBeginTime(), ecv.getEndTime(), ecv.getMoney(), ecv.getEcvTypeId());
            ecvs.add(e);
        }

        return userDao.createEcv(ecvs, ecv);
    }
    
    @Transactional
    public List<Ecv> findAllEcv(EcvPagination ecvPagination) {
        ecvPagination.setUserId(userDao.getUserIdByName(ecvPagination.getUserName() != null ? ecvPagination.getUserName() : ""));
        ecvPagination.setTotalCount(userDao.getEcvCount(ecvPagination));
        List<Ecv> ecvs = userDao.findAllEcv(ecvPagination);
        return ecvs;
    }
    
    @Transactional
    public List<MsgSystem> findAllMsgSystem(MsgSystemPagination msgSystemPagination) {
        msgSystemPagination.setTotalCount(userDao.getMsgSystemCount(msgSystemPagination));
        List<MsgSystem> msgSystems = userDao.findAllMsgSystem(msgSystemPagination);
        return msgSystems;
    }
    
    @Transactional
    public MsgSystem getMsgSystemById(int id) {
        return userDao.getMsgSystemById(id);
    }
    
    @Transactional
    public boolean modifyMsgSystem(MsgSystem msgSystem) {
        return userDao.modifyMsgSystem(msgSystem);
    }
    
    @Transactional
    public boolean addMsgSystem(MsgSystem msgSystem) {
        Integer msgSystemId = userDao.addMsgSystem(msgSystem);
        if (msgSystemId != null) {
            List<String> userNames = StringUtil.stringToStringList(msgSystem.getUserNames(), ",");
            for (String userName : userNames) {
                int userId = userDao.getUserIdByName(userName);
                User user = userDao.getUserById(userId);
                String groupKey = 0 + "_" + userId + "_" + msgSystemId;
                MsgBox msgBox = new MsgBox(msgSystem.getTitle(), msgSystem.getContent(), 0, userId, msgSystemId, 0, groupKey, 0, 0);
            }
            return true;
        } else {
            return false;
        }
    }
    
}
