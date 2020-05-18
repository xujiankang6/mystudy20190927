package com.jiankang.javaprogramminglogic.chapter6.v1.Test;

/*
 *@create by jiankang
 *@date 2020/4/30 time 16:06
 */

public class Test {

    public static void main(String[] args) {

        int test = Test.test();
        System.out.println(test);


        int test2 = Test.test2();
        System.out.println(test2);
    }

    //finally不改变返回的值，因为走到try里面，会将返回值保存到临时变量中，finally改变ret值，并不改变临时变量值
    public static int test() {
        int ret = 0;
        try {
            return ret;
        } finally {
            ret = 2;
        }
    }


    //try和finally里面都有return，最终会返回finally中的，异常也不会出现
    public static int test2() {
        int ret = 0;
        try {
            int a = 5 / 0;
            return ret;
        } finally {
            return 2;
        }
    }
}
