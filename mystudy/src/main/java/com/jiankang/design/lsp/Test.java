package com.jiankang.design.lsp;

/*
 *@create by jiankang
 *@date 2019/10/31 time 17:13
 */

public class Test {

    public static void main(String[] args) {
        Solder solder=new Solder();
        solder.setGun(new ToyGun());
        solder.killEnemy();
    }
}
