package com.edianjucai.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edianjucai.dao.impl.IBaseDao;
import com.edianjucai.service.impl.IBaseService;

@Service
@Transactional
public class BaseServiceImpl<T, PK extends Serializable> implements IBaseService<T, PK> {

    @Autowired
    private IBaseDao<T, PK> baseDao;
    
    public IBaseDao<T, PK> getBaseDao() {
      return baseDao;
    }
    
    public void setBaseDao(IBaseDao<T, PK> baseDao) {
      this.baseDao = baseDao;
    }

    @Override
    public T get(PK id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PK save(T entity) {
        // TODO Auto-generated method stub
        return null;
    }

}
