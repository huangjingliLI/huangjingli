package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Member;

import java.sql.SQLException;
import java.util.List;

public interface MemberDAO {
    /**
     * 新增类别, 返回自增主键(Long)
     * @param member
     * @return
     */
    Long insertMember(Member member) throws SQLException;

    /**
     * 根据id删除类别
     * @param id
     * @return
     */
    int deleteMemberById(long id) throws SQLException;

    /**
     * 查询所有类别
     * @return
     */
    List<Member> selectAllMember() throws SQLException;

    /**
     * 根据id查询类别信息
     * @param id
     * @return
     */
    Member getMemberById(long id) throws SQLException;

    /**
     * 根据姓名查
     */
    List<Member> selectMemberByName(String keywords) throws SQLException;

    /**
     * 改手机
     */
    int updateMemberPhone(Member member)throws SQLException;
}