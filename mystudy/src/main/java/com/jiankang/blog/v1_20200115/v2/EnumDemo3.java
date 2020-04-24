package com.jiankang.blog.v1_20200115.v2;

/*
 *@create by jiankang
 *@date 2020/1/16 time 10:11
 */

import com.jiankang.blog.v1_20200115.v1.EnumDemo;

/**
 * 枚举允许我们定义抽象方法，实例中实现
 */
public enum EnumDemo3 {
    FIRST {
        @Override
        public String getInfo() {
            return "FIRST TIME";
        }
    },
    SECOND {
        @Override
        public String getInfo() {
            return "SECOND TIME";
        }
    };

    public abstract String getInfo();


    public static void main(String[] args) {
        System.out.println(EnumDemo3.FIRST.getInfo());
    }



}
