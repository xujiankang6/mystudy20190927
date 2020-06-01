package com.jiankang.javaprogramminglogic.chapter22.v2;

/*
 *@create by jiankang
 *@date 2020/5/19 time 13:43
 */

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodAnnotations {

    @Target(ElementType.PARAMETER)
    @Retention(RetentionPolicy.RUNTIME)
    static @interface QueryParam {
        String value();
    }

    @Target(ElementType.PARAMETER)
    @Retention(RetentionPolicy.RUNTIME)
    static @interface DefaultValue {
        String value() default "";
    }

    public void hello(@QueryParam("action") String action, @QueryParam("sort") @DefaultValue("asc") String sort) {
        System.out.println(action + ":" + sort);
    }

    public static void main(String[] args) throws Exception{
        Class<MethodAnnotations> cls = MethodAnnotations.class;
        Method method = cls.getMethod("hello", String.class,String.class);
        Annotation[][] annts = method.getParameterAnnotations();
        System.out.println(Arrays.deepToString(annts));
        for (int i = 0; i <annts.length ; i++) {
            System.out.println("annotations for paramter: "+(i+1));
            Annotation[] anntArr = annts[i];
            for(Annotation annt:anntArr){
                if(annt instanceof QueryParam){
                    QueryParam qp = (QueryParam) annt;
                    System.out.println(qp.annotationType().getSimpleName()+":"+qp.value());
                }else if(annt instanceof DefaultValue){
                    DefaultValue dv = (DefaultValue) annt;
                    System.out.println(dv.annotationType().getSimpleName()+":"+dv.value());
                }
            }
        }
    }

}
