package com.jiankang.javacoretechnologythetenversion.dchapter8.v3;

/*
 *@create by jiankang
 *@date 2020/8/3 time 20:25
 * 使用commons包下的BeanUtils
 */
import com.jiankang.javacoretechnologythetenversion.dchapter8.v1.UserInfo;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

public class BeanUtilTest {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        try {
            BeanUtils.setProperty(userInfo,"userName","peida");
            System.out.println("set userName: "+userInfo.getUserName());
            System.out.println("get userName: "+BeanUtils.getProperty(userInfo,"userName"));

            BeanUtils.setProperty(userInfo,"age",18);
            System.out.println("set age: "+userInfo.getAge());
            System.out.println("get age: "+BeanUtils.getProperty(userInfo,"age"));

            System.out.println("get userName type: "+BeanUtils.getProperty(userInfo,"userName").getClass().getName());
            System.out.println("get age type: "+BeanUtils.getProperty(userInfo,"age").getClass().getName());

            PropertyUtils.setProperty(userInfo,"age",8);
            System.out.println(PropertyUtils.getProperty(userInfo,"age"));
            System.out.println(PropertyUtils.getProperty(userInfo,"age").getClass().getName());
            PropertyUtils.setProperty(userInfo,"age","9");
        }catch (Exception e){
            e.printStackTrace();
        }
    }




}
