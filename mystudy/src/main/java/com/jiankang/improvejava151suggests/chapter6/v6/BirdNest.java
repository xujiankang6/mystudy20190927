package com.jiankang.improvejava151suggests.chapter6.v6;

/*
 *@create by jiankang
 *@date 2020/10/29 time 16:54
 */

enum BirdNest {
    Sparrow;

    public Bird reproduce() {
        Desc bd = Sparrow.getClass().getAnnotation(Desc.class);
        return bd == null ? new Sparrow() : new Sparrow(bd.c());
    }
}
