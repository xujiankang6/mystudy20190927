package com.jiankang.javacoretechnologythetenversion.dchapter8.v2;

/*
 *@create by jiankang
 *@date 2020/8/3 time 20:14
 */

import com.jiankang.javacoretechnologythetenversion.dchapter8.v1.UserInfo;
//内省操作
public class BeanInfoTest {
    public static void main(String[] args) {
        final UserInfo userInfo = new UserInfo();
        userInfo.setUserName("peida");
        try {
            com.jiankang.javacoretechnologythetenversion.dchapter8.v1.BeanInfoUtil.getProperty(userInfo,"userName");
            com.jiankang.javacoretechnologythetenversion.dchapter8.v1.BeanInfoUtil.setProperty(userInfo,"userName");
            com.jiankang.javacoretechnologythetenversion.dchapter8.v1.BeanInfoUtil.getProperty(userInfo,"userName");
            BeanInfoUtil.setPropertyByIntrospector(userInfo,"userName");
            BeanInfoUtil.getPropertyByIntrospector(userInfo,"userName");
            com.jiankang.javacoretechnologythetenversion.dchapter8.v1.BeanInfoUtil.setProperty(userInfo,"age");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
