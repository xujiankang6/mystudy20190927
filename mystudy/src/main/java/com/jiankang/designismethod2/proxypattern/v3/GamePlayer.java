package com.jiankang.designismethod2.proxypattern.v3;


/*
 *@create by jiankang
 *@date 2019/11/13 time 11:53
 *强制代理
 *必须通过真实角色查找到代理角色，否则你不能访
 *问。甭管你是通过代理类还是通过直接new一个主题角色类，都不能访问，只有通过真实角
 *色指定的代理类才可以访问，也就是说由真实角色管理代理角色。
 */

public class GamePlayer implements IGamePlayer {
    private String name = "";
    // 我的代理是谁
    private IGamePlayer proxy = null;

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new ProxyGamePlayer(this);
        return this.proxy;
    }


    public GamePlayer(String _name) {
        this.name = _name;
    }

    @Override
    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + "在打怪！");
        } else {
            System.out.println("请使用指定的代理访问");
        }

    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + " 又升了一级！");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }


}
