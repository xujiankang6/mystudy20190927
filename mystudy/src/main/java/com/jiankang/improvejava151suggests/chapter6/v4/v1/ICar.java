package com.jiankang.improvejava151suggests.chapter6.v4.v1;

/*
 *@create by jiankang
 *@date 2020/10/27 time 18:10
 * 原始的工厂方法模式
 */


public interface ICar {
}

class BenCar implements ICar {

}

class BaoCar implements ICar {

}

class CarFactory {

    //生产汽车
    public static ICar createCar(Class<? extends ICar> c) {
        try {
            return (ICar) c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}