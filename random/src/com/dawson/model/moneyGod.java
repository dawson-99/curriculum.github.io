package com.dawson.model;

public class moneyGod {

    public int getReward() {
        int a,b,c,d;
        a = getRandom();
        b = getRandom();
        c = getRandom();
        d = a + b*10 + c*100;
        System.out.println("第一次摇到的数字是" + a);
        System.out.println("第二次摇到的数字是" + b);
        System.out.println("第三次摇到的数字是" + c);
        System.out.println("总奖励是： " + d);
        return a + b*10 + c*100;
    }
    public int getRandom(){
        return ((int)(Math.random()*10))%6 + 1;
    }

    public void talk(String s){
        System.out.println("幸运财神说： " + s);
    }

    public void setReward(Role role,int func,int reward) {
        if (func == 0) {
            int m = getReward();
            role.addMoney(m);
            role.check();
            System.out.println(role.getTitle());
        } else {
            role.addMoney(reward);
            role.check();
            System.out.println(role.getTitle());
        }
    }

    public void setTask(Role role) {
        role.setStatus(1);
    }
    public void complish(Role role) {
        role.addMoney(200);
        role.check();
        System.out.println(role.getTitle());
        role.setStatus(2);
    }
}
