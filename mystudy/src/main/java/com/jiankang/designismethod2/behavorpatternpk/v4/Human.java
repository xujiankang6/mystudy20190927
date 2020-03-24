package com.jiankang.designismethod2.behavorpatternpk.v4;

/*
 *@create by jiankang
 *@date 2020/1/6 time 20:09
 */

public  class Human {
    public static final HumanState ADULT_STATE = new AdultState();
    public static final HumanState OLD_STATE = new OldState();
    public static final HumanState CHILD_STATE = new ChildState();
    private HumanState state;

    public void setState(HumanState humanState) {
        this.state = humanState;
        this.state.setHuman(this);
    }

    public  void work(){
        this.state.work();
    }
}
