package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Admin;
import com.soft1841.sm.utils.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class AdminDAOTest {
private AdminDAO adminDAO = (AdminDAO) DAOFactory.getAdminDAOInstance();
    @Test
    public void getAdminByNumber() throws SQLException {
        Admin admin = adminDAO.getAdminByNumber("2649794");
        System.out.println(admin);

    }
}