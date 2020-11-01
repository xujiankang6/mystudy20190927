package com.jiankang.javacoretechnologythetenversion.dchapter12.v1;

/*
 *@create by jiankang
 *@date 2020/7/30 time 17:55
 */

public class HelloNativeTest {
    public static void main(String[] args) {
        HelloNative.greeting();
    }

    static {
        System.loadLibrary("HelloNative.c");
    }
}
