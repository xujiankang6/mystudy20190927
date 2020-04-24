package com.jiankang.blog.v1_20200115.v5;

/*
 *@create by jiankang
 *@date 2020/1/16 time 14:27
 */

public class Test {
    public static void main(String[] args) {
        printName(Color.BLUE);
    }

    public static void printName(Color color) {
        switch (color) {
            case RED:
                System.out.println("红色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            case GREAN:
                System.out.println("绿色");
                break;
        }
    }
}
