package com.jiankang.blog.v1_20200115.v7;

/*
 *@create by jiankang
 *@date 2020/1/16 time 15:33
 *
 * 枚举单例
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum SingletonEnum {
    INSTANCE;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取枚举类的构造函数
        Constructor<SingletonEnum> declaredConstructor = SingletonEnum.class.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        SingletonEnum singletonEnum = declaredConstructor.newInstance("otherInstance", 9);
        System.out.println(singletonEnum);
    }
}
