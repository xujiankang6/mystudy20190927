package com.jiankang.improvejava151suggests.chapter7.v6;

/*
 *@create by jiankang
 *@date 2020/11/1 time 12:21
 * 严格限定泛型类型采用多重界限
 */

public class Test {
    public static void main(String[] args) {
        discount(new Me());

    }

    public static <T extends Staff & Passenger> void discount(T t) {
        if (t.isStanding() & t.getSalary() < 2500) {
            System.out.println("恭喜你，车票打八折！ ");
        }
    }
}
