package com.jiankang.designismethod2.strategypattern.v3;

/*
 *@create by jiankang
 *@date 2019/11/21 time 15:42
 */

public class Client {
    public static void main(String[] args) {
        int exec = Calculator.MUL.exec(1, 2);
        System.out.println(exec);
    }


}
