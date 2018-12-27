package com.soft1841.sm.dao;

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
            type.setTypeName("测试类别");
            System.out.println(typeDAO.insertType(type));
        }
        @Test
        public void deleteTypeById() throws SQLException {
            typeDAO.deleteTypeById(3);
        }

        @Test
        public void selectAllTypes() throws SQLException {
            List<Type> typeList = typeDAO.selectAllTypes();
            typeList.forEach(entity -> System.out.println(entity));
        }
        @Test
        public void getTypeById() throws SQLException {
            Type entity = typeDAO.getTypeById(3);
            System.out.println(entity);
        }
    }