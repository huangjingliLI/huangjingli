package com.soft1841.sm.entity;

/**
 * 商品实体类
 * @author 黄敬理
 * date 2018-12-25
 */

public class Goods {
    private int id;
    private String name;
    private String price;
    private String picture;
    private String desceiption;
    public Goods(){

    }

    public Goods(int id, String name, String price, String picture, String desceiption) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.picture = picture;
        this.desceiption = desceiption;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDesceiption() {
        return desceiption;
    }

    public void setDesceiption(String desceiption) {
        this.desceiption = desceiption;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", picture='" + picture + '\'' +
                ", desceiption='" + desceiption + '\'' +
                '}';
    }
}
