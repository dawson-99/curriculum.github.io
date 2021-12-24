package com.dawson.model;

public class Role {

    int money;
    String name;
    String title;
    int status;//此状态可用于标记各种任务，这样就可以实现不同任务的金额

    public void talk(String s) {
        System.out.println(name + "说: " + s);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void addMoney(int money1) {
        this.money = money1 + this.money;
        System.out.println(name + "得到了：" + money1 + "  现在总额是： " + this.money);

    }

    public void check() {
        if(getMoney() >= 1100) {
            this.title  = "职业：皇帝  等级：神级";
        } else if(getMoney() >=900 ) {
            this.title  = "职业：尚书  等级：高级";
        } else if(getMoney() >= 700) {
            this.title = "职业：知府  等级：初级";
        } else if ((getMoney() <= 600)) {
            this.title = "职业： 农民  等级：新手";
        }
    }

}

