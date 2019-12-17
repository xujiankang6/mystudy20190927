package com.jiankang.designismethod2.prototypepattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/13 time 21:12
 * 对象拷贝时，构造函数没有执行，因为是从内存中以二进制流的方式进行拷贝，重新分配一个内存块
 */

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Thing thing = new Thing();
        Thing clonething = (Thing) thing.clone();
    }
}
