package com.jiankang.improvejava151suggests.chapter6.v4.v2;

/*
 *@create by jiankang
 *@date 2020/10/27 time 18:24
 * 枚举非静态方法实现工厂方法模式
 */


 enum CarFactory {
    BenCar, BaoCar;

    public ICar create() {
        switch (this) {
            case BaoCar:
                return new BaoCar();
            case BenCar:
                return new BenCar();
            default:
                throw new AssertionError("无效的参数");
        }
    }
}


class BenCar implements ICar {

}

class BaoCar implements ICar {

}
