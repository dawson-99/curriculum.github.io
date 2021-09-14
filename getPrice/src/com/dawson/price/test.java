package com.dawson.price;

import java.util.Scanner;

public class test {


    public static void main(String [] args) {
        int amount;
        float price;
        float sum;

        Scanner scanner = new Scanner(System.in);

        System.out.println("input the amount");
        amount = scanner.nextInt();
        System.out.println("input the price of single product");
        price = scanner.nextFloat();

        sum = amount * price;
        System.out.println("the total price is: " + sum);
    }

}
