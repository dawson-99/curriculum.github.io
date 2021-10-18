package com.dawson.bankAccount;


//应用：猪八戒，住在高老庄1号，账户上1000元，存款250元后，取款777元，余下的存款10年后的变成多少？
public class test {
    public static void main(String [] args) {

        System.out.println("利息设置为年利率4.9%");

        //init the account
        Account baJie = new Account();
        baJie.setName("baJie");
        baJie.setAddress("高老庄1号");
        Bank bank1 = new Bank();
        bank1.setSum(1000);
        bank1.setId("202013160210");
        baJie.setBank(bank1);


        System.out.println("账户名称:" + baJie.getName());
        System.out.println("客户地址:" + baJie.getAddress());

        //operations

        baJie.getBank().deposite(250);
        baJie.getBank().getMoney(777);

        System.out.println("十年以后钱是" + baJie.getBank().getTotalSum(10));
    }
}
