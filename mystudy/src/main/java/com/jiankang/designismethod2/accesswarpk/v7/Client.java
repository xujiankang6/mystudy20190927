package com.jiankang.designismethod2.accesswarpk.v7;

/*
 *@create by jiankang
 *@date 2020/1/12 time 21:31
 */

public class Client {
    public static void main(String[] args) {
        IStar freakStar = new FreakStar();
        freakStar = new HotAir(freakStar);
        freakStar = new Deny(freakStar);
        freakStar.act();
    }
}
