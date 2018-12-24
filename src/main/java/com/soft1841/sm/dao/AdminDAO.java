package com.soft1841.sm.dao;

import java.sql.SQLException;

public interface AdminDAO {
    /**
     *
     * @param number
     * @return
     * @throws SQLException
     */
    AdminDAO getAdminByNumber(String number) throws SQLException;
}
