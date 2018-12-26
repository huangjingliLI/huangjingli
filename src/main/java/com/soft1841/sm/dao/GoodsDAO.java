package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Goods;

import java.sql.SQLException;
import java.util.List;

public interface GoodsDAO {
    /**
     * 新增图书，返回自增主键
     *
     * @param goods
     * @return
     * @throws SQLException
     */
    Long insertGoods(Goods goods) throws SQLException;

    /**
     * 根据id删除图书
     *
     * @param id
     * @return
     */
    int deleteGoodsById(long id) throws SQLException;

    /**
     * 更新图书信息
     *
     * @param goods
     * @return
     */
    int updateGoods(Goods goods) throws SQLException;


    /**
     * 查询所有图书
     *
     * @return
     */
    List<Goods> selectAllGoods() throws SQLException;


    /**
     * 根据id查询图书信息
     *
     * @param id
     * @return
     */
    Goods getGoodsById(long id) throws SQLException;

    /**
     * 根据书名关键词模糊查询图书
     * @param keywords
     * @return
     * @throws SQLException
     */
    List<Goods> selectGoodsLike(String keywords) throws SQLException;

    /**
     * 根据图书类别查询图书
     * @param typeId
     * @return
     * @throws SQLException
     */
    List<Goods> selectGoodsByTypeId(long typeId) throws SQLException;

    /**
     * 根据图书类别统计图书数量
     * @param typeId
     * @return
     * @throws SQLException
     */
    int countByType(long typeId) throws SQLException;
}
