package com.dawson.test;

import com.dawson.model.Role;
import com.dawson.model.moneyGod;

public class test {
    public static void main(String [] args) {

        moneyGod luck = new moneyGod();
        Role superman = new Role();

        superman.setName("奥特曼");
        luck.talk("你好，宇宙的奥特曼,宇宙需要你来拯救，欢迎来到游戏大厅");
        superman.talk("你好财神，最近缺点钱，要不给我点？");
        luck.talk("好呀，我有的是钱,我摇三次筛子，看你的运气了");
        luck.setReward(superman,0,0);
        superman.talk("谢谢");

        System.out.println("！！！！！此处设置每个任务的奖励均为200，主要为展现变化！！！！");

        luck.talk("帮我打几个怪兽，一个怪兽200块钱，来不啦");
        superman.talk("行");
        luck.setTask(superman);
        System.out.println("-----------奥特曼打第一只怪兽");
        luck.complish(superman);
        System.out.println("-----------奥特曼打第二只怪兽");
        luck.complish(superman);
        System.out.println("-----------奥特曼打第三只怪兽");
        luck.complish(superman);
        System.out.println("-----------奥特曼打第四只怪兽");
        luck.complish(superman);
        System.out.println("-----------奥特曼打第五只怪兽");
        luck.complish(superman);
        System.out.println("-----------奥特曼从此爱上了打怪兽，奥特曼将继续打下去，为了世界的和平。。。。。");





    }
}
