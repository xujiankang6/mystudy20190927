package com.jiankang.javaprogramminglogic.chapter12.v1;

/*
 *@create by jiankang
 *@date 2020/4/5 time 16:16
 */

import java.util.Arrays;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        DynamicArray<Integer> d  = new DynamicArray();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        DynamicArrayIterator<Integer> integerDynamicArrayIterator = new DynamicArrayIterator<>(d);

        while (integerDynamicArrayIterator.hasNext()){
            Integer next = integerDynamicArrayIterator.next();
            if(next.equals(2)){
                integerDynamicArrayIterator.remove();
            }
        }
        integerDynamicArrayIterator.remove();

        for (int i = 0; i <d.size() ; i++) {
            System.out.println(d.get(i));
        }


        MyCollection m = new MyCollection();
        m.addAll(Arrays.asList(d));
        Iterator iterator = m.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
