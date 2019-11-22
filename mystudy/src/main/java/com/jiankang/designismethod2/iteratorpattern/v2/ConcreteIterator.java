package com.jiankang.designismethod2.iteratorpattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/22 time 11:48
 */

import java.util.Vector;

public class ConcreteIterator implements Iterator {

    private Vector vector = new Vector();

    //定义当前游标
    public int cursor = 0;


    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    //返回下一个元素
    @Override
    public Object next() {
        Object result = null;
        if (this.hasNext()) {
            result = this.vector.get(this.cursor++);
        } else {
            result = null;
        }
        return result;

    }

    //判断是否到达尾部
    @Override
    public boolean hasNext() {
        if (this.cursor == this.vector.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
