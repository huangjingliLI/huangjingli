package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Detail;

import java.sql.SQLException;
import java.util.List;

public interface DetailDAO {
    /**
     * 查所有
     * @return
     */
    List<Detail> getAllDetails() throws SQLException;

    /**
     * 根据id查询信息
     * @param id
     * @return
     */
    Detail getDetailById(long id) throws SQLException;

    /**
     * 新增类别, 返回自增主键(Long)
     * @param detail
     * @return
     */
    Long insertDetail(Detail detail) throws SQLException;
}