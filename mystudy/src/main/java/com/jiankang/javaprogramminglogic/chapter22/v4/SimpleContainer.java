package com.jiankang.javaprogramminglogic.chapter22.v4;

/*
 *@create by jiankang
 *@date 2020/5/19 time 17:59
 */

import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SimpleContainer {

    private static Map<Class<?>, Object> instances = new ConcurrentHashMap<>();


    //类型是单例有的话就不需要创建
    public static <T> T getSingletonInstance(Class<T> cls) {

        try {

            boolean singeleton = cls.isAnnotationPresent(SimpleSingleton.class);
            if (!singeleton) {
                return createInstance(cls);
            }
            Object obj = instances.get(cls);
            if (obj != null) {
                return (T) obj;
            }
            synchronized (cls) {
                obj = instances.get(cls);
                if (obj == null) {
                    obj = createInstance(cls);
                    instances.put(cls, obj);
                }
            }
            return (T) obj;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static <T> T createInstance(Class<T> cls) {

        try {
            T obj = cls.newInstance();
            Field[] fields = cls.getDeclaredFields();
            for (Field f : fields) {
                if (f.isAnnotationPresent(SimpleInject.class)) {
                    if (!f.isAccessible()) {
                        f.setAccessible(true);
                    }
                    Class<?> fieldCls = f.getType();
                    f.set(obj, getSingletonInstance(fieldCls));
                }
            }
            return obj;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }


    public static <T> T getInstance(Class<T> cls) {

        try {
            T obj = cls.newInstance();
            Field[] fields = cls.getDeclaredFields();
            for (Field f : fields) {
                if (f.isAnnotationPresent(SimpleInject.class)) {
                    if (!f.isAccessible()) {
                        f.setAccessible(true);
                    }
                    Class<?> fieldCls = f.getType();
                    f.set(obj, getInstance(fieldCls));
                }
            }
            return obj;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }


}
