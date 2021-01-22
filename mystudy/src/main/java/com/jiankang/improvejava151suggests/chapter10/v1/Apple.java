package com.jiankang.improvejava151suggests.chapter10.v1;

/*
 *@create by jiankang
 *@date 2020/11/7 time 12:35
 * 通过clone创建对象性能比new对象低好多倍
 */

public class Apple implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public static void main(String[] args) {
        final int maxLoops = 10 * 10000;
        int loops = 0;
        long start = System.currentTimeMillis();
        Apple apple = new Apple();
        while (++loops < maxLoops) {
            try {
                apple.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        long mid =  System.currentTimeMillis();
        System.out.println("clone方法生成对象耗时： " + (mid - start) + " ms");
        while (--loops > 0) {
            new  Apple();
        }
        long end =  System.currentTimeMillis();
        System.out.println("new 生成对象耗时： "+(end-mid)+" ms");
    }
}
