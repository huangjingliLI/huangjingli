package com.soft1841.sm.entity;

/**
 * 管理员实体类
 * @author 黄敬理
 * date 2018-12-25
 */

public class Admin {
    private Long id;
    private String name;
    private String avatar;
    private String password;
    private String number;
    public Admin(){

    }

    public Admin(Long id, String name, String avatar, String password, String number) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.password = password;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "AdminDAO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", password='" + password + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
