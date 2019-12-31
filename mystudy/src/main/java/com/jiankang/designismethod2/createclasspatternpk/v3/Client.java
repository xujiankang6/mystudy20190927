package com.jiankang.designismethod2.createclasspatternpk.v3;

/*
 *@create by jiankang
 *@date 2019/12/31 time 17:00
 */

public class Client {
    public static void main(String[] args) {
        CarFactory carFactory = new BenzFactory();
        ICar suv = carFactory.createSuv();
        CarFactory baoma = new BMWFactory();
        ICar suv1 = baoma.createSuv();
        System.out.println(suv.getBand()+suv.getModel());
        System.out.println(suv1.getBand()+suv1.getModel());
    }
}
