package com.edianjucai.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edianjucai.model.User;
import com.edianjucai.model.vo.UserVo;
import com.edianjucai.page.UserPagination;
import com.edianjucai.util.DaoUtil;
import com.edianjucai.util.XMLReaderUtil;

@Repository
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private DealLoadDao dealLoadDao;
    
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    
    public List<UserVo> findAllUser(UserPagination userPagination) {
        
        String sql = XMLReaderUtil.getSql("user");
        sql += " where idno like \'%" + (userPagination.getIdno() != null ? userPagination.getIdno() : "")
        + "%\' and mobile like \'%" + (userPagination.getMobile() != null ? userPagination.getMobile() : "")
        + "%\' and real_name like \'%" + (userPagination.getRealName() != null ? userPagination.getRealName() : "")
        + "%\' and user_name like \'%" + (userPagination.getUserName() != null ? userPagination.getUserName() : "")+ "%\'";
        
        if (userPagination.getIsEffect() != -1) {
            sql += " and is_effect = " + userPagination.getIsEffect();
        }
        
        if (userPagination.getVipState() != -1) {
            sql += " and vip_state = " + userPagination.getVipState();
        }
        
        sql += " limit ?, ?";
        
        Map<String, Type> scalars = new HashMap<String, Type>();
        scalars.put("id", StandardBasicTypes.INTEGER);
        scalars.put("idno", StandardBasicTypes.STRING);
        scalars.put("userName", StandardBasicTypes.STRING);
        scalars.put("realName", StandardBasicTypes.STRING);
        scalars.put("ipsAcctNo", StandardBasicTypes.STRING);
        scalars.put("tuiGuang", StandardBasicTypes.STRING);
        scalars.put("isEffect", StandardBasicTypes.INTEGER);
        scalars.put("isBlack", StandardBasicTypes.INTEGER);
        scalars.put("createTime", StandardBasicTypes.LONG);
        
        List<UserVo> users = DaoUtil.getVoListBySql(getSession(), sql, UserVo.class, scalars, userPagination.getStart(), userPagination.getPageSize());
        
        for (UserVo user : users) {
            user.setMoney(dealLoadDao.getSumDealLoadByUserId(user.getId()));
        }
        
        return users;
    }
    
    public int getUserCount(UserPagination userPagination) {
        String sql = XMLReaderUtil.getSql("userCount");
        sql += " where idno like \'%" + (userPagination.getIdno() != null ? userPagination.getIdno() : "")
                + "%\' and mobile like \'%" + (userPagination.getMobile() != null ? userPagination.getMobile() : "")
                + "%\' and real_name like \'%" + (userPagination.getRealName() != null ? userPagination.getRealName() : "")
                + "%\' and  user_name like \'%" + (userPagination.getUserName() != null ? userPagination.getUserName() : "") + "%\'";
                
                if (userPagination.getIsEffect() != -1) {
                    sql += " and is_effect = " + userPagination.getIsEffect();
                }
                
                if (userPagination.getVipState() != -1) {
                    sql += " and vip_state = " + userPagination.getVipState();
                }
        SQLQuery query = getSession().createSQLQuery(sql);
        String countStr = query.uniqueResult().toString();
        int count = Integer.valueOf(countStr);
        return count;
    }
    
    public User getUserById(int id) {
        return (User) getSession().get(User.class, id);
    }
    
    public Integer getUserIdByName(String userName) {
        if (userName == null) {
            return null;
        }
        String sql = XMLReaderUtil.getSql("getUserIdByName");
        sql += " where user_name=" + userName;
        Map<String, Type> scalars = new HashMap<String, Type>();
        scalars.put("id", StandardBasicTypes.INTEGER);
        List<UserVo> users = DaoUtil.getVoListBySql(getSession(), sql, UserVo.class, scalars, userName);
        if (users.isEmpty()) {
            int id = users.get(0).getId();
            return id;
        } else {
            return null;
        }
    }
    
}
