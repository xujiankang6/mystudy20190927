package com.jiankang.improvejava151suggests.chapter7.v4;

/*
 *@create by jiankang
 *@date 2020/10/30 time 15:08
 */

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Utils {

    //获得一个泛型类的实际泛型类型
    public static <T> Class<T> getGenricClassType(Class clz) {
        Type type = clz.getGenericSuperclass();
        if (type instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) type;
            Type[] types = pt.getActualTypeArguments();
            if (types.length > 0 && types[0] instanceof Class) {
                return (Class<T>) types[0];
            }

        }
        return (Class<T>) Object.class;
    }


}
