package com.jiankang.designismethod2.adapterpattern.v3;

/*
 *@create by jiankang
 *@date 2019/11/21 time 17:30
 */

public class Test {
    public static void main(String[] args) {
        IUserInfo userInfo = new OuterUserInfo(new OuterUserBaseInfo(),new OuterUserHomeInfo(),new OuterUserOfficeInfo());
        userInfo.getHomeAddress();
        userInfo.getHomeTelNumber();
        userInfo.getJobPosition();
        userInfo.getMobileNumber();
        userInfo.getOfficeTelNumber();

    }
}
