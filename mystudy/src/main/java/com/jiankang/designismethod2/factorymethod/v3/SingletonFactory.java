package com.jiankang.designismethod2.factorymethod.v3;

/*
 *@create by jiankang
 *@date 2019/11/3 time 12:08
 */

import java.lang.reflect.Constructor;

public class SingletonFactory {

    private static Singleton singleton;
    static {
        try{
            Class c1=Class.forName(Singleton.class.getName());
            //获得无参构造
            Constructor constructor = c1.getDeclaredConstructor();
            //设置无参构造是可以访问的
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton(){
        return singleton;
    }
}
