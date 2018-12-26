package com.soft1841.sm.utils;

import com.soft1841.sm.dao.TypeDAO;
import com.soft1841.sm.dao.impl.TypeDAOImpl;

/**
 * DAO工厂类
 */

public class DAOFactory {
  public static TypeDAO getTypeDAOInstance() {

        return  new TypeDAOImpl();
    }
}
