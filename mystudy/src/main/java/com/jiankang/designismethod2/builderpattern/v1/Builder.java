package com.jiankang.designismethod2.builderpattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/11 time 16:14
 */

public abstract class Builder {
    //设置产品的不同部分，以获得不同的产品
    public abstract void setPart();

    //建造产品
    public abstract Product buildProduct();
}
