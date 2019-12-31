package com.jiankang.effectivejavasecondedition.chapter2.v4;

/*
 *@create by jiankang
 *@date 2019/12/31 time 10:56
 */
//宁可使用原语，也不要使用已经装箱的原语，并且注意无意的自动装箱
public class Client {
    public static void main(String[] args) {
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
