package com.dawson.model;

public class Role {
       int id;
       String name;
       String job;
       String appearance;
       int reward;

    public void setName(String name) {
        this.name = name;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public String getName() {
        return name;
    }

    public String getAppearance() {
        return appearance;
    }

    public int getId() {
        return id;
    }

    public int getReward() {
        return reward;
    }

    public String getJob() {
        return job;
    }
}
