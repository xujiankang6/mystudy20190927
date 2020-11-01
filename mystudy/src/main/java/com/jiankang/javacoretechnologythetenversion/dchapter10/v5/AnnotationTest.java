package com.jiankang.javacoretechnologythetenversion.dchapter10.v5;

/*
 *@create by jiankang
 *@date 2020/7/27 time 20:31
 */

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationTest {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Class<Person> c = Person.class;
        Method msomebody = c.getMethod("somebody", String.class, int.class);
        msomebody.invoke(person, "lily", 19);
        iteratorAnnotations(msomebody);

        final Method empty = c.getMethod("empty", new Class[]{});
        empty.invoke(person,new Object[]{});
        iteratorAnnotations(empty);

    }


    public static void iteratorAnnotations(Method method) {
        if (method.isAnnotationPresent(MyAnnotation.class)) {
            final MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            final String[] values = annotation.value();
            for (String value : values) {
                System.out.print(value + ", ");
            }
            System.out.println();
        }

        final Annotation[] annotations = method.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }


}
