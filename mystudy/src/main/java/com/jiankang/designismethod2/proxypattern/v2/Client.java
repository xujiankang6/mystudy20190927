package com.jiankang.designismethod2.proxypattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/13 time 11:53
 *普通代理，它的要求就是客户端只能访问代理角色，而不能访问真实角色
 */

public class Client {
    public static void main(String[] args) {
        IGamePlayer proxyGamePlayer = new ProxyGamePlayer("张三");
        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-8-25 10:45");
        proxyGamePlayer.login("zhangSan", "password");
        //开始杀怪
        proxyGamePlayer.killBoss();
        //升级
        proxyGamePlayer.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是：2009-8-26 03:40");

    }

}
