package com.dawson.price;

import java.util.Scanner;

public class test {


    public static void main(String [] args) {
        int amount = 0;
        float price = 0;
        float sum;

        Scanner scanner = new Scanner(System.in);

        //the nextXxx method was used to judge
        System.out.println("input the amount");
        if(scanner.hasNextInt()){
            amount = scanner.nextInt();
        } else {
            System.out.println("error");
        }

        System.out.println("input the price of single product");
        if (scanner.hasNextFloat()) {
            price = scanner.nextFloat();
        } else {
            System.out.println("error");
        }


        sum = amount * price;
        System.out.println("the total price is: " + sum);
    }

}
