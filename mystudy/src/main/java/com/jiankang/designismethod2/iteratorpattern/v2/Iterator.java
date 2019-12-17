package com.jiankang.designismethod2.iteratorpattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/22 time 11:46
 */

public interface Iterator {
    //遍历到下一个元素
    public Object next();

    //是否已经遍历到尾部
    public boolean hasNext();

    //删除当前指向的元素
    public boolean remove();
}
