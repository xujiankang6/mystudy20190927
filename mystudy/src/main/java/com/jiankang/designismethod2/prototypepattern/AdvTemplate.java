package com.jiankang.designismethod2.prototypepattern;

/*
 *@create by jiankang
 *@date 2019/11/13 time 20:15
 */

public class AdvTemplate {
    //广告信名称
    private String advSubject = "XX银行国庆信用卡抽奖活动";
    //广告信内容
    private String advContext = "国庆抽奖活动通知：只要刷卡就送你一百万！...";

    public String getAdvSubject() {
        return this.advSubject;
    }

    public String getAdvContext() {
        return this.advContext;
    }

}
