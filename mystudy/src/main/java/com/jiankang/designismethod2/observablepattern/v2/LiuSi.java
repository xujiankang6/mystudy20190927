package com.jiankang.designismethod2.observablepattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/25 time 19:48
 */

public class LiuSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("李斯，观察到韩非子活动，开始汇报");
        this.reportToQiShiHuang(context);
        System.out.println("汇报完毕");
    }

    public void reportToQiShiHuang(String reportContext){
        System.out.println("报告，韩非子有活动了---》"+reportContext);
    }
}
