package com.edianjucai.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edianjucai.dao.UserDao;
import com.edianjucai.model.vo.UserVo;
import com.edianjucai.page.UserPagination;
import com.edianjucai.util.DateFormatUtils;

@Service
public class UserServiceImpl {

    @Autowired
    private UserDao userDao;
    
    @Transactional
    public List<UserVo> findAllUser(UserPagination userPagination) {
        
        userPagination.setTotalCount(userDao.getUserCount(userPagination));
        List<UserVo> users = (List<UserVo>)userDao.findAllUser(userPagination);
        
        for (UserVo user : users) {
            Date date = new Date();
            date.setTime(user.getCreateTime() * 1000);
            user.setCreateDateStr(DateFormatUtils.dateToString(date, "yyyy年MM月dd日"));
        }
        return users;
    }
}