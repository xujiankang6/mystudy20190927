package com.jiankang.javacoretechnologythetenversion.chapter7.v1;

/*
 *@create by jiankang
 *@date 2020/6/12 time 16:53
 */

import java.util.Scanner;

public class StackTraceTest {

    public static int factorial(int n){
        System.out.println("factorial("+n+");");
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for (StackTraceElement frame : frames) {
            System.out.println(frame);
        }
        int r;
        if(n<=1) r= 1;
        else r=n*factorial(n-1);
        System.out.println("return : "+r);
        return r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        factorial(n);
    }
}
