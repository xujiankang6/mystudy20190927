package com.jiankang.publicwecat;

/*
 *@create by jiankang
 *@date 2019/10/14 time 9:56
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class ListTest {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(1);
        a.add(2);
        ArrayList clone = (ArrayList) a.clone();
        System.out.println(clone.size());
        for (int i = 0; i < clone.size(); i++) {
            System.out.println(clone.get(i));
        }
        Object[] array = clone.toArray();
        System.out.println(array);
    }
}
