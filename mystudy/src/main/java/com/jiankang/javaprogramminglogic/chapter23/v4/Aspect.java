package com.jiankang.javaprogramminglogic.chapter23.v4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 *@create by jiankang
 *@date 2020/5/21 time 17:05
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Aspect {

    Class<?>[] value();
}
