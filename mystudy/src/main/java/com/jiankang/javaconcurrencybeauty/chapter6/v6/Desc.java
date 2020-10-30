package com.jiankang.javaconcurrencybeauty.chapter6.v6;

/*
 *@create by jiankang
 *@date 2020/10/29 time 13:26
 */

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@interface Desc {
    public enum Color {
        White, Grayish, Yellow;
    }

    Color c() default Color.White;
}
