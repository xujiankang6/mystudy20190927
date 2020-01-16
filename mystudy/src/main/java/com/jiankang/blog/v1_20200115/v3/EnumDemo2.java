package com.jiankang.blog.v1_20200115.v3;

/*
 *@create by jiankang
 *@date 2020/1/16 time 10:51
 */

public enum EnumDemo2 implements food, sport {
    FOOD, SPORT;

    @Override
    public void eat() {
        System.out.println("eat.....");
    }

    @Override
    public void run() {
        System.out.println("run.....");
    }
}
