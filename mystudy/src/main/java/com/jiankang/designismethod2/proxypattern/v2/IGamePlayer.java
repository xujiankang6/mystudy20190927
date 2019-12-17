package com.jiankang.designismethod2.proxypattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/13 time 11:53
 *普通代理，它的要求就是客户端只能访问代理角色，而不能访问真实角色
 */
public interface IGamePlayer {
    //登录游戏
    public void login(String user, String password);

    //杀怪，网络游戏的主要特色
    public void killBoss();

    //升级
    public void upgrade();
}