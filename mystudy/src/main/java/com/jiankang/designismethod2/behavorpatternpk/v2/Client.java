package com.jiankang.designismethod2.behavorpatternpk.v2;

/*
 *@create by jiankang
 *@date 2020/1/6 time 19:06
 */

public class Client {
    public static void main(String[] args) {
        AbstractCmd cmd = new GZipCompressCmd();
        Invoker invoker = new Invoker(new ZipCompressCmd());
        invoker.execute("a","b");


    }
}
