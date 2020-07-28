package com.jiankang.javacoretechnologythetenversion.dchapter10.v6;

/*
 *@create by jiankang
 *@date 2020/7/27 time 20:52
 */

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface FruitName {
    String value() default "";
}
