package com.jiankang.designismethod2.behavorpatternpk.v1;

/*
 *@create by jiankang
 *@date 2020/1/6 time 16:53
 */

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new Gzip());
        context.compress("aa","bb");
    }
}
