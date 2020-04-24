package com.jiankang.javaprogramminglogic.chapter2.v3;

/*
 *@create by jiankang
 *@date 2020/4/22 time 15:37
 */

public class Test {
    public static void main(String[] args) {
        char c = 'A';
        char a = 39532;
        char b = 0x9a6c;
        char d = '\u9a6c';
        char e = '马';
        System.out.println(a + a);

        //查看char的二进制
        System.out.println(Integer.toBinaryString(e));
    }
}
