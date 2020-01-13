package com.jiankang.designismethod2.accesswarpk.v6;

/*
 *@create by jiankang
 *@date 2020/1/12 time 21:24
 */

public class Agent implements IStar {

    private  IStar star;

    public Agent(IStar star) {
        this.star = star;
    }

    @Override
    public void sign() {
        star.sign();
    }
}
