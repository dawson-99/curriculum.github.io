package com.dawson.test;

import java.util.Scanner;
import com.dawson.model.*;

public class test {
    public static void main(String args[]){

        NPC npc = new NPC();
        User user=new User();

        System.out.println("你好呀，宇宙的奥特曼,你可以说出一句话，我给你开宝箱");
        System.out.print("奥特曼说：");
        String istring;
        Scanner input=new Scanner(System.in);
        istring=input.next();

        String Tstring=npc.talk(istring);
        System.out.print("你获得的密码为：");
        int str=user.getReverse(Tstring);

        System.out.println(str);

        if(npc.open(str,Tstring)){
            System.out.println("恭喜你成功打开NPC的宝箱！");
        }else System.out.println("打开NPC的宝箱失败！");
    }
}
