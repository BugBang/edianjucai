package com.edianjucai.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.type.Type;

/**
 * Dao接口 - Dao基接口
 */

public interface IBaseDao<T, PK extends Serializable> {

  public List<T> getListBySql(String sql, Class<T> clazz, Map<String, Type> scalars, Object... parameters);
  
  public List<T> getListByHql(String hql, Object... parameters);
}
