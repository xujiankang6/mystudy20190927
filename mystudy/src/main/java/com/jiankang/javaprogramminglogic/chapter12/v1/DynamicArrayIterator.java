package com.jiankang.javaprogramminglogic.chapter12.v1;

/*
 *@create by jiankang
 *@date 2020/4/5 time 16:00
 */


import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicArrayIterator<E> implements Iterator<E> {
    DynamicArray<E> darr;
    int cursor;
    int lastRet = -1;

    public DynamicArrayIterator(DynamicArray<E> darr) {
        this.darr = darr;
    }

    @Override
    public boolean hasNext() {
        return cursor != darr.size();
    }

    @Override
    public E next() {
        int i = cursor;
        if(i>darr.size()){
            throw new NoSuchElementException();
        }
        cursor=i+1;
        lastRet=i;
        return darr.get(i);
    }

    @Override
    public void remove() {
        if(lastRet<0)
            throw new IllegalStateException();
        darr.remove(lastRet);
        cursor = lastRet;
        lastRet = -1;
    }
}
