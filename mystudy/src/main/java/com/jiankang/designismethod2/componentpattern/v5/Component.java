package com.jiankang.designismethod2.componentpattern.v5;

/*
 *@create by jiankang
 *@date 2019/11/25 time 13:53
 */

import java.util.ArrayList;

public abstract class Component {
    //个体和整体都具有的共享
    public void doSomething() {
        //编写业务逻辑
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract ArrayList<Component> getChildren();

}
