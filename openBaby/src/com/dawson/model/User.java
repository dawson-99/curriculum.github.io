package com.dawson.model;

import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class User {
   public int getReverse(String Tstirng){
        String regex = "[^0123456789]+";
        String password = "";
        Tstirng = Tstirng.replaceAll(regex,"#");
        StringTokenizer passwordStr = new StringTokenizer(Tstirng,"#");

        while(passwordStr.hasMoreTokens()){
            password = password + passwordStr.nextToken();
        }

        password = password.substring(0,6);
        int reverse = parseInt(password);
        return reverse;
    }

    public void talk(String str) {
       System.out.println(str);
    }
}
