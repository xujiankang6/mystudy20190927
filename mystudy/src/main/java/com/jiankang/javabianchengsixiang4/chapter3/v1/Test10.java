package com.jiankang.javabianchengsixiang4.chapter3.v1;

import java.sql.SQLOutput;

/**
 * Test9
 *
 * @author jiankang.xu
 * @date 2022/4/8
 */
public class Test10 {
    public static void main(String[] args) {
        int a = 10;
        if (a % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }

        String type=a%2==0?"偶数":"奇数" ;
        System.out.println(type);
    }
}
