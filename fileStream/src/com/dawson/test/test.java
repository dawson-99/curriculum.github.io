package com.dawson.test;

import com.dawson.model.Role;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class test {

    public static void main(String args[]) {
        Role role = new Role();
        LocalDateTime localDateTime = LocalDateTime.now();
        role.setName("Tom");
        role.setAppearance("比基尼太阳帽");
        role.setId(1);
        role.setJob("捕快");
        role.setReward(100);

        File targetfile = new File("savep.txt");


        //第一个try用于向文件写入
        try {
            Writer out = new FileWriter(targetfile,true);
            BufferedWriter writer = new BufferedWriter(out);
            Reader in = new FileReader(targetfile);
            BufferedReader reader = new BufferedReader(in);

            String str = "";

            str = str  + "ID:1" + " " + role.getName() + " " + role.getJob() + " " + role.getAppearance() + " " + role.getReward() + " " + "保存时间： "+ localDateTime.toString();
            writer.write(str);
            writer.newLine();
            str = "";

            localDateTime = LocalDateTime.now();
            role.setReward(900);
            role.setAppearance("只剩一条内裤");
            str = str  + "ID:2" + " " + role.getName() + " " + role.getJob() + " " + role.getAppearance() + " " + role.getReward() + " " + "保存时间： " + localDateTime.toString();
            writer.write(str);
            writer.newLine();
            str = "";

            localDateTime = LocalDateTime.now();
            role.setReward(1100);
            role.setAppearance("换了一双高跟鞋");
            str = str  + "ID:3" + " " + role.getName() + " " + role.getJob() + " " + role.getAppearance() + " " + role.getReward() + " " + "保存时间： " + localDateTime.toString();
            writer.write(str);
            writer.newLine();
            str = "";

            writer.close();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }//try

        //第二个try用于读取文件，以及加载用户游戏档案
        try {
            Writer out = new FileWriter(targetfile,true);
            BufferedWriter writer = new BufferedWriter(out);
            Reader in = new FileReader(targetfile);
            BufferedReader reader = new BufferedReader(in);

            String str = "";

            System.out.println("请选择你需要游戏档案");
            while((str = reader.readLine()) != null) {
                System.out.println(str);
            }

            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();

            Reader in2 = new FileReader(targetfile);
            reader = new BufferedReader(in2);


            System.out.println("正在加载游戏。。。。。。。游戏加载成功！");
            for (int i = 1; i < 4;i++) {
                String str1 = reader.readLine();
                if ( i == index) {
                    System.out.println("加载的游戏档案为： " + str1);
                }
            }

            writer.close();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }//try






    }
}
