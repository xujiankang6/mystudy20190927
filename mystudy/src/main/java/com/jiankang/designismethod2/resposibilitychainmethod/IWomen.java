package com.jiankang.designismethod2.resposibilitychainmethod;

/*
 *@create by jiankang
 *@date 2019/11/20 time 9:46
 */

public interface IWomen {
    //获得个人状况
    public int getType();

    //获得个人请示，你要干什么？出去逛街？约会?还是看电影？
    public String getRequest();

}
