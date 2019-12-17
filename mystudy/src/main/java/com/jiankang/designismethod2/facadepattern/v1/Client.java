package com.jiankang.designismethod2.facadepattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/26 time 14:28
 */

public class Client {
    public static void main(String[] args) {
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        modenPostOffice.sendLetter("hello ,l love you ,miss wang ", "beijing chaoyang");
    }
}
