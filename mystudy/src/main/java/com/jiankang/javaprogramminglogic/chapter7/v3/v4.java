package com.jiankang.javaprogramminglogic.chapter7.v3;

import java.util.Random;

/**
 * v4
 *
 * @author jiankang.xu
 * @date 2020/3/22
 *
 * Random是线程安全的，但是并发量很高时，会产生竞争
 */
public class v4 {
    public static void main(String[] args) {
        Random random = new Random(201608241);
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(100)+"  ");

        }
    }
}
