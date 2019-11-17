package com.jiankang.design.lsp.dmt;

/*
 *@create by jiankang
 *@date 2019/11/1 time 20:29
 */

import java.util.Random;

public class Wizard {
    private Random rand = new Random(System.currentTimeMillis());
    //第一步
    private int first(){
        System.out.println("执行第一个方法...");
        return rand.nextInt(100);
    }
    //第二步
    private int second(){
        System.out.println("执行第二个方法...");
        return rand.nextInt(100);
    }
    //第三个方法
    private int third(){
        System.out.println("执行第三个方法...");
        return rand.nextInt(100);
    }
    void installWizard(){
        int first = this.first();
        if (first > 50) {
            int second = this.second();
            if (second > 50) {
                int third = this.third();
                if (third > 50) {
                    this.first();
                }
            }
        }
    }

}