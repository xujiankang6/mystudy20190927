package com.jiankang.javaprogramminglogic.chapter9.v2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 *@create by jiankang
 *@date 2020/4/4 time 21:16
 */
//需要注意以下两点 对Iterator的remove()方法调用必须在Iterator的next()方法之后。 调用next()方法后只能执行一次remove()方法
public class Test3 {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(list.size());
    }
}
