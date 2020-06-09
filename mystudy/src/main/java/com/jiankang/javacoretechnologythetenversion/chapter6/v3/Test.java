package com.jiankang.javacoretechnologythetenversion.chapter6.v3;

/*
 *@create by jiankang
 *@date 2020/6/6 time 11:20
 */

public class Test {
    public static void main(String[] args) {
        int[] luckyNumber = {2,3,5,7,11,13};
        int[] cloned = luckyNumber.clone();
        cloned[5] =12;  //不改变luckyNumber的值
        System.out.println(luckyNumber[5]);
    }
}
