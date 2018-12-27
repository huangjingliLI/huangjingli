package com.soft1841.sm.utils;

import com.soft1841.sm.dao.*;
import com.soft1841.sm.dao.impl.*;

/**
 * DAO工厂类
 */
public class DAOFactory {

    public static TypeDAO getTypeDAOInstance() {
        return new TypeDAOImpl();
    }
    public static GoodsDAO getGoodsDAOInstance() {return new GoodsDAOImpl();}

}

