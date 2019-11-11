package com.jiankang.designismethod2.factorymethod.v5;

/*
 *@create by jiankang
 *@date 2019/11/2 time 21:12
 */

public class NvWa2 {

    public static void main(String[] args) {
        BigFactory bigFactory = new ConcreteBigFactory();
        BlackHumanFactory humanFactory = bigFactory.createHumanFactory(BlackHumanFactory.class);
        Human human = humanFactory.createHuman();
        human.getColor();
        human.talk();

    }
}
