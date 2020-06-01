package com.jiankang.javaprogramminglogic.chapter22.v4;

/*
 *@create by jiankang
 *@date 2020/5/19 time 16:49
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface SimpleInject {

}
