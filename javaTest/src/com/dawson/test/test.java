package com.dawson.test;

public class test {
    public static void main(String args[]) {
        System.out.println("capitalization of Greek Alphabet and lower case");
        char capital = '\u0391'; // we can konw the acs code of Alpha was \u0391
        char lower = '\u03B1';

        for (int i = 0;i < 25;i++) {
            System.out.println(capital + "\t" + lower);
            capital++;
            lower++;
        }

    }
}
