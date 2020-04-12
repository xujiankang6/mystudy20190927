package com.jiankang.javaprogramminglogic.chapter5;

/*
 *@create by jiankang
 *@date 2020/4/12 time 16:12
 */

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Size large = Size.LARGE;
        System.out.println(large.name());
        System.out.println(large.toString());
        System.out.println("large".equalsIgnoreCase(large.name()));
        System.out.println("large" == large.name());
        System.out.println(large.ordinal());
        System.out.println(large.compareTo(Size.MEDIUM));
        //前端传过来一个String 类型的type，走不同的拆分方法，使用枚举时，需要在枚举类里面增加根据参数遍历返回相对应枚举的方法
        switch (Objects.requireNonNull(Type.fromType("csv"))) {
            case CSV:
                System.out.println("csv file split");
                break;
            case XLS:
                System.out.println("xls file split");
                break;
            case XLSX:
                System.out.println("xlsx file split");
                break;
            default:
                System.out.println("can't find it ");
        }
    }
}
