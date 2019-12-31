package com.jiankang.effectivejavasecondedition.chapter2.v3;

/*
 *@create by jiankang
 *@date 2019/12/31 time 10:10
 */

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        int count = 10000000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            Person person = new Person(new Date());
            person.isBabyBoomer();
        }
        long end = System.currentTimeMillis();
        System.out.println("Person执行10000000次所需时间： " + (end - start));


        long newstart = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            NewPerson person = new NewPerson(new Date());
            person.isBabyBoomer();
        }
        long newend = System.currentTimeMillis();
        System.out.println("NewPerson执行10000000次所需时间： " + (newend - newstart));
    }
}
