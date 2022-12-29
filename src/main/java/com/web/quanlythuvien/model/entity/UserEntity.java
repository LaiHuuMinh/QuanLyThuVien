package com.web.quanlythuvien.model.entity;

public class UserEntitty {

    private int id;
    private String name;
    private int age;
    private int sex;
    private int numberPhone;
    private String username;
    private String password;

    public UserEntitty() {
    }

    public UserEntitty(int id, String name, int age, int sex, int numberPhone, String username, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.numberPhone = numberPhone;
        this.username = username;
        this.password = password;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
