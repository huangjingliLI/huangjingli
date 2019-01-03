package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Detail;
import com.soft1841.sm.utils.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;
    public class DetailDAOTest {
        private DetailDAO detailDAO = DAOFactory.getDetailDAOInstance();

        @Test
        public void insertDetail() throws SQLException {
            Detail detail = new Detail();
            detail.setBarCode("6901265652");
            detail.setTicketID(1);
            detail.setNumber("7");
            System.out.println(detailDAO.insertDetail(detail));
        }

        @Test
        public void getDetailById() throws SQLException {
            System.out.println(detailDAO.getDetailById(2));
        }
    }