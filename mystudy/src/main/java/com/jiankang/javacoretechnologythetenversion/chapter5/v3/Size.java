package com.jiankang.javacoretechnologythetenversion.chapter5.v3;

/*
 *@create by jiankang
 *@date 2020/6/1 time 20:05
 */

public enum Size {
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
    private String s;

    public String getS() {
        return s;
    }

    private  Size(String s) {
        this.s = s;
    }
}
