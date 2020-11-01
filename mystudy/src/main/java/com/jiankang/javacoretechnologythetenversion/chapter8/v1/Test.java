package com.jiankang.javacoretechnologythetenversion.chapter8.v1;

/*
 *@create by jiankang
 *@date 2020/6/16 time 11:09
 */

import com.jiankang.javacoretechnologythetenversion.chapter4.v2.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        String[] strings = {"mary", "had", "a", "little", "lamb"};
        Pair<String> minmax = ArrayAlg.minmax(strings);
        System.out.println(minmax.getFirst());
        System.out.println(minmax.getSecond());
        String middle = ArrayAlg.getMiddle(strings);
        System.out.println(middle);

        Pair<String> stringPair = new Pair<>();
        Pair<Employee> e = new Pair<>();
        if (stringPair.getClass() == e.getClass()) {
            System.out.println(true);
        }

        //不能创建参数化类型的数组,结果是不安全
        // Pair<String>[] table = new Pair<String>[10];
        Pair<String>[] pairs = (Pair<String>[]) new Pair<?>[10];
        //如果需要收集参数化类型对象,使用集合，数组是不可以的
        ArrayList<Pair<String>> pairs1 = new ArrayList<>();


        Collection<Pair<String>> table = new ArrayList<>() ;

        Pair<String> pair1 = new Pair("sa","a");
        Pair<String> pair2 = new Pair("sa","a1");
        ArrayAlg.addAll(table,pair1,pair2);
        System.out.println(Arrays.toString(new Collection[]{table}));

        //实例化类型变量，1、函数式接口   2、反射调用
        Pair p = Pair.makePair(String::new);
        Pair p2 = Pair.makePair2(String.class);
        System.out.println(p==p2);

        //不报错，但是会报错cannot be cast to [Ljava.lang.Comparable
        String[] aaa = ArrayAlg.minmax("Tom", "Dick", "Harry");
//        System.out.println(aaa[0].compareTo(aaa[1]));



    }
}
