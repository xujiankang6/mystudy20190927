package com.jiankang.designismethod2.flyweightpattern.v1;

/*
 *@create by jiankang
 *@date 2019/12/24 time 17:21
 */

public class Client {
    public static void main(String[] args) {
        //初始化对象池
        for (int i = 0; i < 4; i++) {
            String subject = "科目" + i;
            //初始化地址
            for (int j = 0; j < 30; j++) {
                String key = subject + "考试地点" + j;
                SignInfoFactory.getSignInfo(key);
            }

        }
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");
        }
        long tailTime = System.currentTimeMillis();
        System.out.println("执行时间： "+(tailTime-currentTime)+ " ms");
    }

}
