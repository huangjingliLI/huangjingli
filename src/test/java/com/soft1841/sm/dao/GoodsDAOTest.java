package com.soft1841.sm.dao;

import cn.hutool.db.Entity;
import com.soft1841.sm.utils.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class GoodsDAOTest {
    private GoodsDAO goodsDAO = DAOFactory.getGoodsDAOInstance();
    @Test
    public void getAllGoods() throws SQLException {
        List<Entity> goodsList = goodsDAO.getAllGoods();
        goodsList.forEach(entity -> System.out.println(entity));
    }

}