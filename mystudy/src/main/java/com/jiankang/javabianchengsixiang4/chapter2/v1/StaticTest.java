package com.jiankang.javabianchengsixiang4.chapter2.v1;

/**
 * StaticTest
 *
 * @author jiankang.xu
 * @date 2022/4/3
 */
public class StaticTest {
    static int i = 47;

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println(st1.i);
        System.out.println(st2.i);
        StaticTest.i++;   //通过类名点静态变量加1
        System.out.println(st1.i);//发现我们的静态变量都加1变48了
        System.out.println(st2.i);
        st1.i++;  //通过实例名点静态变量加1
        System.out.println(st1.i);//发现我们的静态变量都加1变49了
        System.out.println(st2.i);
    }
}
