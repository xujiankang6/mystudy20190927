package com.jiankang.designismethod2.flyweightpattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/24 time 17:21
 */

public class Client {
    public static void main(String[] args) {
       SignInfoFactory.getSignInfo("科目1");
       SignInfoFactory.getSignInfo("科目2");
       SignInfoFactory.getSignInfo("科目3");
       SignInfoFactory.getSignInfo("科目4");
       //取得对象
        SignInfo signInfo = SignInfoFactory.getSignInfo("科目2");
        while (true){
            signInfo.setId("zhangsan");
            signInfo.setLocation("ZhangSan");
            (new MultiThread(signInfo)).start();
            signInfo.setId("LiSi");
            signInfo.setLocation("LiSi");
            (new MultiThread(signInfo)).start();

        }

    }
}
