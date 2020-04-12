package com.jiankang.javaprogramminglogic.chapter12.v1;

/*
 *@create by jiankang
 *@date 2020/4/5 time 16:12
 */

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection<E> extends AbstractCollection<E> {
    DynamicArray<E> darr;

    public MyCollection() {
        darr = new DynamicArray<>();
    }

    public MyCollection(Collection<? extends E> c) {
        this();
        addAll(c);
    }


    @Override
    public Iterator<E> iterator() {
        return new DynamicArrayIterator<>(darr);
    }


    @Override
    public int size() {
        return darr.size();
    }

    @Override
    public boolean add(E e) {
        darr.add(e);
        return true;
    }
}
