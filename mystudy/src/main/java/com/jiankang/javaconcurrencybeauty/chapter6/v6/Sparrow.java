package com.jiankang.javaconcurrencybeauty.chapter6.v6;

/*
 *@create by jiankang
 *@date 2020/10/29 time 13:34
 */

public class Sparrow extends Bird {
    private Desc.Color color;

    public Sparrow() {
        color = Desc.Color.Grayish;
    }

    public Sparrow(Desc.Color color) {
        this.color = color;
    }

    @Override
    public Desc.Color getColor() {
        return color;
    }
}
