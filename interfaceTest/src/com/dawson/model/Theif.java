package com.dawson.model;

public class Theif extends Role{

    int status = -1; //用于记录任务状态
    String rank = "小偷"; //表明身份

    public void setStatus(int status) {
        this.status = status;
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
