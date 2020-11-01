package com.jiankang.improvejava151suggests.chapter7.v2;

/*
 *@create by jiankang
 *@date 2020/10/29 time 18:01
 */

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //泛型初始化时不能声明泛型类型，因为类型擦除的原因
//        List<String>[] listArray = new List<String>[];

        List<String> ls = new ArrayList<String>();
        List<Integer> li = new ArrayList<Integer>();
        System.out.println(ls.getClass()==li.getClass());
    }
}
