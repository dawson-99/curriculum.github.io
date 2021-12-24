package com.dawson.model;

public abstract class Role {

    int status; //用于记录任务状态
    String rank;

    public abstract void setStatus(int status);

    public abstract int getStatus();

    public abstract void complishTask();

    public abstract String getRank();

    public abstract void talk(String s);
}
