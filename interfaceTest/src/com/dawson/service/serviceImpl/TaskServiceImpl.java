package com.dawson.service.serviceImpl;

import com.dawson.service.TaskService;

public class TaskServiceImpl implements TaskService {

    public void serchBaby() {
       System.out.println("发布寻宝任务");
    }

    public void killUgly() {
        System.out.println("发布杀怪任务");
    }

    public void chase(){
        System.out.println("发布追缉任务");
    }

    public void plant() {
        System.out.println("发布种地任务");
    }

    @Override
    public void doubleone() {
        System.out.println("发布双十一惊喜任务");
    }
}
