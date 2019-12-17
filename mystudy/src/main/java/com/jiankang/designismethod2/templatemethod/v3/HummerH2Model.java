package com.jiankang.designismethod2.templatemethod.v3;

/*
 *@create by jiankang
 *@date 2019/11/11 time 11:42
 */

public class HummerH2Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2引擎声音是这样的...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2鸣笛...");
    }


    //默认没有喇叭
    @Override
    protected boolean isAlarm() {
        return false;
    }
}
