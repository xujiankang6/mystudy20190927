package com.jiankang.javacoretechnologythetenversion.chapter8.v3;

/*
 *@create by jiankang
 *@date 2020/6/18 time 8:40
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PairTest3 {
    public static void main(String[] args) {
        Manager ceo = new Manager("aa", 80000);
        Manager ceo2 = new Manager("bb", 80000);
        Manager ceo3 = new Manager("cc", 80000);
        Predicate<Manager> oddHashCode = obj -> obj.hashCode() % 2 != 0;
        ArrayList<Manager> managers = new ArrayList<Manager>();
        managers.add(ceo);
        managers.add(ceo2);
        managers.add(ceo3);
         managers.removeIf(oddHashCode);
        System.out.println(Arrays.toString(managers.toArray()));

    }
}
