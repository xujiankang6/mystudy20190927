package com.jiankang.designismethod2.accesswarpk.v8;

/*
 *@create by jiankang
 *@date 2020/1/13 time 9:56
 */

public class FilmStar implements IStar {
    @Override
    public void act(String context) {
        System.out.println("明星演戏：" + context);
    }
}
