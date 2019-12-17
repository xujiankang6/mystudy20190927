package com.jiankang.designismethod2.statuspattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/11 time 11:39
 */

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new CloseingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }

}
