package com.jiankang.designismethod2.createclasspatternpk.v1;

/*
 *@create by jiankang
 *@date 2019/12/31 time 15:43
 */

public class Client {
    public static void main(String[] args) {
        SuperManFactory factory=new SuperManFactory();
        ISuperMan adult = factory.createSuperMan("adult");
        adult.specialTalent();

    }
}
