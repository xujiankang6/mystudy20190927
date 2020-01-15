package com.jiankang.designismethod2.accesswarpk.v7;

/*
 *@create by jiankang
 *@date 2020/1/12 time 21:29
 */

public class HotAir extends  Decorator {

    public HotAir(IStar star) {
        super(star);
    }

    @Override
    public void act() {
        System.out.println("演戏之前，夸夸奇谈，没有不能演的角色");
        super.act();
    }
}
