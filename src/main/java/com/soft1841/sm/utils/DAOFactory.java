package com.soft1841.sm.utils;

import com.soft1841.sm.dao.AdminDAO;
import com.soft1841.sm.dao.SellerDAO;
import com.soft1841.sm.dao.impl.AdminImpl;
import com.soft1841.sm.dao.impl.SellerDAOImpl;

/**
 * DAO工厂类
 */

public class DAOFactory {
    public static SellerDAO getSellerDAOInstance(){
       return new SellerDAOImpl();
    }
    public static AdminDAO getAdminDAOInstance(){
        return new AdminImpl();
    }
}
