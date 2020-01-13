package com.jiankang.designismethod2.accesswarpk.v8;

/*
 *@create by jiankang
 *@date 2020/1/12 time 21:31
 */


public class Client {
    public static void main(String[] args) {
        IStar star = new FilmStar();
        star.act("前十五分钟，明星本人演戏");
        IActor actor = new UnknownActor();

        IStar standin = new Standin(actor);
        standin.act("替身在演戏");
        star.act("后十五分钟，明星本人演戏");

    }
}
