package com.jiankang.designismethod2.createclasspatternpk.v2;

/*
 *@create by jiankang
 *@date 2019/12/31 time 16:01
 */

public class Client {
    public static void main(String[] args) {
        SuperMan adultBuilder = Director.getAdultBuilder();
        String body = adultBuilder.getBody();
        System.out.println(body);
    }
}
