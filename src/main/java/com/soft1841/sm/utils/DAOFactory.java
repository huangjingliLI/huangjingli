package com.soft1841.sm.utils;

import com.soft1841.sm.dao.AdminDAO;
import com.soft1841.sm.dao.SellerDAO;
import com.soft1841.sm.dao.TypeDAO;
import com.soft1841.sm.dao.impl.AdminImpl;
import com.soft1841.sm.dao.impl.SellerDAOImpl;
import com.soft1841.sm.dao.impl.TypeDAOImpl;

/**
 * DAO工厂类
 */

public class DAOFactory {
    public static SellerDAO getSellerDAOInstance()
    {
       return new SellerDAOImpl();
    }
    public static AdminDAO getAdminDAOInstance(){
        return new AdminImpl();   }

  public static TypeDAO getTypeDAOInstance() {
        return  new TypeDAOImpl();
    }
}
