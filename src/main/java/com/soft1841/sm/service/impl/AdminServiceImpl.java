package com.soft1841.sm.service.impl;

import com.soft1841.sm.dao.AdminDAO;
import com.soft1841.sm.entity.Admin;
import com.soft1841.sm.service.AdminService;
import com.soft1841.sm.utils.DAOFactory;

import java.sql.SQLException;

public class AdminServiceImpl implements AdminService {
    private AdminDAO adminDAO =DAOFactory.getAdminDAOInstance();

    @Override
    public boolean login(String number, String password) {
        Admin admin = null;
        try {
            admin = (Admin) adminDAO.getAdminByNumber(number);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //根据工号查找成功
        if (admin != null) {
            //比较密码
            if (password.equals(admin.getPassword())) {
                return true;
            }
        }
        return false;
    }
}