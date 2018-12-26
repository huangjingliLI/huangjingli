package com.soft1841.sm.utils;

import com.soft1841.sm.service.TypeService;
import com.soft1841.sm.service.impl.TypeServiceImpl;

public class ServiceFactory {
    public static TypeService getTypeServiceInstance()
    {
        return new TypeServiceImpl();
    }

}