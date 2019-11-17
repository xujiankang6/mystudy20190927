package com.jiankang.designismethod2.proxypattern.v3;

/*
 *@create by jiankang
 *@date 2019/11/13 time 11:53
 *强制代理
 *必须通过真实角色查找到代理角色，否则你不能访
 *问。甭管你是通过代理类还是通过直接new一个主题角色类，都不能访问，只有通过真实角
 *色指定的代理类才可以访问，也就是说由真实角色管理代理角色。
 */
public class ProxyGamePlayer implements IGamePlayer , IProxy {

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
        this.count();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }

    @Override
    public void count() {
        System.out.println("升级总费用是：150元");
    }
}
