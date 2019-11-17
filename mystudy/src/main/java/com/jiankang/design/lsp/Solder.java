package com.jiankang.design.lsp;

/*
 *@create by jiankang
 *@date 2019/10/31 time 17:11
 */

public class Solder {
    private AbstractGun abstractGun;


    public void setGun(AbstractGun abstractGun) {
        this.abstractGun = abstractGun;
    }

    public void killEnemy() {
        System.out.println("士兵开始射击");
        abstractGun.shoot();


    }
}
