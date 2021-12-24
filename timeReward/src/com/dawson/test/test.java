package com.dawson.test;

import java.time.LocalDate;
import java.util.Scanner;
import com.dawson.model.*;

public class test {
    public static void main(String args[]){
        LocalDate myDate = LocalDate.now();
        System.out.println("请输入你的出生日期：（例如： 1949 10 1）");
        NPC npc = new NPC();

        Scanner input = new Scanner(System.in);

        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        User user = new User(year,month,day);//初始化user的生日

        if(user.getBirthday().getMonthValue() == myDate.getMonthValue()
                &&user.getBirthday().getDayOfMonth() == myDate.getDayOfMonth()
        ){
            System.out.println("尊贵的奥特曼你好，今天是你出生在星之国新一岁，是你的生日，你的爸爸会给你积分");
            System.out.println("你获得的积分为：" + npc.reward(user.getBirthday()));
        }else {
            System.out.println("滚，不能积分,废物");
        }
    }
}
