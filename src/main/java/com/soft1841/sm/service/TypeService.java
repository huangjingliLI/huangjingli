package com.soft1841.sm.service;

import com.soft1841.sm.entity.Type;

import java.util.List;

public interface TypeService {
    /**
     * 获取所有商品类别的功能
     * @return
     */
    List<Type> selectAllTypes();

    /**
     * 根据id查询类别
     * @param id
     * @return
     */
    Type getTypeById(long id);

    /**
     * 添加类别
     * @param type
     */
    Long insertType(Type type);

    /**
     * 删除类别
     * @param id
     */
    void deleteTypeById(long id);
}
