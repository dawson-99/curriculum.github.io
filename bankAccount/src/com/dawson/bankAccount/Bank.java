package com.dawson.bankAccount;


//实验目标：
//
//掌握对象的定义方法（属性定义、方法定义）
//
//
//
//实验内容：
//
//实现一个银行账户类
//首先考虑有哪些属性和方法
//建议：
//属性：账号、储户姓名、地址、存款余额（要求为private类型）、活期利息
//方法：存款、取款、查询、计算利息、累加利息
//
//应用：猪八戒，住在高老庄1号，账户上1000元，存款250元后，取款777元，余下的存款10年后的变成多少？
public class Bank {

    String id;  // 账号
    double rate = 0.049; // 活期利息

    private double sum = 0; // 余额


    public void deposite(double tempDepo) {
        System.out.println( "存入了" + tempDepo);
        sum = sum + tempDepo;
    }

    public void getMoney(double tempGet) {
        System.out.println( "取走了" + tempGet);
        sum = sum - tempGet;
    }

    public double getSum() {
        return sum;
    }

    public double getTotalSum(int year) {

        double interest = 0;

        while( year != 0) {
            year--;
            interest = interest + sum * rate;
            sum = sum + interest;
            year--;
        }

        return interest + sum;
    }

    public double getInterest() {
        return sum * rate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public double getRate() {
        return rate;
    }


}
