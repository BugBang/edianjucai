package com.edianjucai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edianjucai.dao.AdminDao;
import com.edianjucai.model.Admin;
import com.edianjucai.model.AdminRole;

@Service
public class LoginServiceImpl{

    @Autowired
    private AdminDao adminDao;

    public AdminDao getAdminDao() {
        return adminDao;
    }
    
    @Transactional
    public List<Admin> showAllAdmin() {

        List<Admin> adminList = adminDao.findAllAdmin();

        return adminList;

    }
    
    @Transactional
    public Admin login(String userName, String password) {
        
        List<Admin> admins = adminDao.getAdmin(userName, password);

        if (admins.size() == 1) {
            return admins.get(0);
        } else {
            return null;
        }
    }
    
    @Transactional
    public int getRoleId(int id) {
        AdminRole adminRole = adminDao.getAdminRole(id);
        if (adminRole == null) {
            return -1;
        }
        
        return adminRole.getClassId();
    }
}
