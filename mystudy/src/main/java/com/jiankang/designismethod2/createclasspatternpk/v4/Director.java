package com.jiankang.designismethod2.createclasspatternpk.v4;

/*
 *@create by jiankang
 *@date 2019/12/31 time 17:17
 */

public class Director {

    //声明对建造者的引用
    private CarBuilder benzBuilder = new BenzBuilder();
    private CarBuilder bwmBuilder = new BMWBuilder();

    public ICar createBenzSuv() {
        return createCar(benzBuilder,"benz engine","benz wheel");
    }
    public ICar createBMWVan(){
        return createCar(bwmBuilder,"bwm engine","bwm wheel");
    }
    public ICar createComplexCar(){
        return createCar(bwmBuilder,"bwm engine","benz wheel");
    }

    private ICar createCar(CarBuilder carBuilder, String engine, String wheel) {
        Blueprint blueprint = new Blueprint();
        blueprint.setEngine(engine);
        blueprint.setWheel(wheel);
        carBuilder.setBp(blueprint);
        return carBuilder.buildCar();
    }

}
