package com.dawson.classs.test;

import com.dawson.classs.model.*;

public class test {

    public static void main(String [] args) {

        Account XuRH = new Account();
        Account HongKong = new Account();
        Account YangM = new Account();
        Account SheYS = new Account();
        Account Yummi = new Account();

        Role role;

        System.out.println("本次测试同时展示四个人物");

        role = new swordMan();
        XuRH.setRole(role);
        XuRH.setName("XuR.H.");
        XuRH.setPassword("324234324");

        role = new Police();
        HongKong.setRole(role);
        HongKong.setName("hongkong");
        HongKong.setPassword("5324afew5436453");

        role = new Peasant();
        YangM.setRole(role);
        YangM.setName("YangM");
        YangM.setPassword("543fffef352352344");

        role = new Thief();
        SheYS.setRole(role);
        SheYS.setName("SheYS");
        SheYS.setPassword("rgregre63426");

        role = new Officer();
        Yummi.setRole(role);
        Yummi.setName("Yummi");
        Yummi.setPassword("45jkj453143");


        XuRH.getRole().walk();
        XuRH.getRole().depict();
//        System.out.print("大侠说：");
//        XuRH.getRole().speak("我绝对第一");
//        XuRH.getRole().run();
        HongKong.getRole().walk();
        HongKong.getRole().depict();
        YangM.getRole().walk();
        YangM.getRole().depict();
        SheYS.getRole().walk();
        SheYS.getRole().depict();
        Yummi.getRole().walk();
        Yummi.getRole().depict();

        SheYS.getRole().run();
        SheYS.getRole().speak("你们都是垃圾  速度100");
        XuRH.getRole().run();
        XuRH.getRole().speak("你怕是作弊了  速度50");
        HongKong.getRole().run();
        HongKong.getRole().speak("我居然才第三 速度40");
        YangM.getRole().run();
        YangM.getRole().speak("我居然最后  速度30");
        Yummi.getRole().run();
        Yummi.getRole().speak("热了个身 速度20");// 官员升堂方法作为额外方法添加到speak方法里面一起执行

    }



}
