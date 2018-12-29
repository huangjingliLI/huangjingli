package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Admin;

import java.sql.SQLException;

public interface AdminDAO {
    /**
     * 根据工号查询管理员
     *
     * @param number
     * @return
     * @throws SQLException
     */
    Admin getAdminByNumber(String number) throws SQLException;

}
