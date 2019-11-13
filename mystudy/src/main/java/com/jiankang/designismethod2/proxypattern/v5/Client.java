package com.jiankang.designismethod2.proxypattern.v5;

/*
 *@create by jiankang
 *@date 2019/11/13 time 11:55
 */

import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.Proxy;




public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        InvocationHandler handler = new  GamePlayIH(player);
        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-8-25 10:45");
        //获得类的class loader
        ClassLoader c1 = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(c1,new Class[]{IGamePlayer.class}, handler);
        proxy.login("zhangSan", "password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是：2009-8-26 03:40");
    }

}
