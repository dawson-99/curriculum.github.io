package com.dawson.classs.model;

public class Thief extends Role {

    String cloth = "便衣";
    String hairColor = "黑色";
    String appearance = "盗贼满脸都洋溢着高兴，就是衣服有点脏了";

    int runSpeed = 100;
    int walkSpeed = 4;

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
        System.out.println("盗贼小心翼翼步行了100米");

        walkYet = 1;
    }

    public void run() {
        System.out.println("盗贼跑完了1000千米");
    }

    public void speak(String s) {
        System.out.println("盗贼说：按我来看," + s);
    }

    public void depict() {
        System.out.println("盗贼身穿" + getCloth() + "头发是" + getHairColor() + "，" + getAppearance() );
        System.out.println("");
    }
}
