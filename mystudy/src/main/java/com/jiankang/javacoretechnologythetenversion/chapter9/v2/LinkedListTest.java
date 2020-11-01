package com.jiankang.javacoretechnologythetenversion.chapter9.v2;

/*
 *@create by jiankang
 *@date 2020/6/21 time 12:53
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        ListIterator<String> alter = a.listIterator();
        Iterator<String> blter = b.iterator();
        while (blter.hasNext()) {
            blter.next();
            if (alter.hasNext()) {
                alter.next();
            }
            alter.add(blter.next());
        }
        System.out.println(a);

        //remove every second word from b
        blter = b.iterator();
        while (blter.hasNext()){
            blter.next();
            if(blter.hasNext()){
                blter.next();
                blter.remove();
            }
        }
        System.out.println(b);
        a.removeAll(b);
        System.out.println(a);


//        a.removeAll(b);
//        System.out.println(a);
    }
}
