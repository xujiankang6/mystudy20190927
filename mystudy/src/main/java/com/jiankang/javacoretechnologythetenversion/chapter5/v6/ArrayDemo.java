package com.jiankang.javacoretechnologythetenversion.chapter5.v6;

/*
 *@create by jiankang
 *@date 2020/6/4 time 20:05
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] ints = {1, 3, 32, 22};
        ints = (int[]) goodCopyOf(ints, 10);
        System.out.println(Arrays.toString(ints));

        String[] b = {"a", "b", "c"};
        b = (String[]) goodCopyOf(b, 10);
        System.out.println(Arrays.toString(b));

        System.out.println("The following call will generate an exception. ");



    }

    public static Object goodCopyOf(Object a, int newlength) {
        Class cl = a.getClass();
        if (!cl.isArray()) return null;
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newlength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newlength));
        return newArray;
    }


    public static Object[] badCopyOf(Object[] a, int newlength) {
        Object[] newArray = new Object[newlength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newlength));
        return newArray;

    }

}
