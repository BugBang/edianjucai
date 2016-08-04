package com.edianjucai.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edianjucai.model.UserVo;
import com.edianjucai.page.Pagination;
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
    
    public List<UserVo> findAllUser() {
        String sql = XMLReaderUtil.getSql("user");
        sql += "limit ?, ?";
        
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
        
        Pagination pagination = new Pagination();
        pagination.setTotalCount(userCount());
        pagination.setPageSize(12);
        pagination.setCurrentPage(1);
        
        List<UserVo> users = DaoUtil.getVoListBySql(getSession(), sql, UserVo.class, scalars, pagination.getStart(), pagination.getPageSize());
        
        for (UserVo user : users) {
            user.setMoney(dealLoadDao.getSumDealLoadByUserId(user.getId()));
        }
        
        return users;
    }
    
    public int userCount() {
        Query query = getSession().createQuery("select count(*) from User");
        String countStr = query.uniqueResult().toString();
        int count = Integer.valueOf(countStr);
        return count;
    }
}
