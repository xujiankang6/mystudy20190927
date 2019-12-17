package com.jiankang.designismethod2.prototypepattern.v3;

/*
 *@create by jiankang
 *@date 2019/11/13 time 21:10
 * 要使用clone方法，类的成员变量上不要增加final关键字。final类型是不能重新赋值的
 */

import java.util.ArrayList;

public class Thing implements Cloneable {
    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<String>();

    public Thing() {
        System.out.println("构造函数被执行了。。。");
    }

    @Override
    protected Thing clone() {
        Thing thing = null;
        try {
            //浅拷贝
            thing = (Thing) super.clone();
            //深拷贝加下这一行，将私有的类变量也拷贝
            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    //设置HashMap的值
    public void setValue(String value) {
        this.arrayList.add(value);
    }

    //取得arrayList的值
    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}
