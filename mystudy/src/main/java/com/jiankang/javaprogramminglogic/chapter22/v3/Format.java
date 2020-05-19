package com.jiankang.javaprogramminglogic.chapter22.v3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 *@create by jiankang
 *@date 2020/5/19 time 14:57
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Format {

    String pattern() default "yyyy-MM-dd HH:mm:ss";

    String timezone() default "GMT+8";
}
