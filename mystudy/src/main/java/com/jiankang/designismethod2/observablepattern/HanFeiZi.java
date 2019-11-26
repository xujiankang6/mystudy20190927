package com.jiankang.designismethod2.observablepattern;

/*
 *@create by jiankang
 *@date 2019/11/25 time 19:43
 */

public class HanFeiZi implements IHanFeiZi {

    //声明李斯
    private ILiSi liSi = new LiSi();



    @Override
    public void haveBreakfast() {
        System.out.println("吃饭");
        this.liSi.update("韩非子在吃饭");

    }

    @Override
    public void haveFun() {
        System.out.println("开始娱乐了");
        this.liSi.update("韩非子在娱乐");
    }


}
