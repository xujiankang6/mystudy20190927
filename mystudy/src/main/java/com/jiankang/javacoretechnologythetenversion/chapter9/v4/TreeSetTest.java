package com.jiankang.javacoretechnologythetenversion.chapter9.v4;

/*
 *@create by jiankang
 *@date 2020/6/21 time 13:28
 */

import java.util.*;

public class TreeSetTest {
    public static void main(String[] args) {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4567));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts);
        TreeSet<Item> sortByDescription = new TreeSet<>(Comparator.comparing(Item::getDescription).reversed());
        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
        sortByDescription.removeIf(e -> e.getPartNumber() < 9000);
        System.out.println(sortByDescription);


        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
        String min = Collections.min(list);
        System.out.println(min);
        System.out.println(Collections.max(parts, Comparator.comparing(Item::getPartNumber)));
        Collections.fill(list, null);
        System.out.println(list);
        Collections.replaceAll(list, null, "aaa");
        System.out.println(list);
        list.set(1, "bbb");
        list.set(2, "ccc");
        Collections.rotate(list, 1);
        System.out.println(list);
        //返回与提供值相同的个数
        int aaa = Collections.frequency(list, "aaa");
        System.out.println(aaa);
        boolean disjoint = Collections.disjoint(parts, sortByDescription);
        System.out.println(disjoint);


    }
}
