package com.jiankang.improvejava151suggests.chapter9.v9;

/*
 *@create by jiankang
 *@date 2020/11/5 time 13:55
 */

public class Client {
    public static void main(String[] args) {
         Foo foo = new Foo();

         //递归是可以执行的，虽然显示锁是标注在方法上了，但实际作用的是整个对象
         new Thread(foo).start();

    }
}
