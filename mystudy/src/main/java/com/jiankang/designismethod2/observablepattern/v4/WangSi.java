package com.jiankang.designismethod2.observablepattern.v4;

/*
 *@create by jiankang
 *@date 2019/11/25 time 19:48
 */

import java.util.Observable;
import java.util.Observer;

public class WangSi implements Observer {

    public void reportToQiShiHuang(String reportContext){
        System.out.println("报告，韩非子有活动了---》"+reportContext);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯，观察到韩非子活动，开始汇报");
        this.reportToQiShiHuang(arg.toString());
        System.out.println("汇报完毕");
    }
}
