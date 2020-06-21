package com.jiankang.javacoretechnologythetenversion.chapter9.v2;

/*
 *@create by jiankang
 *@date 2020/6/20 time 15:32
 */

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        SortedSet<String> sorter = new TreeSet();
        sorter.add("Bob");
        sorter.add("Aob");
        sorter.add("Cob");
        for (String o : sorter) {
            System.out.println(o);
        }

        List<String> staff = new LinkedList<>();
        staff.add("Amy");
        staff.add("Bob");
        staff.add("Carl");
        ListIterator<String> iter = staff.listIterator();
        iter.next();
        iter.add("Juliet");

        System.out.println(staff.toString());

        ListIterator<String> iter2 = staff.listIterator();
        String next = iter2.next();
        iter2.set("aa");
        System.out.println(staff.toString());

        //当对链表进行删除，不能另一个视图进行遍历
        iter.next();
        iter.remove();
        iter2.next();

    }
}
