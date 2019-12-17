package com.jiankang.designismethod2.decoratorpattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/20 time 15:43
 */

public abstract class SchoolReport {
    //成绩单主要展示的就是你的成绩情况
    public abstract void report();

    //成绩单要家长签字
    public abstract void sign(String name);
}
