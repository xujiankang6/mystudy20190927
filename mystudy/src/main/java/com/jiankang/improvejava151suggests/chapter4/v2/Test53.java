package com.jiankang.improvejava151suggests.chapter4.v2;

/*
 *@create by jiankang
 *@date 2020/10/27 time 16:00
 */

public class Test53 {
    public static void main(String[] args) {
        System.out.println("好是好".replaceAll("好","").equals("是"));
        //replaceAll传递的第一个接口是正则表达式
        System.out.println("$ 是 $".replaceAll("$","").equals("是"));

        //线程不安全
        StringBuilder s;
        //线程安全
        StringBuffer sb;

        String str1 = 1+2+" apples ";
        //在加号的计算中，只要最初是字符串，后面的都会先转成字符串拼接，加括号可以避免
        String str2 = " apples "+1+2;
        System.out.println(str1);
        System.out.println(str2);
    }
}
