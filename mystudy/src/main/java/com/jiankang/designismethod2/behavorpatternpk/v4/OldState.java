package com.jiankang.designismethod2.behavorpatternpk.v4;

/*
 *@create by jiankang
 *@date 2020/1/6 time 20:12
 */

public class OldState extends HumanState {
    @Override
    public void work() {
        System.out.println("old的工作是玩耍");
        super.human.setState(Human.CHILD_STATE);

    }
}
