package com.dawson.model;

//爱攀比的小朋友(小朋友人数不确定）
//
//比钱多少
//比身高的高矮
//比体重的大小
//比成绩的高低（数学）
//比综合指标（85%的成绩、5%的体重，5%的身高，5%的金钱）
//每项比较都要返回各项比较的冠亚季军选手的排名
public class Child {

    double money;
    double height;
    double weight;
    int score;
    double allIndex;
    String name;

    public void setAllIndex(double allIndex) {
        this.allIndex = allIndex;
    }

    public double getAllIndex() {
        return getHeight() * 0.05 + getWeight() * 0.05 + getScore() * 0.85 + getMoney() * 0.05;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

}
