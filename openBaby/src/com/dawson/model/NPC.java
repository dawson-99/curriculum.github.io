package com.dawson.model;

public class NPC {

    public String talk(String str){
        StringBuffer stringBuffer = new StringBuffer(str); //设置这个对象用于实现字符串反转
        stringBuffer.reverse(); //反转
        String Tstring = new String(stringBuffer);//将其转换为String对象便于输出
        System.out.println("NPC说："+Tstring);
        return Tstring;
    }
    //这个方法用于检查密码是否与用户的密码一直
    public boolean open(int reverseStr,String Tstring){
        User user = new User();

        if(reverseStr == user.getReverse(Tstring)) {
            return true;
        }
        else {
            return false;
        }
    }

}
