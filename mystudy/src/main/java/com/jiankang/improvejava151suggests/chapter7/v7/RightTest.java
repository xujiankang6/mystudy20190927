package com.jiankang.improvejava151suggests.chapter7.v7;

/*
 *@create by jiankang
 *@date 2020/11/1 time 13:00
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class RightTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "N");
        String[] strings = toArray(list, String.class);

    }

    //数组的泛型类型必须是真实类型
    public static <T> T[] toArray(List<T> list, Class<T> tClass) {
        T[] t = (T[]) Array.newInstance(tClass, list.size());
        for (int i = 0; i < list.size(); i++) {
            t[i] = list.get(i);
        }
        return t;
    }

}

