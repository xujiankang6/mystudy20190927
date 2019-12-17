package com.jiankang.designismethod2.proxypattern.v3;


/*
 *@create by jiankang
 *@date 2019/11/13 time 11:53
 *强制代理
 *必须通过真实角色查找到代理角色，否则你不能访
 *问。甭管你是通过代理类还是通过直接new一个主题角色类，都不能访问，只有通过真实角
 *色指定的代理类才可以访问，也就是说由真实角色管理代理角色。
 */

public class Client {
    public static void main(String[] args) {
//        IGamePlayer proxyGamePlayer = new ProxyGamePlayer(new GamePlayer("张三"));
        IGamePlayer gamePlayer = new GamePlayer("张三").getProxy();
        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-8-25 10:45");
        gamePlayer.login("zhangSan", "password");
        //开始杀怪
        gamePlayer.killBoss();
        //升级
        gamePlayer.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是：2009-8-26 03:40");

    }

}
