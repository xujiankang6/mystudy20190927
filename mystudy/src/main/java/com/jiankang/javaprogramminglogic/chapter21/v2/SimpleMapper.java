package com.jiankang.javaprogramminglogic.chapter21.v2;

/*
 *@create by jiankang
 *@date 2020/5/18 time 16:04
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class SimpleMapper {
    public static String toString(Object obj) {
        try {
            Class<?> cls = obj.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName() + "\n");
            for (Field f : cls.getDeclaredFields()) {
                if (!f.isAccessible()) {
                    f.setAccessible(true);
                }
                sb.append(f.getName() + "=" + f.get(obj).toString() + "\n");
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }


    public static Object fromString(String str) {
        try {
            String[] lines = str.split("\n");
            if (lines.length < 1) {
                throw new IllegalArgumentException(str);
            }
            Class<?> cls = Class.forName(lines[0]);
            Object obj = cls.newInstance();
            if (lines.length > 1) {
                for (int i = 1; i < lines.length; i++) {
                    String[] fv = lines[i].split("=");
                    if (fv.length != 2) {
                        throw new IllegalArgumentException(lines[i]);
                    }
                    Field f = cls.getDeclaredField(fv[0]);
                    if (!f.isAccessible()) {
                        f.setAccessible(true);
                    }
                    setFieldValue(f, obj, fv[1]);
                }
            }
            return obj;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void setFieldValue(Field f, Object obj, String value) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class<?> type = f.getType();
        if (type == int.class) {
            f.setInt(obj, Integer.parseInt(value));
        } else if (type == String.class) {
            f.set(obj, value);
        } else if (type == double.class) {
            f.setDouble(obj, Double.parseDouble(value));
        } else {
            Constructor<?> constructor = type.getConstructor(String.class);
            f.set(obj, constructor.newInstance(value));
        }
    }
}
