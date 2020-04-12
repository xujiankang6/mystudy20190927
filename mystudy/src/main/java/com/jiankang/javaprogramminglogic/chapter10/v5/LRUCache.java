package com.jiankang.javaprogramminglogic.chapter10.v5;

/*
 *@create by jiankang
 *@date 2020/4/9 time 14:57
 * 简单的LRU缓存实现，思路是最近刚被使用的缓存，最久没被访问的再次被使用的可能性很低，被优先清理
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private int maxEntries;

    public LRUCache(int maxEntries) {
        super(16, 0.75f, true);
        this.maxEntries = maxEntries;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxEntries;
    }
}
