package com.jiankang.designismethod2.accesswarpk.v9;

/*
 *@create by jiankang
 *@date 2020/1/13 time 14:16
 */

public class Client {
    public static void main(String[] args) {
        AbsStar Z =  new FilmStar();
        Z.doJob();
        Z=new FilmStar(new ActSing());
        Z.doJob();



    }
}
