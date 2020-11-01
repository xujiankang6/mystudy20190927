package com.jiankang.javacoretechnologythetenversion.dchapter10.v5;

/*
 *@create by jiankang
 *@date 2020/7/27 time 20:21
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String[] value() default "unknown";
}
