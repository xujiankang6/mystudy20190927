package com.jiankang.blog.v4_20200823.v2;

/*
 *@create by jiankang
 *@date 2020/8/25 time 10:51
 */

public class VMStackOOM {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        try {
            recursion.recursionself();
        } catch (Exception e) {
            System.out.println("current value :" + recursion.currentValue);
            throw e;
        }
    }
}
