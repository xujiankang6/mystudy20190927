package com.jiankang.blog.v2_20200116.v1;

/*
 *@create by jiankang
 *@date 2020/5/19 time 11:59
 */

public class Test {

    // & 与   | 或  ^ 异或  ~非

    public static void main(String[] args) {
        //获得int型最大值  2147483647的十六进制为0x7FFFFFFF,其中最高位为符号位
        System.out.println((1 << 31) - 1);
        System.out.println(~(1 << 31));

        //获得int最小值
        System.out.println(1<<31);
        System.out.println(1<<-1);



    }
}
