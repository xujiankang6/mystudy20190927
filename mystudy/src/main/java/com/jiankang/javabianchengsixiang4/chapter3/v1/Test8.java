package com.jiankang.javabianchengsixiang4.chapter3.v1;

/**
 * Test4
 *
 * @author jiankang.xu
 * @date 2022/4/6
 */
public class Test8 {
    public static void main(String[] args) {
        if(test1(0) && test2(2) && test3(2))
            System.out.println("expression is true");
        else
            System.out.println("expression is false");
    }


    static   boolean test1(int val) {
            System.out.println("test1(" + val + ")");
            System.out.println("result1: " + (val < 1));
            return val < 1;
        }
    static  boolean test2(int val) {
            System.out.println("test2(" + val + ")");
            System.out.println("result2: " + (val < 2));
            return val < 2;
        }
        static boolean test3(int val) {
            System.out.println("test3(" + val + ")");
            System.out.println("result2: " + (val < 3));
            return val < 3;
        }

}
