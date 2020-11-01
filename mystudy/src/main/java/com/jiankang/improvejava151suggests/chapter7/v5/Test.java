package com.jiankang.improvejava151suggests.chapter7.v5;

/*
 *@create by jiankang
 *@date 2020/11/1 time 15:48
 */

public class Test {
    public static void main(String[] args) {
        Animal rat  = new DecorateAnimal(new DecorateAnimal( new Rat(), FlyFeature.class), DigFeature.class);
        rat.doStuff();
    }
}
