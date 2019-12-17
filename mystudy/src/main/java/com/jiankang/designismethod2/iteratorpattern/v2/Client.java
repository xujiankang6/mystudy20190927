package com.jiankang.designismethod2.iteratorpattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/22 time 11:59
 */

public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("aa");
        aggregate.add("bb");
        aggregate.add("cc");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
