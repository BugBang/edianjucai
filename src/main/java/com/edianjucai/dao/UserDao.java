package com.edianjucai.dao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edianjucai.model.Bank;
import com.edianjucai.model.Ecv;
import com.edianjucai.model.EcvType;
import com.edianjucai.model.MsgSystem;
import com.edianjucai.model.User;
import com.edianjucai.model.UserBank;
import com.edianjucai.model.vo.UserVo;
import com.edianjucai.page.EcvPagination;
import com.edianjucai.page.EcvTypePagination;
import com.edianjucai.page.MsgSystemPagination;
import com.edianjucai.page.UserBankPagination;
import com.edianjucai.page.UserPagination;
import com.edianjucai.util.DaoUtil;
import com.edianjucai.util.DateFormatUtils;
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

    public List<UserVo> findAllUser(UserPagination userPagination) throws ParseException {

        String sql = XMLReaderUtil.getSql("user");
        sql += " where user_name like \'%" + (userPagination.getUserName() != null ? userPagination.getUserName() : "")
                + "%\' and mobile like \'%" + (userPagination.getMobile() != null ? userPagination.getMobile() : "")
                + "%\' and real_name like \'%"
                + (userPagination.getRealName() != null ? userPagination.getRealName() : "") + "%\'";
        if (userPagination.getPid() != null) {
            sql += " and pid = " + userPagination.getPid();
        }

        String beginTime = userPagination.getBeginTime() != null ? userPagination.getBeginTime() : "";
        String endTime = userPagination.getEndTime() != null ? userPagination.getEndTime() : "";
        if (!beginTime.isEmpty() && !endTime.isEmpty()) {
            sql += " and create_time >= " + DateFormatUtils.StringToDate(beginTime, "MM/dd/yyyy").getTime() / 1000
                    + " and create_time <= " + DateFormatUtils.StringToDate(endTime, "MM/dd/yyyy").getTime() / 1000;
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

        List<UserVo> users = DaoUtil.getVoListBySql(getSession(), sql, UserVo.class, scalars, userPagination.getStart(),
                userPagination.getPageSize());

        for (UserVo user : users) {
            user.setMoney(dealLoadDao.getSumDealLoadByUserId(user.getId()));
        }

        return users;
    }

    public int getUserCount(UserPagination userPagination) throws ParseException {
        String sql = XMLReaderUtil.getSql("userCount");
        sql += " where user_name like \'%" + (userPagination.getUserName() != null ? userPagination.getUserName() : "")
                + "%\' and mobile like \'%" + (userPagination.getMobile() != null ? userPagination.getMobile() : "")
                + "%\' and real_name like \'%"
                + (userPagination.getRealName() != null ? userPagination.getRealName() : "")
                + "%\'";
        if (userPagination.getPid() != null) {
            sql += " and pid = " + userPagination.getPid();
        }

        String beginTime = userPagination.getBeginTime() != null ? userPagination.getBeginTime() : "";
        String endTime = userPagination.getEndTime() != null ? userPagination.getEndTime() : "";
        if (!beginTime.isEmpty() && !endTime.isEmpty()) {
            sql += " and create_time >= " + DateFormatUtils.StringToDate(beginTime, "MM/dd/yyyy").getTime() / 1000
                    + " and create_time <= " + DateFormatUtils.StringToDate(endTime, "MM/dd/yyyy").getTime() / 1000;
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
        if (userName.isEmpty()) {
            return null;
        }
        String sql = XMLReaderUtil.getSql("getUserIdByName");
        sql += " where user_name=?";
        Map<String, Type> scalars = new HashMap<String, Type>();
        scalars.put("id", StandardBasicTypes.INTEGER);
        List<UserVo> users = DaoUtil.getVoListBySql(getSession(), sql, UserVo.class, scalars, userName);
        if (users.isEmpty() || users.size() > 0) {
            int id = users.get(0).getId();
            return id;
        } else {
            return null;
        }
    }
    
    @SuppressWarnings("unchecked")
    public List<User> getUserIdsByName(String userName) {
        String hql = XMLReaderUtil.getSql("getUserIdsByName");
        Query query = getSession().createQuery(hql);
        query.setString("userName", "%" + (userName != null ? userName : "") + "%");
        return query.list();
    }

    @SuppressWarnings("unchecked")
    public List<UserBank> findAllUserBank(UserBankPagination userBankPagination) {
        String hql = XMLReaderUtil.getSql("findAllUserBank");
        Query query = getSession().createQuery(hql);
        query.setParameterList("userIds", userBankPagination.getUserIds());
        return query.list();
       /* if (userBankPagination.getUserId() != null) {
            hql += " where userId = :userId";
            Query query = getSession().createQuery(hql);
            query.setString("userId", String.valueOf(userBankPagination.getUserId()));
            query.setFirstResult(userBankPagination.getStart());
            query.setMaxResults(userBankPagination.getPageSize());
            return query.list();

        } else {
            if (userBankPagination.getUserName() == null) {
                Query query = getSession().createQuery(hql);
                query.setFirstResult(userBankPagination.getStart());
                query.setMaxResults(userBankPagination.getPageSize());
                return query.list();
            }
            return query.list();
        }*/
    }

    public int getUserBankCount(UserBankPagination userBankPagination) {
        String hql = XMLReaderUtil.getSql("getUserBankCount");
        Query query = getSession().createQuery(hql);
        query.setParameterList("userIds", userBankPagination.getUserIds());
        String countStr = query.uniqueResult().toString();
        int count = Integer.valueOf(countStr);
        return count;
    }

    public boolean deleteBankCountByIds(List<Integer> ids) {
        Session session = getSession();
        try {
            for (int id : ids) {
                UserBank userBank = (UserBank) session.load(UserBank.class, id);
                session.delete(userBank);
            }
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public Bank getBankById(int id) {
        return (Bank) getSession().get(Bank.class, id);
    }

    // Ect

    @SuppressWarnings("unchecked")
    public List<EcvType> findAllEcvType(EcvTypePagination ecvTypePagination) {
        String hql = XMLReaderUtil.getSql("findAllEctType");
        Query query = getSession().createQuery(hql);
        query.setString("name", "%" + (ecvTypePagination.getName() != null ? ecvTypePagination.getName() : "") + "%");
        query.setFirstResult(ecvTypePagination.getStart());
        query.setMaxResults(ecvTypePagination.getPageSize());
        return query.list();
    }

    public int getEcvTypeCount(EcvTypePagination ecvTypePagination) {
        String sql = XMLReaderUtil.getSql("getEcvTypeCount");
        sql += " where name like \'%" + (ecvTypePagination.getName() != null ? ecvTypePagination.getName() : "")
                + "%\'";
        SQLQuery query = getSession().createSQLQuery(sql);
        String countStr = query.uniqueResult().toString();
        int count = Integer.valueOf(countStr);
        return count;
    }

    public EcvType getEcvTypeById(int id) {
        return (EcvType) getSession().get(EcvType.class, id);
    }

    public boolean modifyEcvType(EcvType ecvType) {
        try {
            getSession().update(ecvType);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean addEcvType(EcvType ecvType) {
        try {
            getSession().save(ecvType);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean createEcv(List<Ecv> ecvs, Ecv ecv) {
        Session session = sessionFactory.openSession();
        try {
            Transaction tx = session.beginTransaction();
            for (int i = 0; i < ecvs.size(); i++) {
                session.save(ecvs.get(i));
                if (i % 20 == 0) {
                    session.flush();
                    session.clear();
                    tx.commit();
                    tx = session.beginTransaction();
                }
            }
            tx.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return false;
        } finally {
            if (session != null) {  
                if (session.isOpen()) {  
                    session.close(); // 关闭Session  
                }  
            }  
        }
    }

    public List<Integer> findAllIdToUser() {
        String sql = XMLReaderUtil.getSql("findAllIdToUser");
        Map<String, Type> scalars = new HashMap<String, Type>();
        scalars.put("id", StandardBasicTypes.INTEGER);
        List<UserVo> userVos = DaoUtil.getVoListBySql(getSession(), sql, UserVo.class, scalars);
        List<Integer> ids = new ArrayList<>();
        for (UserVo userVo : userVos) {
            ids.add(userVo.getId());
        }
        return ids;
    }
    
    @SuppressWarnings("unchecked")
    public List<Ecv> findAllEcv(EcvPagination ecvPagination) {
        String hql = XMLReaderUtil.getSql("findAllEcv");
        Query query = getSession().createQuery(hql);
        if (ecvPagination.getUserId() != null) {
            hql += " where userId = :userId";
            query.setString("userId", String.valueOf(ecvPagination.getUserId()));
        }
        query.setFirstResult(ecvPagination.getStart());
        query.setMaxResults(ecvPagination.getPageSize());
        return query.list();
    }
    
    public int getEcvCount(EcvPagination ecvPagination) {
        String sql = XMLReaderUtil.getSql("getEcvCount");
        if (ecvPagination.getUserId() != null) {
            sql += " where userId = " + ecvPagination.getUserId();
        }
        SQLQuery query = getSession().createSQLQuery(sql);
        String countStr = query.uniqueResult().toString();
        int count = Integer.valueOf(countStr);
        return count;
    }
    
    @SuppressWarnings("unchecked")
    public List<MsgSystem> findAllMsgSystem(MsgSystemPagination msgSystemPagination) {
        String hql = XMLReaderUtil.getSql("findAllMsgSystem");
        Query query = getSession().createQuery(hql);
        query.setString("title", "%" + (msgSystemPagination.getTitle() != null ? msgSystemPagination.getTitle() : "") + "%");
        query.setFirstResult(msgSystemPagination.getStart());
        query.setMaxResults(msgSystemPagination.getPageSize());
        return query.list();
    }
    
    public int getMsgSystemCount(MsgSystemPagination msgSystemPagination) {
        String sql = XMLReaderUtil.getSql("getMsgSystemCount");
        sql += " where title like \'%" + (msgSystemPagination.getTitle() != null ? msgSystemPagination.getTitle() : "") + "%\'";
        SQLQuery query = getSession().createSQLQuery(sql);
        String countStr = query.uniqueResult().toString();
        int count = Integer.valueOf(countStr);
        return count;
    }
    
    public MsgSystem getMsgSystemById(int id) {
        return (MsgSystem)getSession().get(MsgSystem.class, id);
    }
    
    public boolean modifyMsgSystem(MsgSystem msgSystem) {
        try {
            getSession().update(msgSystem);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Integer addMsgSystem(MsgSystem msgSystem) {
        try {
            return (Integer) getSession().save(msgSystem);
        } catch (Exception e) {
            return null;
        }
    }
    

}
