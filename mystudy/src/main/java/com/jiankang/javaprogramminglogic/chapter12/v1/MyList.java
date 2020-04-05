package com.jiankang.javaprogramminglogic.chapter12.v1;

/*
 *@create by jiankang
 *@date 2020/4/5 time 17:00
 */

import java.util.AbstractList;
import java.util.Collection;

public class MyList<E> extends AbstractList<E> {
    private DynamicArray<E> darr;

    public MyList() {
        darr = new DynamicArray<>();
    }

    public MyList(Collection<? extends E> c) {
        this();
        addAll(c);
    }

    @Override
    public E get(int index) {
        return darr.get(index);
    }

    @Override
    public int size() {
        return darr.size();
    }

    @Override
    public E set(int index, E element) {
        return darr.set(index, element);
    }

    @Override
    public void add(int index, E e) {
        darr.add(index, e);
    }

    @Override
    public E remove(int index) {
        return darr.remove(index);
    }

}
