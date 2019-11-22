package com.jiankang.designismethod2.iteratorpattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/22 time 11:57
 */

import java.util.Vector;

public class ConcreteAggregate implements Aggregate {

    private Vector vector = new Vector();

    @Override
    public void add(Object object) {
        this.vector.add(object);
    }

    @Override
    public void remove(Object object) {
        this.remove(object);

    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
