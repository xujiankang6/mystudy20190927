package com.jiankang.javacoretechnologythetenversion.chapter5.v3;

/*
 *@create by jiankang
 *@date 2020/6/1 time 20:10
 */

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size ="+size);
        System.out.println("s="+size.getS());
        System.out.println(size.ordinal());
        if(size==size.EXTRA_LARGE){
            System.out.println("good job");
        }
    }
}
