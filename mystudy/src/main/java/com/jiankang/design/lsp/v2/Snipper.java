package com.jiankang.design.lsp.v2;

/*
 *@create by jiankang
 *@date 2019/10/31 time 18:01
 */

public class Snipper {
    public void killEnemy(AUG aug) {
//首先看看敌人的情况，别杀死敌人，自己也被人干掉
        aug.zoomOut();
//开始射击
        aug.shoot();
    }
}
