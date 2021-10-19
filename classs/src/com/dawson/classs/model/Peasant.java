package com.dawson.classs.model;

public class Peasant extends Role{

    String cloth = "麻衣";
    String hairColor = "黑色";
    String appearance = "平民尽显疲惫，但是很高兴";

    int runSpeed = 30;
    int walkSpeed = 8;

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
        System.out.println("平民慢慢地步行了100米");

        walkYet = 1;
    }

    public void run() {
        System.out.println("平民跑完了1000千米");
    }

    public void speak(String s) {
        System.out.println("平民说：哎呀呀，" + s);
    }

    public void depict() {
        System.out.println("平民身穿" + getCloth() + "头发是" + getHairColor() + "，" + getAppearance() );
        System.out.println("");
    }
}
