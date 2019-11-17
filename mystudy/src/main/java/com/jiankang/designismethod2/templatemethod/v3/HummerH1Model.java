package com.jiankang.designismethod2.templatemethod.v3;

/*
 *@create by jiankang
 *@date 2019/11/11 time 11:39
 */

public class HummerH1Model extends HummerModel {

    private boolean alarmFlag = true;

    @Override
    protected void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1引擎声音是这样的...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1鸣笛...");
    }

    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }
}
