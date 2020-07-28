package com.jiankang.javacoretechnologythetenversion.dchapter10.v8;

/*
 *@create by jiankang
 *@date 2020/7/28 time 11:41
 */

import java.lang.annotation.Repeatable;

@Repeatable(Persons.class)
public @interface Person {

    String role() default "";
}
