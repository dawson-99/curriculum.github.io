package com.dawson.model;

public class Peasant extends Role{

    int status = -1; //用于记录任务状态
    String rank = "农民伯伯"; //表明身份

    public void setStatus(int status) {
        this.status = status;
        if (status == 2) {
            System.out.println(getRank() + "已接受任务");
        }
    }

    public int getStatus() {
        return status;
    }

    public void complishTask() {
        status = 3;
        System.out.println(getRank() + "完成了任务");
    }

    public String getRank() {
        return rank;
    }


    public void talk(String s) {
        System.out.println(getRank() + ":" + s);
    }
}
