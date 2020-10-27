package com.jiankang.improvejava151suggests.chapter6.v1;

/*
 *@create by jiankang
 *@date 2020/10/27 time 16:37
 * 枚举常量，
 * 1、属于稳态型
 * 2、更简单
 * 3、具有内置方法
 * 4、可以自定义方法
 * 5、不可继承
 * 6、常量推荐使用枚举
 */

public enum SeasonEnum {
    Spring, Summer, Autumn, Winter;

    public static SeasonEnum getComfortableSeason(){
        return Spring;
    }
}
