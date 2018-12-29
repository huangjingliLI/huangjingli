package com.soft1841.sm.service;

import com.soft1841.sm.entity.Seller;

import java.util.List;

public interface SellerService {
    /**
     * 登录功能
     *
     * @param number
     * @param password
     * @return
     */
    boolean login(String number, String password);

    /**
     * 根据工号查询
     *
     * @param number
     * @return
     */
    Seller getSellerByNumber(String number);

    /**
     * 查询所有
     */
    List<Seller> selectAllSellers();

    /**
     * 根据id删除
     */
    void deleteSellerById(long id);

    /**
     * 新增
     */
    Long insertSeller(Seller seller);

}

