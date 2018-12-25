package com.soft1841.sm.utils;

import com.soft1841.sm.service.AdminService;
import com.soft1841.sm.service.TypeService;
import com.soft1841.sm.service.impl.AdminServiceImpl;
import com.soft1841.sm.service.impl.TypeServiceImpl;

public class ServiceFactory {
    public static TypeService getTypeServiceInstance() {
        return new TypeServiceImpl();
    }
    public static AdminService getAdminServiceInstance() {
        return new AdminServiceImpl();
    }
}