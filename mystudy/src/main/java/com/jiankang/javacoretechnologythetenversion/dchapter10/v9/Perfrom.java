package com.jiankang.javacoretechnologythetenversion.dchapter10.v9;

/*
 *@create by jiankang
 *@date 2020/7/28 time 15:55
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Perfrom {

    String value() default "";
}
