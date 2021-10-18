package com.dawson.multiple;


public class test {

    public static void main(String [] args) {


        for(int i = 9;i > 0; i--) {

           for (int j = i -1;j > 0;j--){
               System.out.print("        ");
           }


           for (int m = 10 - i ;m > 0;m--){
               int n = 10 - i;
               if (m*n < 10) {
                   System.out.print(n + "*" + m + "=" + m*n + "   ");
               } else {
                   System.out.print(n + "*" + m + "=" + m*n + "  ");
               }

           }
            System.out.println();
        }
    }

}
