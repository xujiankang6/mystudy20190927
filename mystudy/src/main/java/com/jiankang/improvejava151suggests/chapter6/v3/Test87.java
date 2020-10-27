package com.jiankang.improvejava151suggests.chapter6.v3;

/*
 *@create by jiankang
 *@date 2020/10/27 time 17:40
 */

import java.util.Arrays;
import java.util.List;

public class Test87 {
    public static void main(String[] args) {
         List<String> params = Arrays.asList("Spring", "summer");
        for (String name : params) {
            //执行这段代码不存在枚举类会报错，
            // 1、可以用try-catch捕获

            Season s = null;
            try {
                s = Season.valueOf(name);
                System.out.println(s);
            } catch (IllegalArgumentException e) {
                System.out.println("没有相关枚举");
            }

            //2、增加一个contains方法转换之前先判断一下
            if(Season.contains(name)){
                s = Season.valueOf(name);
                System.out.println(s);
            }
        }
    }
}
