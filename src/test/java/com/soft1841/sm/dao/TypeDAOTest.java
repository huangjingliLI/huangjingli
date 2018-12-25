package com.soft1841.sm.dao;

import cn.hutool.db.Entity;
import com.soft1841.sm.entity.Type;
import com.soft1841.sm.utils.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;


    public class TypeDAOTest {
        //通过DAO工厂获得TypeDAO的实例
        private TypeDAO typeDAO = DAOFactory.getTypeDAOInstance();

        @Test
        public void insertType() throws SQLException {
            Type type = new Type();
            type.setName("测试类别");
            System.out.println(typeDAO.inserType(type));
        }

        @Test
        public void deleteTypeById() throws SQLException {
            typeDAO.deleteTypeById(7);
        }

        @Test
        public void selectAllTypes() throws SQLException {
            List<Entity> typeList = typeDAO.selectAllTypes();
            typeList.forEach(entity -> System.out.println(entity));
        }

        @Test
        public void getTypeById() throws SQLException {
            Entity entity = typeDAO.getTypeById(1);
            System.out.println(entity);
        }
    }