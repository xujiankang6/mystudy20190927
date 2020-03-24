package com.jiankang.designismethod2.flyweightpattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/24 time 20:12
 */

public class MultiThread extends Thread {
    private SignInfo signInfo;


    public MultiThread(SignInfo signInfo) {
        this.signInfo = signInfo;
    }

    public void run() {
        if (!signInfo.getId().equals(signInfo.getLocation())) {
            System.out.println("编号： " + signInfo.getId());
            System.out.println("考试地址：" + signInfo.getLocation());
            System.out.println("线程不安全了");
        }
    }
}
