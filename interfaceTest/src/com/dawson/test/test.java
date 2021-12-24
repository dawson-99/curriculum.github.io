package com.dawson.test;

import com.dawson.model.*;


public class test {

    public static void main(String [] args) {
        System.out.println("！！程序员注：此演示中，默认角色会接受任务进行展示，角色的预设已提前\n设定，分别演示双十一和非双十一的效果，时间已提前内置，仅演示其中一个角色效果");
        System.out.println("-----------------------");

        NPC npc = new NPC();
        Role role = new Peasant();

        System.out.println(role.getRank());

        npc.talk("给你1000亩地，种地吗？");
        role.talk("给多点，行吗？");
        npc.talk("多给100亩，最多了");
        role.talk("好呀好呀");

        npc.setTask(role);
        role.setStatus(2); //表明已经接受任务

        System.out.println("------------two years later-----------");
        role.complishTask();
        npc.setReward(role);
        System.out.println("------------------------");

        role = new swordsMan();
        System.out.println(role.getRank());
        npc.talk("大侠，多少钱？杀了那个太监");
        role.talk("不行啊，那是我的至亲");
        npc.talk("默不作声。。。。。。");
        role.talk("得加钱！！");

        npc.setTask(role);
        role.setStatus(2); //表明已经接受任务

        System.out.println("------------one month later-----------");
        npc.setReward(role);
        System.out.println("------------two month later-----------");
        role.complishTask();
        npc.setReward(role);

        role = new Theif();
        System.out.println(role.getRank());
        npc.talk("我没有想好给你什么任务");
        role.talk("啊这");
        npc.talk("。。。。。。。。。");
        role.talk("随便来个吧！");
        npc.setTask(role);
        role.setStatus(2); //表明已经接受任务

        System.out.println("------------one month later-----------");
        npc.setReward(role);
        System.out.println("------------three month later-----------");
        role.complishTask();
        npc.setReward(role);

    }

}
