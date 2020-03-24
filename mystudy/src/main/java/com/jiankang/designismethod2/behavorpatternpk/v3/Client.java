package com.jiankang.designismethod2.behavorpatternpk.v3;

/*
 *@create by jiankang
 *@date 2020/1/6 time 20:07
 */

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setAlgorithm(new AdultWork());
        context.work();
    }
}
