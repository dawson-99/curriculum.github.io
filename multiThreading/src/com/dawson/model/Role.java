package com.dawson.model;

public class Role {

    String name;
    int distence = 10;
    int attackTimes;
    int lifevalue = 100;
    int live = 1;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void plusAttackTimes() {
        attackTimes += 1;
    }

    public int getAttackTimes() {
        return attackTimes;
    }

    public void setDistence(int distence) {
        this.distence = distence;
    }

    public int getDistence() {
        return distence;
    }

    public void plusDistence() {
        distence += 1;
    }

    public void subtractDistence() {
        distence -= 2;
    }

    public double attaTrend() {
        if (getLive() == -1) {
            return -10000;
        } else {
            return getAttackTimes() * 0.5 * 10 - distence * 0.2 -  lifevalue * 0.3;
        }
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public void subLife(int life) {
        lifevalue -= life;
    }

    public int getLifevalue() {
        return lifevalue;
    }

}
