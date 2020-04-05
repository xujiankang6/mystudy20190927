package com.jiankang.javaprogramminglogic.chapter12.v2;

/*
 *@create by jiankang
 *@date 2020/4/5 time 19:08
 */

import com.jiankang.javaprogramminglogic.chapter12.v1.DynamicArray;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public class DynamicArrayListIterator<E> extends DynamicArrayIterator<E> implements ListIterator<E> {

    public DynamicArrayListIterator(int index, DynamicArray<E> darr) {
        super(darr);
        this.cursor = index;
    }

    @Override
    public boolean hasNext() {
        return cursor > 0;
    }


    @Override
    public boolean hasPrevious() {
        return cursor > 0;
    }

    @Override
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        cursor--;
        lastRet = cursor;
        return darr.get(lastRet);
    }

    @Override
    public int nextIndex() {
        return cursor;
    }

    @Override
    public int previousIndex() {
        return cursor - 1;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(E e) {
        if (lastRet == -1) {
            throw new IllegalStateException();
        }
        darr.set(lastRet, e);

    }

    @Override
    public void add(E e) {
        darr.add(cursor, e);
        cursor++;
        lastRet = -1;
    }
}
