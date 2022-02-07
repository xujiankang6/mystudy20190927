package com.jiankang.javaprogramminglogic.chapter7.v1;

import java.util.Arrays;

/**
 * Demo3
 *
 * @author jiankang.xu
 * @date 2020/3/22
 */
public class Demo3 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 4, 3};
        System.out.println(ints.hashCode());
        Arrays.fill(ints,3);
        //给数组赋一样的值
        System.out.println(Arrays.toString(ints));
        System.out.println(ints.hashCode());
    }
}
