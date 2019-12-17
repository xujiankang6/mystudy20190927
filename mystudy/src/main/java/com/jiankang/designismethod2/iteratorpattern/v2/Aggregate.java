package com.jiankang.designismethod2.iteratorpattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/22 time 11:55
 */

public interface Aggregate {
    //是容器必然有元素的增加
    public void add(Object object);

    //减少元素
    public void remove(Object object);

    //由迭代器来遍历所有的元素
    public Iterator iterator();

}
