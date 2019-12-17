package com.jiankang.designismethod2.prototypepattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/13 time 21:06
 */

public class PrototypeClass implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
