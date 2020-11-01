package com.jiankang.javacoretechnologythetenversion.chapter1.v1;

/*
 *@create by jiankang
 *@date 2020/5/27 time 18:11
 */

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        //多个字符串放在一起，用定界符分割
        String all = String.join("/","S","s");
        System.out.println(all);

        BigInteger a = new BigInteger("1");
        BigInteger add = a.add(a);
        System.out.println(add.longValue());
        BigInteger one = BigInteger.ONE;
        System.out.println(one);
        int i = a.compareTo(one);
        System.out.println(i);
        BigInteger not = one.not();
        System.out.println(not);


    }
}
