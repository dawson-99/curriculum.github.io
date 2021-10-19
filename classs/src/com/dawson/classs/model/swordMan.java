package com.dawson.classs.model;

public class swordMan extends Role {

    String cloth = "甲胄";
    String hairColor = "黑色";
    String appearance = "大侠此刻神色淡然，看不出一丝冲动，帅";

    int runSpeed = 50;
    int walkSpeed = 10;

    int walkYet = -1;

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setCloth(String cloth) {
        this.cloth = cloth;
    }

    public String getCloth() {
        return cloth;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void walk() {
       System.out.println("侠客帅气地步行了100米");

        walkYet = 1;
    }

    public void run() {
        System.out.println("侠客跑完了1000千米");
    }

    public void speak(String s) {
        System.out.println("侠客说：依本大侠来看," + s);
    }

    public void depict() {
        System.out.println("侠客身穿" + getCloth() + "，头发是" + getHairColor() + "，" + getAppearance() );
        System.out.println("");
    }
}
