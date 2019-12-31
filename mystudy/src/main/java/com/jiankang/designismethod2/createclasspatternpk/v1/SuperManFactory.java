package com.jiankang.designismethod2.createclasspatternpk.v1;

/*
 *@create by jiankang
 *@date 2019/12/31 time 15:38
 */

public class SuperManFactory {


    ISuperMan createSuperMan(String type) {
        if ("adult".equals(type)) {
            return new AdultSuperMan();
        } else if ("child".equals(type)) {
            return new ChildSuperMan();
        } else {
            return null;
        }
    }
}
