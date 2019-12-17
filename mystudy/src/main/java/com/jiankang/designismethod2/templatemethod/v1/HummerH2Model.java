package com.jiankang.designismethod2.templatemethod.v1;

/*
 *@create by jiankang
 *@date 2019/11/11 time 11:42
 */

public class HummerH2Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2引擎声音是这样的...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2鸣笛...");
    }

}
