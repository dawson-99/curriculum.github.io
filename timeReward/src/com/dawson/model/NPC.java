package com.dawson.model;

import java.time.LocalDate;

public class NPC {

    public int reward(LocalDate date){
        LocalDate datenow=LocalDate.now();
            int age = datenow.getYear() - date.getYear();
            return age * 10;
    }

}
