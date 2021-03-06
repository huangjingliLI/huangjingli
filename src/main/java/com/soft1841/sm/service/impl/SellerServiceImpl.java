package com.soft1841.sm.service.impl;

import com.soft1841.sm.dao.SellerDAO;
import com.soft1841.sm.entity.Seller;
import com.soft1841.sm.service.SellerService;
import com.soft1841.sm.utils.DAOFactory;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SellerServiceImpl implements SellerService {
    private SellerDAO sellerDAO = DAOFactory.getSellerDAOInstance();

    @Override
    public boolean login(String number, String password) {
        Seller seller = null;
        try {
            seller = sellerDAO.getSellerByNumber(number);
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (NullPointerException e){

        }
        //根据工号查找成功
        if (seller != null) {
            //比较密码
            if (password.equals(seller.getPassword())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Seller getSellerByNumber(String number) {
        Seller seller = new Seller();
        try {
            seller = sellerDAO.getSellerByNumber(number);
        } catch (SQLException e) {
            System.err.println("查询单个收银员出现异常!");
        }catch (NullPointerException e){

        }
        return seller;
    }

    @Override
    public List<Seller> selectAllSellers() {
        List<Seller> sellerList = new ArrayList<>();
        try {
            sellerList = sellerDAO.selectAllSellers();
        } catch (SQLException e) {
            System.err.println("查询所有读者信息出现异常");
        }
        return sellerList;
    }

    @Override
    public void deleteSellerById(long id) {
        try {
            sellerDAO.deleteSellerById(id);
        } catch (SQLException e) {
            System.err.println("删除读者信息出现异常");
        }
    }

    @Override
    public Long insertSeller(Seller seller) {
        long result = 0;
        try {
            result = sellerDAO.insertSeller(seller);
        } catch (SQLException e) {
            System.err.println("新增读者信息出现异常");
        }
        return result;
    }

}
