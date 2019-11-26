package com.jiankang.designismethod2.observablepattern.v4;

/*
 *@create by jiankang
 *@date 2019/11/25 time 19:43
 */

import java.util.ArrayList;
import java.util.Observable;


public class HanFeiZi extends Observable implements IHanFeiZi {



    public void haveBreakfast() {
        System.out.println("吃饭");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }


    public void haveFun() {
        System.out.println("开始娱乐了");
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }

}
