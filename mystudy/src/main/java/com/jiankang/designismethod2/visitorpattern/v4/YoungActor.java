package com.jiankang.designismethod2.visitorpattern.v4;

/*
 *@create by jiankang
 *@date 2019/12/9 time 18:19
 */

public class YoungActor extends AbsActor {

    @Override
    public void act(KungFuRole role) {
        System.out.println("最喜欢演奏功夫角色");
    }
}
