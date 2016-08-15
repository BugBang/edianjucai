package com.edianjucai.dao;

import java.text.ParseException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edianjucai.model.Goods;
import com.edianjucai.model.GoodsCate;
import com.edianjucai.model.GoodsOrder;
import com.edianjucai.page.GoodsCatePagination;
import com.edianjucai.page.GoodsOrderPagination;
import com.edianjucai.page.GoodsPagination;
import com.edianjucai.util.DateFormatUtils;
import com.edianjucai.util.XMLReaderUtil;

@Repository
public class GoodsDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public List<Goods> findAllGoods(GoodsPagination goodsPagination) {
        String hql = XMLReaderUtil.getSql("goods");
        Query query = getSession().createQuery(hql);
        query.setString("name", "%" + goodsPagination.getName() + "%");
        query.setFirstResult(goodsPagination.getStart());
        query.setMaxResults(goodsPagination.getPageSize());

        return query.list();
    }

    public int getGoodsCount(GoodsPagination goodsPagination) {
        String sql = XMLReaderUtil.getSql("goodsCount");
        sql += " where name like\'%" + (goodsPagination.getName() != null ? goodsPagination.getName() : "") + "%\'";
        String countStr = getSession().createSQLQuery(sql).uniqueResult().toString();
        return Integer.valueOf(countStr);
    }

    public Goods getGoodsById(int id) {
        try {
            return (Goods) getSession().get(Goods.class, id);
        } catch (Exception e) {
            return null;
        }
    }

    public boolean addGoods(Goods goods) {
        try {
            getSession().save(goods);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean modifyGoods(Goods goods) {
        try {
            getSession().update(goods);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // good cate
    @SuppressWarnings("unchecked")
    public List<GoodsCate> findAllGoodsCate(GoodsCatePagination goodsCatePagination) {
        String hql = XMLReaderUtil.getSql("goodsCate");
        Query query = getSession().createQuery(hql);
        query.setString("name",
                "%" + (goodsCatePagination.getName() != null ? goodsCatePagination.getName() : "") + "%");
        query.setFirstResult(goodsCatePagination.getStart());
        query.setMaxResults(goodsCatePagination.getPageSize());
        return query.list();
    }

    public int getGoodsCateCount(GoodsCatePagination goodsCatePagination) {
        String sql = XMLReaderUtil.getSql("goodsCateCount");
        sql += " where name like\'%" + (goodsCatePagination.getName() != null ? goodsCatePagination.getName() : "")
                + "%\'";
        String countStr = getSession().createSQLQuery(sql).uniqueResult().toString();
        return Integer.valueOf(countStr);
    }

    public GoodsCate getGoodsCateById(int id) {
        try {
            return (GoodsCate) getSession().get(GoodsCate.class, id);
        } catch (Exception e) {
            return null;
        }
    }

    public boolean addGoodsCate(GoodsCate goodsCate) {
        try {
            getSession().save(goodsCate);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean modifyGoodsCate(GoodsCate goodsCate) {
        try {
            getSession().update(goodsCate);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // goods order

    @SuppressWarnings("unchecked")
    public List<GoodsOrder> findAllGoodsOrder(GoodsOrderPagination goodsOrderPagination) throws ParseException {
        String hql = XMLReaderUtil.getSql("goodsOrder");
        String beginTime = goodsOrderPagination.getBeginTime();
        String endTime = goodsOrderPagination.getEndTime();
        if (!beginTime.isEmpty() && !beginTime.isEmpty()) {
            hql += " where exTime between " + DateFormatUtils.StringToDate(beginTime, "yyyy-MM-dd").getTime() / 1000 + " and "
                    + DateFormatUtils.StringToDate(endTime, "yyyy-MM-dd").getTime() / 1000;
        }

        Query query = getSession().createQuery(hql);
        query.setFirstResult(goodsOrderPagination.getStart());
        query.setMaxResults(goodsOrderPagination.getPageSize());
        return query.list();

    }
    
    @SuppressWarnings("unchecked")
    public List<GoodsOrder> findAllGoodsOrder() {
        Query query = getSession().createQuery("from GoodsOrder");
        return query.list();
    }
    
    public int getGoodsOrderCount(GoodsOrderPagination goodsOrderPagination) throws ParseException {
        String sql = XMLReaderUtil.getSql("goodsOrderCount");
        String beginTime = goodsOrderPagination.getBeginTime();
        String endTime = goodsOrderPagination.getEndTime();
        if (!beginTime.isEmpty() && !beginTime.isEmpty()) {
            sql += " where ex_time >=" + DateFormatUtils.StringToDate(beginTime, "yyyy-MM-dd").getTime() / 1000 + " and ex_time <="
                    + DateFormatUtils.StringToDate(endTime, "yyyy-MM-dd").getTime() / 1000;
        }
        String countStr = getSession().createSQLQuery(sql).uniqueResult().toString();
        return Integer.valueOf(countStr);
    }
    
    public GoodsOrder getGoodsOrderById(int id) {
        return (GoodsOrder) getSession().get(GoodsOrder.class, id);
    }
    
    public boolean modifyGoodsOrder(GoodsOrder goodsOrder) {
        try {
            getSession().update(goodsOrder);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
