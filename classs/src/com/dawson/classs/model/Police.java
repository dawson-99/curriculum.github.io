package com.dawson.classs.model;

public class Police extends Role {
    String cloth = "铠甲";
    String hairColor = "青色";
    String appearance = "巡捕严肃的表情依旧挂在他的脸上，右手的棒槌是他的致命武器";

    int runSpeed = 40;
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
        System.out.println("巡捕威武地步行了100米");

        walkYet = 1;
    }

    public void run() {
        System.out.println("巡捕跑完了1000千米");
    }

    public void speak(String s) {
        System.out.println("巡捕说：本官觉得，" + s);
    }

    public void depict() {
        System.out.println("警察身穿" + getCloth() + "头发是" + getHairColor() + "，" + getAppearance() );
        System.out.println("");
    }
}
