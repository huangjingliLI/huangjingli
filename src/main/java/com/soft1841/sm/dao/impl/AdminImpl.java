package com.soft1841.sm.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.sm.dao.AdminDAO;
import com.soft1841.sm.entity.Admin;

import java.sql.SQLException;

public class AdminImpl implements AdminDAO {
    @Override
    public AdminDAO getAdminByNumber(String number) throws SQLException {
        Entity entity = Db.use().queryOne("SELECT * FROM t_admin WHERE number = ? ", number);
        return convertAdmin(entity);
    }

    private AdminDAO convertAdmin(Entity entity) {
        Admin admin = new Admin(entity.getLong("id"), entity.getStr("name"), entity.getStr("avatar"), entity.getStr("password"), entity.getStr("number"));
        return (AdminDAO) admin;
    }
}

