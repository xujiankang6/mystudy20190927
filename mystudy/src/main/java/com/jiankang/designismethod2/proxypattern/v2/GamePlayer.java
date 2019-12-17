package com.jiankang.designismethod2.proxypattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/13 time 11:53
 *普通代理，它的要求就是客户端只能访问代理角色，而不能访问真实角色
 */

public class GamePlayer implements IGamePlayer {
    private String name = "";

    public GamePlayer(IGamePlayer _gamePlayer,String _name) throws Exception {
        if(_gamePlayer == null){
            throw  new Exception("不能创建真实角色！");
        }else{
            this.name = _name;
        }

    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录名为"+user+"的用户"+this.name+"登录成功！");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " 又升了一级！");
    }
}
