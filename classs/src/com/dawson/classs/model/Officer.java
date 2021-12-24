package com.dawson.classs.model;

public class Officer extends Role{

    String cloth = "官服";
    String hairColor = "青黑色";
    String appearance = "表现趾高气昂";

    int runSpeed = 20;
    int walkSpeed = 1;

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
        System.out.println("官员被抬了100米");

        walkYet = 1;
    }

    public void run() {
        System.out.println("官员跑完了1000千米");
    }

    public void speak(String s) {
        System.out.println("官员说：我的个妈，" + s);
        judge();
    }

    public void depict() {
        System.out.println("官员身穿" + getCloth() + "头发是" + getHairColor() + "，" + getAppearance() );
        System.out.println("");
    }

    public void judge(){
        System.out.println("官员升堂审案： 我今天要审1000个犯人");
    }
}
