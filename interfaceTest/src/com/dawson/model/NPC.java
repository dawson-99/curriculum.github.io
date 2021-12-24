package com.dawson.model;

import com.dawson.service.TaskService;
import com.dawson.service.serviceImpl.TaskServiceImpl;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Calendar;

public class NPC {

    TaskService taskService = new TaskServiceImpl();
    Calendar calendar= Calendar.getInstance();
    Calendar calendar1 = calendar;

    LocalDateTime localDateTime1 = LocalDateTime.of(2021,11,11,11,11);

    public void setTask(Role role) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("当前时间: " + localDateTime.toString());
        if (role instanceof Peasant) {
            role.setStatus(1);
            System.out.print("NPC");
            Duration duration = Duration.between(localDateTime,localDateTime1);
            if (duration.isZero()){
               taskService.doubleone();
            } else {
                taskService.plant();
            }
        }

        if (role instanceof swordsMan) {
            role.setStatus(1);
            System.out.print("NPC");
            Duration duration = Duration.between(localDateTime,localDateTime1);
            if (duration.isZero()){
                taskService.doubleone();
            } else {
                taskService.chase();
            }
        }

        if (role instanceof Theif) {
            calendar= Calendar.getInstance();
            role.setStatus(1);
            Duration duration = Duration.between(localDateTime,localDateTime1);
            if (duration.isZero()){
                taskService.doubleone();
            } else {
                long m = calendar.getTime().getTime() - calendar1.getTime().getTime();
                System.out.println("运行时间：" + m + "毫秒");
                System.out.println("!!!!程序员注：此处用运行时间代替对话时间，我也不知道这怎么算出来的时间，但是确实会变化！!!!!");
                System.out.print("NPC");
                if (m%2 == 1){
                    taskService.serchBaby();
                } else {
                    taskService.killUgly();
                }
            }
        }
    }

    public void setReward(Role role) {

        if (role instanceof Peasant) {
            if (role.getStatus() == 3) {
                System.out.println("NPC: " + role.getRank() + "获取1000金币");
            } else {
                System.out.println("未完成任务");
            }

        }

        if (role instanceof swordsMan) {
            if (role.getStatus() == 3) {
                System.out.println("NPC: " + role.getRank() + "获取199金币");
            } else {
                System.out.println("未完成任务");
            }
        }

        if (role instanceof Theif) {

            if (role.getStatus() == 3) {
                System.out.println("NPC: " + role.getRank() + "获取666金币");
            } else {
                System.out.println("未完成任务");
            }
        }
    }

    public void talk(String s) {
        System.out.println("NPC: " + s);
    }



}
