package com.dawson.test.model;

import com.dawson.test.model.Student;
public class test {

    public static void main(String [] args) {
        Student student = new Student();

        System.out.println("---------------------");
        System.out.println("to begin with, I show the display without param");
        System.out.println("name: " + student.getName());
        System.out.println("sex: " + student.getSex());
        System.out.println("age: " + student.getAge());

        System.out.println("---------------------");
        System.out.println("now, I show the display with four params");
        student = new Student("dawson","male",19,100);
        System.out.println("name: " + student.getName());
        System.out.println("sex: " + student.getSex());
        System.out.println("age: " + student.getAge());
        System.out.println("---------------------");
        System.out.println("done");

    }

}
