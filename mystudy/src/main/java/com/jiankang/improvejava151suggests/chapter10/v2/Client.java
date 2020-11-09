package com.jiankang.improvejava151suggests.chapter10.v2;

/*
 *@create by jiankang
 *@date 2020/11/7 time 14:17
 */

import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Client {
    public static void main(String[] args) {
        HashMap<String, Integer> user = new HashMap<>();
        user.put("张三", 20);
        user.put("李四", 22);
        user.put("王五", 25);
        Map<String, Integer> filtedMap = Maps.filterValues(user, new Predicate<Integer>() {
            @Override
            public boolean apply(Integer age) {
                return age > 20;
            }
        });

        filtedMap.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s + ":" + integer);
            }
        });

        filtedMap.forEach((key,value)-> System.out.println(key.toUpperCase()+ value));

        //字符串操作
         Joiner joiner = Joiner.on(",");
         String str = joiner.skipNulls().join("嘿", "Guava很不错。");
        System.out.println(str);
        Map<String,String> map = new HashMap<String, String>();
        map.put("张三","普通员工");
        map.put("李四","领导");
        System.out.println(Joiner.on("\r\n").withKeyValueSeparator(" 是 ").join(map));



    }
}
