package com.jiankang.designismethod2.createclasspatternpk.v4;

/*
 *@create by jiankang
 *@date 2019/12/31 time 17:24
 */

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        ICar benzSuv = director.createBenzSuv();
        System.out.println(benzSuv.getEngine());
    }
}
