package com.jiankang.improvejava151suggests.chapter10.v2;

/*
 *@create by jiankang
 *@date 2020/11/7 time 14:33
 */

import com.google.common.base.Splitter;
import com.google.common.primitives.Ints;

import java.util.ArrayList;

public class Client3 {
    public static void main(String[] args) {
        String str = "你好，Guava";
        for (String s : Splitter.on("，").split(str)) {
            System.out.println(s);
        }

        for (String s : Splitter.fixedLength(2).split(str)) {
            System.out.println(s);
        }

        int[] ints = {1, 2, 3, 4, 5};
        System.out.println(Ints.max(ints));
        ArrayList<Integer> integers = new ArrayList<>();
         int[] ints1 = Ints.toArray(integers);
        System.out.println(ints);

    }
}
