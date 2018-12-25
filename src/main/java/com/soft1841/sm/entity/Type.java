package com.soft1841.sm.entity;

/**
 * 商品类别实体类
 * @author 黄敬理
 * date 2018-12-25
 */

public class Type {
    private long id;
    private String name;
    private String picture;
    public Type(){

    }

    public Type(long id, String name, String picture) {
        this.id = id;
        this.name = name;
        this.picture = picture;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
