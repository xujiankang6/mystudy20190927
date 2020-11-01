package com.jiankang.improvejava151suggests.chapter7.v3;

/*
 *@create by jiankang
 *@date 2020/10/30 time 10:36
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Foo<T> {

    //不再初始化，由构造函数初始化
    private T t;
    private T[] tArray;
    private List<T> list = new ArrayList<T>();

    public Foo(){
        try {
            final Class<?> tType = Class.forName("");
            t= (T) tType.newInstance();
            tArray = (T[]) Array.newInstance(tType,5);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
