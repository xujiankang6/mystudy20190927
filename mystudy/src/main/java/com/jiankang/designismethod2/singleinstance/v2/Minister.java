package com.jiankang.designismethod2.singleinstance.v2;

/*
 *@create by jiankang
 *@date 2019/11/2 time 19:28
 */

import java.util.Random;

public class Minister {


    public static void main(String[] args) {
        int ministerNum = 5;
        for (int i = 0; i <ministerNum ; i++) {
            Emperor emperor=Emperor.getInstance();
            System.out.print("第"+(i+1)+"个大臣参拜的是：");
            emperor.say();
        }

    }
}
