package com.jiankang.designismethod2.strategypattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/21 time 15:15
 */

import java.util.Arrays;

public class Client {

    public final static String ADD_SYMBOL = "+";
    public final static String SUB_SYMBOL = "-";

    public static void main(String[] args) {
        //输入的两个参数是数字
        int a = 1;
        String symbol = ADD_SYMBOL;
        int b =2;
        Context context = null;
        if(symbol.equals(ADD_SYMBOL)){
            context = new Context(new Add());
        }else if(symbol.equals(SUB_SYMBOL)){
            context = new Context(new Sub());
        }
        System.out.println("运行结果为："+a+symbol+b+"="+context.exec(a,b,symbol));

    }
}
