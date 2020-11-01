package com.jiankang.improvejava151suggests.chapter6.v4.v3;

/*
 *@create by jiankang
 *@date 2020/10/27 time 18:24
 * 枚举抽象方法实现生成产品
 */


enum CarFactory {
    BenCar {
        @Override
        public ICar create() {
            return new BenCar();
        }
    },
    BaoCar {
        @Override
        public ICar create() {
            return new BaoCar();
        }
    };


    //抽象方法实现
    public abstract ICar create();

}


class BenCar implements ICar {

}

class BaoCar implements ICar {

}
