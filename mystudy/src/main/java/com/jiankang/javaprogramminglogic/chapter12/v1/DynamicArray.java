package com.jiankang.javaprogramminglogic.chapter12.v1;

/*
 *@create by jiankang
 *@date 2020/3/24 time 16:03
 */

import java.util.Arrays;

public class DynamicArray<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private Object[] elementData;

    public DynamicArray() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = elementData.length;
        if (oldCapacity >= minCapacity) {
            return;
        }
        int newCapacity = oldCapacity * 2;
        if (newCapacity < minCapacity) {
            newCapacity = minCapacity;
        }
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public void add(E e) {
        ensureCapacity(size + 1);
        elementData[size++] = e;
    }

    public void addAll(DynamicArray<? extends E> c) {
        for (int i = 0; i < c.size; i++) {
            add(c.get(i));
        }
    }

    public static int indexOf(DynamicArray<?> arr, Object elm) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(elm)) {
                return i;
            }
        }
        return -1;
    }

    public E get(int index) {
        return (E) elementData[index];
    }

    public int size() {
        return size;
    }

    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }


    private static <T> void swapInternal(DynamicArray<T> arr, int i, int j) {
        T tmp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, tmp);
    }

    //公共的api是通配符，内部调用带类型的方法，避免编译错误
    public static void swap(DynamicArray<?> arr, int i, int j) {
        swapInternal(arr, i, j);
    }

    //通配符有依赖关系
    public static <D> void copy(DynamicArray<D> dest, DynamicArray<? extends D> src) {
        for (int i = 0; i < src.size(); i++) {
            dest.add(src.get(i));
        }
    }

    public static <T extends Comparable<? super T>> T max(DynamicArray<T> arr) {
        T max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).compareTo(max) > 0) {
                max = arr.get(i);
            }
        }
        return max;
    }

    //超类型通配符
    public void copyTo(DynamicArray<? super E> dest) {
        for (int i = 0; i < size(); i++) {
            dest.add(get(i));
        }
    }


    public E remove(int index) {
        E oldValue = get(index);
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null;
        return oldValue;
    }

    public void add(int index, E element) {
        ensureCapacity(size + 1);
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
    }


}
