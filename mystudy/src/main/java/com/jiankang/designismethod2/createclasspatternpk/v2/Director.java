package com.jiankang.designismethod2.createclasspatternpk.v2;

/*
 *@create by jiankang
 *@date 2019/12/31 time 16:04
 */

public class Director {

    //私有构造，通过静态方法获取对象，不可实例化
    private Director() {
    }

    private static Builder adultBuilder = new AdultSuperManBuilder();

    public static SuperMan getAdultBuilder() {
        return adultBuilder.getSuperMan();
    }
}
