package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Admin;
import com.soft1841.sm.utils.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;

public class AdminDAOTest {
    private AdminDAO adminDAO = (AdminDAO) DAOFactory.getAdminDAOInstance();
    @Test
    public void getAdminByNumber() throws SQLException {
        Admin admin = (Admin) adminDAO.getAdminByNumber("2649794");
        System.out.println(admin);
    }
}