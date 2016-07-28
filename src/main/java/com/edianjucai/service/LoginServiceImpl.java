package com.edianjucai.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edianjucai.dao.AdminDao;
import com.edianjucai.model.Admin;

@Service
public class LoginServiceImpl{

    @Autowired
    private AdminDao<Admin> adminDao;

    public AdminDao<Admin> getAdminDao() {
        return adminDao;
    }
    
    public Admin loign(String name, String password) {

        List<Admin> adminList = adminDao.getAdminByName(name, password);

        if (adminList.size() == 1) {
            return adminList.get(1);
        } else {
            return null;
        }

    }
}
