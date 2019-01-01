package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Member;
import com.soft1841.sm.utils.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class MemberDAOTest {
    private MemberDAO memberDAO = DAOFactory.getMemberDAOInstance();

    @Test
    public void insertMember() throws SQLException {
        Member member = new Member();
        member.setName("假人");
        member.setPhone("15161155167");
        member.setAddress("中华台北");
        System.out.println(memberDAO.insertMember(member));
    }

    @Test
    public void getMemberById() throws SQLException{
        System.out.println(memberDAO.getMemberById(5));
    }
}