package com.jiankang.javacoretechnologythetenversion.dchapter8.v2;

/*
 *@create by jiankang
 *@date 2020/8/3 time 20:07
 */

import com.jiankang.javacoretechnologythetenversion.dchapter8.v1.UserInfo;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class BeanInfoUtil {

    public static void setPropertyByIntrospector(UserInfo userInfo, String userName) throws Exception {
        final BeanInfo beanInfo = Introspector.getBeanInfo(UserInfo.class);
        final PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        if (propertyDescriptors != null && propertyDescriptors.length > 0) {
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                if (propertyDescriptor.getName().equals(userName)) {
                    final Method writeMethod = propertyDescriptor.getWriteMethod();
                    writeMethod.invoke(userInfo, "alan");
                    System.out.println("set userName: " + userInfo.getUserName());
                    break;
                }
            }
        }
    }


    public static void getPropertyByIntrospector(UserInfo userInfo, String userName) throws Exception {
        final BeanInfo beanInfo = Introspector.getBeanInfo(UserInfo.class);
        final PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        if (propertyDescriptors != null && propertyDescriptors.length > 0) {
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                if (propertyDescriptor.getName().equals(userName)) {
                    final Method readMethod = propertyDescriptor.getReadMethod();
                    final Object objUserName = readMethod.invoke(userInfo);
                    System.out.println("get userName: " + objUserName.toString());
                    break;
                }
            }
        }
    }
}
