package com.jiankang.designismethod2.behavorpatternpk.v4;

/*
 *@create by jiankang
 *@date 2020/1/6 time 20:12
 */

public class AdultState extends HumanState {
    @Override
    public void work() {
        System.out.println("adult的工作是玩耍");
        super.human.setState(Human.OLD_STATE);
    }
}
