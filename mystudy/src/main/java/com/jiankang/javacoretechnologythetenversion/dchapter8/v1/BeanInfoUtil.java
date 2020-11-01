package com.jiankang.javacoretechnologythetenversion.dchapter8.v1;

/*
 *@create by jiankang
 *@date 2020/8/3 time 19:59
 */

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class BeanInfoUtil {


    public static void setProperty(UserInfo userInfo, String userName) throws Exception {
        final PropertyDescriptor propDesc = new PropertyDescriptor(userName, UserInfo.class);
        final Method methodSetUserName = propDesc.getWriteMethod();
        methodSetUserName.invoke(userInfo, "wong");
        System.out.println("set userName: " + userInfo.getUserName());
    }


    public static void getProperty(UserInfo userInfo,String userName) throws Exception {
        final PropertyDescriptor propertyDescriptor = new PropertyDescriptor(userName, UserInfo.class);
        final Method readMethod = propertyDescriptor.getReadMethod();
        final Object objUserName = readMethod.invoke(userInfo);
        System.out.println("get userName: "+objUserName.toString());
    }
}
