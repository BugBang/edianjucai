package com.edianjucai.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class AdminDao<Admin> extends BaseDaoImpl {

    public List<Admin> getAdminByName(String name, String password) {
        String hql = "from Admin where name=? and password=?";
        List<Admin> adminList = (List<Admin>) this.getListByHql(hql, name, password);
        return adminList;
    }

}
