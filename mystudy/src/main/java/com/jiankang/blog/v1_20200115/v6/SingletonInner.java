package com.jiankang.blog.v1_20200115.v6;

/*
 *@create by jiankang
 *@date 2020/1/16 time 14:52
 */

import java.io.Serializable;

/**
 * 静态内部类
 */
public class SingletonInner implements Serializable {

    private static volatile boolean flag = true;

    private static class Holder {
        private static SingletonInner singleton = new SingletonInner();
    }

    //防止反射强行调用私有构造器
    private SingletonInner() {
        if (flag) {
            flag = false;
        } else {
            throw new RuntimeException("the instance already exists !");
        }
    }

    public static SingletonInner getSingleton() {
        return Holder.singleton;
    }

    //反序列化时直接返回当前INSTANCE。
    private Object readResolve() {
        return SingletonInner.getSingleton();
    }
}
