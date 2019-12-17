package com.jiankang.designismethod2.decoratorpattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/21 time 14:01
 */

public class SortDecorator extends Decorator {
    //构造函数
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportSort(){
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
