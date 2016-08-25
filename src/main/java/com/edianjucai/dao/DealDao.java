package com.edianjucai.dao;

import java.text.ParseException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edianjucai.model.Deal;
import com.edianjucai.model.DealCate;
import com.edianjucai.model.GoodsCate;
import com.edianjucai.model.GoodsOrder;
import com.edianjucai.page.DealCatePagination;
import com.edianjucai.page.DealPagination;
import com.edianjucai.page.GoodsCatePagination;
import com.edianjucai.page.GoodsOrderPagination;
import com.edianjucai.util.DateFormatUtils;
import com.edianjucai.util.XMLReaderUtil;

@Repository
public class DealDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public List<Deal> findAllDeal(DealPagination dealPagination) {
        String hql = XMLReaderUtil.getSql("deal");
        Query query = getSession().createQuery(hql);
        String name = dealPagination.getName() != null ? dealPagination.getName() : "";
        Integer uId = dealPagination.getUserId();
        Integer loantype = dealPagination.getLoantype();
        Integer cateId = dealPagination.getCateId();
        Integer dealStatus = dealPagination.getDealStatus();
        String userId = (String) (uId != null ? uId : "");
        query.setString("name", "%" + name + "%");
        query.setString("userId", "%" + userId + "%");
        query.setString("loantype", "%" + ((String) (loantype != null ? loantype : "")) + "%");
        query.setString("cateId", "%" + ((String) (cateId != null ? cateId : "")) + "%");
        query.setString("dealStatus", "%" + ((String) (dealStatus != null ? dealStatus : "")) + "%");
        query.setFirstResult(dealPagination.getStart());
        query.setMaxResults(dealPagination.getPageSize());
        return query.list();
    }

    public int getDealCount(DealPagination dealPagination) {
        String sql = XMLReaderUtil.getSql("dealCount");
        String name = dealPagination.getName() != null ? dealPagination.getName() : "";
        Integer uId = dealPagination.getUserId();
        Integer loantype = dealPagination.getLoantype();
        Integer cateId = dealPagination.getCateId();
        Integer dealStatus = dealPagination.getDealStatus();
        String userId = (String) (uId != null ? uId : "");

        sql += " where name like \'%" + name + "%\' and user_id like \'%" + userId + "%\' and loantype like \'%"
                + ((String) (loantype != null ? loantype : "")) + "%\' and cate_id like \'%"
                + ((String) (cateId != null ? cateId : "")) + "%\' and deal_status like \'%"
                + ((String) (dealStatus != null ? dealStatus : "")) + "%\'";

        SQLQuery query = getSession().createSQLQuery(sql);
        String countStr = query.uniqueResult().toString();
        int count = Integer.valueOf(countStr);
        return count;
    }

    public Deal getDealById(int id) {
        try {
            return (Deal) getSession().get(Deal.class, id);
        } catch (Exception e) {
            return null;
        }
    }

    public boolean modifyDeal(Deal deal) {
        try {
            getSession().update(deal);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean addDeal(Deal deal) {
        try {
            getSession().save(deal);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // deal cate

    @SuppressWarnings("unchecked")
    public List<DealCate> findAllDealCate() {
        String hql = XMLReaderUtil.getSql("findAllDealCate");
        Query query = getSession().createQuery(hql);
        return query.list();
    }
}
