package com.jiankang.designismethod2.accesswarpk.v8;

/*
 *@create by jiankang
 *@date 2020/1/13 time 9:58
 */

import com.jiankang.designismethod2.proxypattern.v6.IAdvice;

public class UnknownActor implements IActor {
    @Override
    public void playact(String content) {
        System.out.println("普通演员："+content);
    }
}
