package com.dawson.test.model;

public class Student {
    private String name;
    private String sex;
    private int age;
    private int id;

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    Student(String name,String sex,int age,int id) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.sex = sex;
    }

    Student() {
        name = "未命名学生";
        age = 18;
        sex = "男";
    }
}
