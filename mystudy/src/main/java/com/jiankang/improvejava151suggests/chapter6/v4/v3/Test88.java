package com.jiankang.improvejava151suggests.chapter6.v4.v3;

/*
 *@create by jiankang
 *@date 2020/10/27 time 18:30
 */


public class Test88 {
    public static void main(String[] args) {
        //枚举生产汽车
        ICar benCar = (ICar) CarFactory.BenCar.create();
        ICar baoCar = (ICar) CarFactory.BaoCar.create();
    }
}
