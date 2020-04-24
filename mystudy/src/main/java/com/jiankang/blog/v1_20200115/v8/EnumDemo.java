package com.jiankang.blog.v1_20200115.v8;

/*
 *@create by jiankang
 *@date 2020/1/16 time 19:34
 */

import com.sun.prism.image.CachingCompoundImage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

enum Color {
    GREEN, RED, BLUE, BLACK, YELLOW
}


public class EnumDemo {
    public static void main(String[] args) {

        EnumSet<Color> enumSet = EnumSet.noneOf(Color.class);
        System.out.println("添加前："+enumSet.toString());
        enumSet.add(Color.GREEN);
        enumSet.add(Color.RED);
        enumSet.add(Color.BLACK);
        enumSet.add(Color.BLUE);
        enumSet.add(Color.YELLOW);
        System.out.println("添加后："+enumSet.toString());

        System.out.println("--------------------");
        EnumSet<Color> enumSet1 = EnumSet.allOf(Color.class);
        System.out.println("allof 直接填充："+enumSet1);

        //指定范围，反向报错
        System.out.println("---------指定范围，反向报错-----------");
        EnumSet<Color> range = EnumSet.range(Color.RED, Color.YELLOW);
        System.out.println(range);
        //指定补集
        System.out.println("----------指定补集----------");
        EnumSet<Color> enumSet2 = EnumSet.complementOf(range);
        System.out.println(enumSet2);
        System.out.println("-----------初始化直接指定元素------------");
        EnumSet<Color> black = EnumSet.of(Color.BLACK);
        System.out.println(black);
        EnumSet<Color> enumSet3 = EnumSet.copyOf(black);
        System.out.println(enumSet3);


        //增加重复元素
        List<Color> list = new ArrayList<Color>();
        list.add(Color.BLACK);
        list.add(Color.BLACK);//重复元素
        list.add(Color.RED);
        list.add(Color.BLUE);
        System.out.println("list:"+list.toString());
        EnumSet<Color> enumSet4 = EnumSet.copyOf(list);
        System.out.println(enumSet4);

    }
}
