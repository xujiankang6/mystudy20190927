package com.jiankang.javacoretechnologythetenversion.chapter9.v5;


import java.util.*;

/*
 *@create by jiankang
 *@date 2020/6/21 time 17:04
 */
//求两个集合的交集
public class Testy {
    public static void main(String[] args) {

        List<String> a = new ArrayList<String>();
        a.add("aaa");
        a.add("bbb");
        a.add("ccc");
        List<String> b = new ArrayList<String>();
        b.add("aa");
        b.add("bb");
        b.add("cc");
        //求交集,业务中经常会用到
//        第一步：将其中一个集合放入Set里面
//        第二步：执行retainAll()方法
//        第三步:查看该set集合的个数是否大于1
        Set<String> result = new HashSet<>(a);
        System.out.println(result);
        result.retainAll(b);
        if (result.size()>0){
            System.out.println("集合a和集合b有交集" );
        }
        System.out.println(result);
        String[] array = result.toArray(new String[0]);
        HashSet<String> strings = new HashSet<>(Arrays.asList(array));
        System.out.println(strings);

    }
}
