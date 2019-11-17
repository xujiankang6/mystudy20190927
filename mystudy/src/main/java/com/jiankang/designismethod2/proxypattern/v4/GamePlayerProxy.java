package com.jiankang.designismethod2.proxypattern.v4;

/*
 *@create by jiankang
 *@date 2019/11/13 time 16:11
 */

import com.jiankang.designismethod2.proxypattern.v3.IGamePlayer;
import com.jiankang.designismethod2.proxypattern.v3.IProxy;

public class GamePlayerProxy implements IGamePlayer, IProxy {

    @Override
    public void login(String user, String password) {

    }

    @Override
    public void killBoss() {

    }

    @Override
    public void upgrade() {

    }

    @Override
    public IGamePlayer getProxy() {
        return null;
    }

    @Override
    public void count() {

    }
}
