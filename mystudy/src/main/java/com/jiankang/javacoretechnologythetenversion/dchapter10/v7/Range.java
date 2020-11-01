package com.jiankang.javacoretechnologythetenversion.dchapter10.v7;

/*
 *@create by jiankang
 *@date 2020/7/28 time 10:42
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.PARAMETER})
public @interface Range {
    int min() default 0;
    int max() default 255;
}
