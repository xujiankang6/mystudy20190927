package com.jiankang.javaconcurrencybeauty.chapter6.v6;

/*
 *@create by jiankang
 *@date 2020/10/29 time 16:59
 */

public class Test {
    public static void main(String[] args) {
         Bird bird = BirdNest.Sparrow.reproduce();
         Desc.Color color = bird.getColor();
        System.out.println("Bird's color is :"+color);
    }
}
