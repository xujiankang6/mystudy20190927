package com.jiankang.javaprogramminglogic.chapter8.v2;

import java.io.Serializable;

/*
 *@create by jiankang
 *@date 2020/4/3 time 14:12
 * 超类型通配符另一个场合，比较
 */
public class Base implements Comparable<Base>, Serializable {
    private int sortOrder;

    public Base(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public int compareTo(Base o) {
        if (sortOrder < o.sortOrder) {
            return -1;
        } else if (sortOrder > o.sortOrder) {
            return 1;
        }
        return 0;
    }
}
