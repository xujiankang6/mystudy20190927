package com.jiankang.designismethod2.behavorpatternpk.v4;

/*
 *@create by jiankang
 *@date 2020/1/6 time 20:12
 */

public class ChildState extends HumanState {
    @Override
    public void work() {
        System.out.println("儿童的工作是玩耍");
        super.human.setState(Human.ADULT_STATE);
    }
}
