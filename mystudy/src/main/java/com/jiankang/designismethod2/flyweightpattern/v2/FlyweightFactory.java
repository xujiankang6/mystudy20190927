package com.jiankang.designismethod2.flyweightpattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/24 time 20:01
 */

import java.util.HashMap;

public class FlyweightFactory {

    //定义一个池容器
    private static HashMap<String,Flyweight> pool = new HashMap<String, Flyweight>();

    //享元工厂
    public static Flyweight getFlyweight(String Extrinsic){
        Flyweight flyweight = null;
        if(pool.containsKey(Extrinsic)){
            flyweight = pool.get(Extrinsic);
        }else {
            flyweight = new ConcreteFlyweight1(Extrinsic);
            pool.put(Extrinsic,flyweight);
        }
        return flyweight;
    }
}
