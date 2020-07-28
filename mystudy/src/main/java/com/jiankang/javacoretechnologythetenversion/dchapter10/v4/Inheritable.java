package com.jiankang.javacoretechnologythetenversion.dchapter10.v4;

/*
 *@create by jiankang
 *@date 2020/7/27 time 19:53
 */

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//加上表示该注解具有继承性
@Inherited
@interface Inheritable {
}
