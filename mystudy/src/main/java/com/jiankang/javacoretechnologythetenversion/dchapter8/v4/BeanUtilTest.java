package com.jiankang.javacoretechnologythetenversion.dchapter8.v4;

/*
 *@create by jiankang
 *@date 2020/8/3 time 20:41
 */

import org.apache.commons.beanutils.BeanUtils;

public class BeanUtilTest {
    public static void main(String[] args) {
        final UserInfo userInfo = new UserInfo();
        try {
            BeanUtils.setProperty(userInfo,"birthday.time","111111");
            final String obj = BeanUtils.getProperty(userInfo, "birthday.time");
            System.out.println(obj);
        }catch (Exception e){

        }
    }
}
