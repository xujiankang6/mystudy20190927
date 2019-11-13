package com.jiankang.designismethod2.proxypattern;

/*
 *@create by jiankang
 *@date 2019/11/13 time 11:55
 */

public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        ProxyGamePlayer proxyGamePlayer = new ProxyGamePlayer(player);
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
