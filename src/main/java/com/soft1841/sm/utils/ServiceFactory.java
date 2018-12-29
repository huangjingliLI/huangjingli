package com.soft1841.sm.utils;

import com.soft1841.sm.entity.Type;
import com.soft1841.sm.service.*;
import com.soft1841.sm.service.impl.*;

public class ServiceFactory {
    public static TypeService getTypeServiceInstance() {
        return new TypeServiceImpl();
    }
    public static GoodsService getGoodsServiceInstance(){
        return new GoodsServiceImpl();
    }
    public static AdminService getAdminServiceInstance() {
        return new AdminServiceImpl();
    }
    public static SellerService getSellerServiceInstance() {
        return new SellerServiceImpl();
    }

}
