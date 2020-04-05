package com.jiankang.javaprogramminglogic.chapter12.v2;

/*
 *@create by jiankang
 *@date 2020/4/5 time 21:05
 */


import com.jiankang.javaprogramminglogic.chapter12.v1.DynamicArray;

import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.ListIterator;

public class MySeqList<E> extends AbstractSequentialList<E> {

    private DynamicArray<E> darr;

    public MySeqList() {
        this.darr = new DynamicArray<>();
    }

    public MySeqList(Collection<? extends E> c) {
        this();
        addAll(c);
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return new DynamicArrayListIterator<E>(index, darr);
    }

    @Override
    public int size() {
        return darr.size();
    }
}
