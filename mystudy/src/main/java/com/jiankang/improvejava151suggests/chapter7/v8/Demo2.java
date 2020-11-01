package com.jiankang.improvejava151suggests.chapter7.v8;

/*
 *@create by jiankang
 *@date 2020/11/1 time 13:32
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String method = "doStuff";
         Method m1 = Foo.class.getDeclaredMethod(method);
         m1.invoke(new Foo());
         Method m2 = Foo.class.getMethod(method);
        System.out.println("Accessible: "+m2.isAccessible());
        //设置为true，跳过安全检查，大大提高性能
         m2.setAccessible(true);
         m2.invoke(new Foo());
    }

    static class  Foo{
       public void doStuff(){
            System.out.println("aaa");
        }
    }
}
