package com.jiankang.javacoretechnologythetenversion.dchapter10.v10;

/*
 *@create by jiankang
 *@date 2020/7/28 time 17:02
 */

public class NoBug {

    @Jiecha
    public void suanShu(){
        System.out.println("22345");
    }

    @Jiecha
    public void jiafa(){
        System.out.println("1+1="+1+1);
    }

    @Jiecha
    public void jiefa(){
        System.out.println("1-1="+(1-1));
    }
    @Jiecha
    public void chengfa(){
        System.out.println("3 x 5="+ 3*5);
    }
    @Jiecha
    public void chufa(){
        System.out.println("6 / 0="+ 6 / 0);
    }

    public void ziwojieshao(){
        System.out.println("我写的程序没有 bug!");
    }
}
