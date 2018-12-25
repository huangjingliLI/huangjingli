package com.soft1841.sm.dao;

import cn.hutool.db.Entity;
import com.soft1841.sm.entity.Type;

import java.sql.SQLException;
import java.util.List;

public interface TypeDAO {
    /**
     * 新增图书类别
     * @param type
     * @return
     * @throws SQLException
     */
    Long inserType(Type type)throws SQLException;

    /**
     * 根据id删除类别
     * @param id
     * @return
     * @throws SQLException
     */
    int deleteTypeById(long id)throws SQLException;

    /**
     * 查询所有类别
     * @return
     * @throws SQLException
     */
    List<Type> selectAllTypes()throws SQLException;

    /**
     * 根据id查询类别信息
     * @param id
     * @return
     * @throws SQLException
     */
    Entity getTypeById(int id)throws SQLException;

    Type getTypeById(long id) throws SQLException;
}
