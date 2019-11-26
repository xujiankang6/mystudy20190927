package com.jiankang.designismethod2.observablepattern.v4;

/*
 *@create by jiankang
 *@date 2019/11/25 time 19:55
 */

import java.util.Observer;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        Observer lisi = new LiSi();
        Observer wangsi =new WangSi();
        Observer liusi = new LiuSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(wangsi);
        hanFeiZi.addObserver(liusi);
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();




    }
}
