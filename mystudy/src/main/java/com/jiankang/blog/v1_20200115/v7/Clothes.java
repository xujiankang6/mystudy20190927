package com.jiankang.blog.v1_20200115.v7;

/*
 *@create by jiankang
 *@date 2020/1/16 time 16:21
 */

public class Clothes {
    private String key;
    private EnumDemo7.Color color;

    public Clothes(String key, EnumDemo7.Color color) {
        this.key = key;
        this.color = color;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public EnumDemo7.Color getColor() {
        return color;
    }

    public void setColor(EnumDemo7.Color color) {
        this.color = color;
    }
}
