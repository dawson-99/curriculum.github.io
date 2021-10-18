package com.dawson.test;

import com.dawson.model.Child;

//created by Xu R.H.

public class test {

    public static void main(String [] args) {

        System.out.println("there are 4 chidren in this trial and I give 4 params");
        Child XuRH = new Child();
        Child YangM = new Child();
        Child SheYS = new Child();
        Child Hongkong = new Child();

        SheYS.setName("SheYS");
        SheYS.setWeight(44.2);
        SheYS.setScore(98);
        SheYS.setMoney(1888);
        SheYS.setHeight(168);


        XuRH.setName("XuRH");
        XuRH.setHeight(172);
        XuRH.setMoney(1314);
        XuRH.setScore(99);
        XuRH.setWeight(54.2);


        YangM.setName("YangM");
        YangM.setHeight(165);
        YangM.setMoney(0.1);
        YangM.setScore(100);
        YangM.setWeight(47);


        Hongkong.setName("Hongkongdoll");
        Hongkong.setWeight(42);
        Hongkong.setHeight(189);
        Hongkong.setMoney(888);
        Hongkong.setScore(100);

        compWeight(XuRH,YangM,SheYS,Hongkong);
        compHeight(XuRH,YangM,SheYS,Hongkong);
        compMoney(XuRH,YangM,SheYS,Hongkong);
        compScore(XuRH,YangM,SheYS,Hongkong);
        compAllIndex(XuRH,YangM,SheYS,Hongkong);
    }

    public static void compWeight(Child... children) {

        Child champion = new Child();
        Child second = new Child();
        Child Third = new Child();

        Child temp1 = new Child();

        for (Child child : children) {
            if (child.getWeight() > champion.getWeight()) {
                if (champion.getName() == null){
                    champion = child;
                } else {
                    temp1 = second;
                    second = champion;
                    Third = temp1;
                    champion = child;
                }

            } else if (child.getWeight() > second.getWeight() && child.getWeight() < champion.getWeight()) {
                if (second.getName() == null) {
                    second = child;
                } else {
                    Third = second;
                    second = child;
                }
            } else if (child.getWeight() > Third.getWeight() && child.getWeight() < second.getWeight()) {
                Third = child;
            }
        }

        System.out.println("体重比较--------------------");
        System.out.println("冠军是" + champion.getName() + ": "+ champion.getWeight());
        System.out.println("亚军是" + second.getName() + ": "+ second.getWeight());
        System.out.println("季军是" + Third.getName() +  ": "+ Third.getWeight());
        System.out.println("");
   }

    public static void compHeight(Child... children) {

       Child champion = new Child();
       Child second = new Child();
       Child Third = new Child();

       Child temp1 = new Child();

        for (Child child : children) {
            if (child.getHeight() > champion.getHeight()) {
                if (champion.getName() == null){
                    champion = child;
                } else {
                    temp1 = second;
                    second = champion;
                    Third = temp1;
                    champion = child;
                }
            } else if (child.getHeight() > second.getHeight() && child.getHeight() < champion.getHeight()) {
                if (second.getName() == null) {
                    second = child;
                } else {
                    Third = second;
                    second = child;
                }
            } else if (child.getHeight() > Third.getHeight() && child.getHeight() < second.getHeight()) {
                Third = child;
            }
        }

        System.out.println("身高比较--------------------");
        System.out.println("冠军是" + champion.getName() + ": "+ champion.getHeight());
        System.out.println("亚军是" + second.getName() + ": "+ second.getHeight());
        System.out.println("季军是" + Third.getName() + ": "+ Third.getHeight());
        System.out.println("");
    }

    public static void compMoney(Child... children) {

        Child champion = new Child();
        Child second = new Child();
        Child Third = new Child();

        Child temp1 = new Child();

        for (Child child : children) {
            if (child.getMoney() > champion.getMoney()) {
                if (champion.getName() == null){
                    champion = child;
                } else {
                    temp1 = second;
                    second = champion;
                    Third = temp1;
                    champion = child;
                }

            } else if (child.getMoney() > second.getMoney() && child.getMoney() < champion.getMoney()) {
                if (second.getName() == null) {
                    second = child;
                } else {
                    Third = second;
                    second = child;
                }
            } else if (child.getMoney() > Third.getMoney() && child.getMoney() < second.getMoney()) {
                Third = child;
            }
        }

        System.out.println("金钱比较--------------------");
        System.out.println("冠军是" + champion.getName() + ": "+ champion.getMoney());
        System.out.println("亚军是" + second.getName() + ": "+ second.getMoney());
        System.out.println("季军是" + Third.getName() +  ": "+ Third.getMoney());
        System.out.println("");
    }

    public static void compScore(Child... children) {

        Child champion = new Child();
        Child second = new Child();
        Child Third = new Child();

        Child temp1 = new Child();

        for (Child child : children) {
            if (child.getScore() > champion.getScore()) {
                if (champion.getName() == null){
                    champion = child;
                } else {
                    temp1 = second;
                    second = champion;
                    Third = temp1;
                    champion = child;
                }

            } else if (child.getScore() > second.getScore() && child.getScore() < champion.getScore()) {
                if (second.getName() == null) {
                    second = child;
                } else {
                    Third = second;
                    second = child;
                }
            } else if (child.getScore() > Third.getScore() && child.getScore() < second.getScore()) {
                Third = child;
            }
        }

        System.out.println("数学成绩比较--------------------");
        System.out.println("冠军是" + champion.getName() + ": "+ champion.getScore());
        System.out.println("亚军是" + second.getName() + ": "+ second.getScore());
        System.out.println("季军是" + Third.getName() +  ": "+ Third.getScore());
        System.out.println("");
    }

    public static void compAllIndex(Child... children) {

        Child champion = new Child();
        Child second = new Child();
        Child Third = new Child();

        Child temp1 = new Child();

        for (Child child : children) {
            if (child.getAllIndex() > champion.getAllIndex()) {
                if (champion.getName() == null){
                    champion = child;
                } else {
                    temp1 = second;
                    second = champion;
                    Third = temp1;
                    champion = child;
                }

            } else if (child.getAllIndex() > second.getAllIndex() && child.getAllIndex() < champion.getAllIndex()) {
                if (second.getName() == null) {
                    second = child;
                } else {
                    Third = second;
                    second = child;
                }
            } else if (child.getAllIndex() > Third.getAllIndex() && child.getAllIndex() < second.getAllIndex()) {
                Third = child;
            }
        }

        System.out.println("综合指标成绩比较--------------------");
        System.out.println("冠军是" + champion.getName() + ": "+ champion.getAllIndex());
        System.out.println("亚军是" + second.getName() + ": "+ second.getAllIndex());
        System.out.println("季军是" + Third.getName() +  ": "+ Third.getAllIndex());
        System.out.println("");
    }

}
