package com.jiankang.javaprogramminglogic.chapter8.v3;

/*
 *@create by jiankang
 *@date 2020/4/4 time 15:55
 */

import java.util.Date;

//泛型对象的getClass方法的返回值与原始对象是相同的
public class Test {
    public static void main(String[] args) {
        Pair<String> stringPair = new Pair<>("a", "b");
        Pair<Integer> p1 = new Pair<>(1, 2);
        System.out.println(Pair.class == p1.getClass());
        System.out.println(Pair.class == stringPair.getClass());

        Date date = create(Date.class);
        StringBuilder stringBuilder = create(StringBuilder.class);

    }

    //根据类型创建对象
    public static <T> T create(Class<T> type) {
        try {
            return type.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
