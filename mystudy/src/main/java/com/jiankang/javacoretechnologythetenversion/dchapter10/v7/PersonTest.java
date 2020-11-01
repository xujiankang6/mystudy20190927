package com.jiankang.javacoretechnologythetenversion.dchapter10.v7;

/*
 *@create by jiankang
 *@date 2020/7/28 time 10:49
 */

import com.sun.istack.internal.NotNull;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonTest {
    public static void main(String[] args) throws Exception {
        Person jiankang = new Person("jiankang", "河南省");
        check(jiankang);
        final Method[] methods = Person.class.getMethods();
        for (Method method : methods) {
            final Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            for (Annotation[] parameterAnnotation : parameterAnnotations) {
                for (Annotation annotation : parameterAnnotation) {
                    if(annotation instanceof Range){
                        Range r = (Range) annotation;
                        System.out.println(r.toString());
                    }
                    if(annotation instanceof NotNull){
                        NotNull n = (NotNull) annotation;
                        System.out.println(n.toString());
                    }
                }
            }
        }



    }

    //对注解进行检测逻辑，是自己开发的
    static void check(Person person) throws Exception {
        for (Field field : person.getClass().getFields()) {
            final Range range = field.getAnnotation(Range.class);
            if (range != null) {
                final Object value = field.get(person);
                if (value instanceof String) {
                    String s = (String) value;
                    if (s.length() < range.min() || s.length() > range.max()) {
                        throw new IllegalArgumentException("Invalid field: " + field.getName());
                    }
                }
            }
        }
    }
}
