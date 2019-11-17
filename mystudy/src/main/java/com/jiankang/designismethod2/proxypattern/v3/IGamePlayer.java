package com.jiankang.designismethod2.proxypattern.v3;


/*
 *@create by jiankang
 *@date 2019/11/13 time 11:53
 *强制代理
 *必须通过真实角色查找到代理角色，否则你不能访
 *问。甭管你是通过代理类还是通过直接new一个主题角色类，都不能访问，只有通过真实角
 *色指定的代理类才可以访问，也就是说由真实角色管理代理角色。
 */
public interface IGamePlayer {
    //登录游戏
    public void login(String user, String password);

    //杀怪，网络游戏的主要特色
    public void killBoss();

    //升级
    public void upgrade();

    //每个人都可以找一下自己的代理
    public IGamePlayer getProxy();
}