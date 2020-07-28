package com.jiankang.javacoretechnologythetenversion.dchapter10.v9;

/*
 *@create by jiankang
 *@date 2020/7/28 time 11:57
 */

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@TestAnnotation
public class Test {
    @Check("hi")
    int a;

    @Perfrom
    public void testMethod() {
    }

    @SuppressWarnings("deprecation")
    public void test1() {
        System.out.println("test1 method");
    }

    public static void main(String[] args) {
        final boolean annotationPresent = Test.class.isAnnotationPresent(TestAnnotation.class);
        if (annotationPresent) {
            final TestAnnotation annotation = Test.class.getAnnotation(TestAnnotation.class);
            System.out.println("id:" + annotation.id());
            System.out.println("msg:" + annotation.msg());
        }

        try {
            final Field a = Test.class.getDeclaredField("a");
            a.setAccessible(true);
            final Check check = a.getAnnotation(Check.class);
            if(check!=null){
                System.out.println("check value : "+check.value());
            }
            final Method testMethod = Test.class.getDeclaredMethod("testMethod");
            if(testMethod!=null){
                final Annotation[] annotations = testMethod.getAnnotations();
                for (Annotation annotation : annotations) {
                    System.out.println("method testMethod annotation: "+annotation.annotationType().getSimpleName());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
