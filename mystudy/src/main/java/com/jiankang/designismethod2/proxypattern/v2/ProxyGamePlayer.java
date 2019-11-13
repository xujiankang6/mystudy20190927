package com.jiankang.designismethod2.proxypattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/13 time 11:53
 *普通代理，它的要求就是客户端只能访问代理角色，而不能访问真实角色
 */
public class ProxyGamePlayer implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

    public ProxyGamePlayer(String name) {
        try{
            gamePlayer = new GamePlayer(this,name);
        }catch (Exception e){
            e.printStackTrace();
        }
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
