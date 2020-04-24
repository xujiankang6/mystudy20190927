package com.jiankang.javaprogramminglogic.chapter10.v5;

/*
 *@create by jiankang
 *@date 2020/4/9 time 15:14
 */

public class HuanCunTest {
    public static void main(String[] args) {
        //缓存三个，最久未被访问的是b，从上往下数，剩下最后三个{c=1, a=1, d=1}
        LRUCache<String, Object> cache = new LRUCache<>(3);
        cache.put("a", 1);
        cache.put("b", 1);
        cache.put("c", 1);
        cache.get("a");
        cache.put("d", 1);
        System.out.println(cache);
    }
}
