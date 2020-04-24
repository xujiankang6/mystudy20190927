package com.jiankang.javaprogramminglogic.chapter2.v1;

/*
 *@create by jiankang
 *@date 2020/4/22 time 13:19
 */

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        int a = 4;
        System.out.println(a >> 2);
        System.out.println(a << 2);

        //返回0或者1，就是a最右边一位的值，可以用来判断奇数 ， 偶数
        System.out.println(a & 0x1);

        //不管a原来最右边一位是什么，都将设为1
        System.out.println(a | 0x1);


        //BIgDecimal using
        BigDecimal b = new BigDecimal(Float.toString(0.1f));
        BigDecimal b2 = new BigDecimal(Float.toString(0.1f));
        BigDecimal multiply = b.multiply(b2);
        System.out.println(multiply);


        //浮点数精度问题
        float f = 0.1f * 0.1f;
        System.out.println(f);


        //查看浮点数具体二进制表示
        String string = Integer.toBinaryString(Float.floatToIntBits(1f));
        System.out.println(string);

        String string1 = Long.toBinaryString(Double.doubleToLongBits(Double.doubleToLongBits(1)));
        System.out.println(string1);

    }
}
