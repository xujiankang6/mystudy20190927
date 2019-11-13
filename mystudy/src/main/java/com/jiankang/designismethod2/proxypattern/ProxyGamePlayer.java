package com.jiankang.designismethod2.proxypattern;

/*
 *@create by jiankang
 *@date 2019/11/13 time 11:58
 */

public class ProxyGamePlayer implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

    public ProxyGamePlayer(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
