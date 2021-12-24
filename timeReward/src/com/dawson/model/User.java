package com.dawson.model;

import java.time.LocalDate;

public class User {
    LocalDate birthday;

    public User(int year,int month,int dayofmonth){
        birthday= LocalDate.of(year,month,dayofmonth);
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
