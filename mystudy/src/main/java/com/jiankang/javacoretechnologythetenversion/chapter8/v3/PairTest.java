package com.jiankang.javacoretechnologythetenversion.chapter8.v3;

/*
 *@create by jiankang
 *@date 2020/6/19 time 14:23
 */

import com.jiankang.javacoretechnologythetenversion.chapter8.v1.Pair;

public class PairTest {
    public static void main(String[] args) {
        Manager ceo = new Manager("aa", 80000);
        Manager ceo2 = new Manager("bb", 80000);
        Pair<Manager> pairs = new Pair<>(ceo, ceo2);
        printBuddies(pairs);
        ceo.setBonus(11);
        ceo2.setBonus(2);
        Manager[] managers = {ceo, ceo2};
        Pair<Employee> result = new Pair<>();
        minmaxBonus(managers, result);
        System.out.println("first: " + result.getFirst().getName() + " second: " + result.getSecond().getName());
        maxminBonus(managers,result);
        System.out.println("first: " + result.getFirst().getName() + " second: " + result.getSecond().getName());


    }

    public static void maxminBonus(Manager[] a,Pair<? super Manager> result){
        minmaxBonus(a,result);
        PairAlg.swap(result);  //必须使用通配符方法，因为result是通配符对象，不确定类型
    }

    public static void minmaxBonus(Manager[] a, Pair<? super Manager> result) {
        if (a.length == 0) return;
        Manager min = a[0];
        Manager max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min.getBonus() > a[i].getBonus()) min = a[i];
            if (max.getBonus() < a[i].getBonus()) max = a[i];
        }
        result.setFirst(min);
        result.setSecond(max);
    }


    public static void printBuddies(Pair<? extends Employee> p) {
        Employee first = p.getFirst();
        Employee second = p.getSecond();
        System.out.println(first.getName() + " and " + second.getName() + " are buddies");
    }
}
