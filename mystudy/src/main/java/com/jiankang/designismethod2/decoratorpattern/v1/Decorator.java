package com.jiankang.designismethod2.decoratorpattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/20 time 15:55
 */

public class Decorator extends SchoolReport {
    //首先我要知道是哪个成绩单
    private SchoolReport sr;

    //构造函数，进行传递
    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    //成绩单还是要被看到的
    @Override
    public void report() {
        this.sr.report();
    }

    //看完要签字
    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
