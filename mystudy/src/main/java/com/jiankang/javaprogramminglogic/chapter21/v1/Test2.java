package com.jiankang.javaprogramminglogic.chapter21.v1;

/*
 *@create by jiankang
 *@date 2020/5/17 time 20:00
 */


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class Test2 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        HashMap hashMap = HashMap.class.newInstance();
        hashMap.put("hello",132);
        Constructor<StringBuilder> constructor = StringBuilder.class.getConstructor(int.class);
        StringBuilder stringBuilder = constructor.newInstance(100);
        System.out.println(stringBuilder);
        String[] strings = new String[]{};
        System.out.println(strings.getClass().getComponentType());
    }

}
