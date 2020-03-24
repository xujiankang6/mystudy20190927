package com.jiankang.designismethod2.bridgepattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/26 time 20:25
 */

public class Client {
    public static void main(String[] args) {
        Corp shanZhaiCorp = new ShanZhaiCorp(new House());
        shanZhaiCorp.makeMoney();
    }
}
