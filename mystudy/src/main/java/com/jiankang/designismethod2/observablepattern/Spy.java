package com.jiankang.designismethod2.observablepattern;

/*
 *@create by jiankang
 *@date 2019/11/25 time 19:51
 */

public class Spy extends Thread {
    private HanFeiZi hanFeiZi;
    private LiSi liSi;
    private String type;

    public Spy(HanFeiZi hanFeiZi, LiSi liSi, String type) {
        this.hanFeiZi = hanFeiZi;
        this.liSi = liSi;
        this.type = type;
    }

}
