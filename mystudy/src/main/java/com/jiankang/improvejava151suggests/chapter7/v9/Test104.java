package com.jiankang.improvejava151suggests.chapter7.v9;

/*
 *@create by jiankang
 *@date 2020/11/1 time 14:05
 */


import java.lang.reflect.Array;

public class Test104 {

    public static void main(String[] args) {
        try {
            Class.forName("com.jiankang.improvejava151suggests.chapter7.v9.Utils");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            //加载一个long数组，不能生成一个数组对象
            Class.forName("[J");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //动态创建数组
        String[] strs = (String[]) Array.newInstance(String.class, 8);
        int[][] ints = (int[][]) Array.newInstance(int.class, 2, 3);
    }
}
