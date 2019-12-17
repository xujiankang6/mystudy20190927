package com.jiankang.designismethod2.adapterpattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/21 time 17:30
 */

public class Test {
    public static void main(String[] args) {
        IUserInfo youngGirl = new UserInfo();
        youngGirl.getMobileNumber();

        IUserInfo young = new OuterUserInfo();
        young.getMobileNumber();
    }
}
