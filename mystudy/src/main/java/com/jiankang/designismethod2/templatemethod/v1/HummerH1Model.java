package com.jiankang.designismethod2.templatemethod.v1;

/*
 *@create by jiankang
 *@date 2019/11/11 time 11:39
 */

public class HummerH1Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1引擎声音是这样的...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1鸣笛...");
    }


}
