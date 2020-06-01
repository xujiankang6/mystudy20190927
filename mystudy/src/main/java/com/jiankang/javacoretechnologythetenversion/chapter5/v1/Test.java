package com.jiankang.javacoretechnologythetenversion.chapter5.v1;

/*
 *@create by jiankang
 *@date 2020/5/29 time 20:43
 */


import com.jiankang.javacoretechnologythetenversion.chapter4.v2.Employee;

public class Test {
    public static void main(String[] args) {
        String s = "Ok";
        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println(s.hashCode()+"  "+stringBuilder.hashCode());
        String ok = new String("Ok");
        StringBuilder stringBuilder1 = new StringBuilder(ok);
        System.out.println(ok.hashCode()+" "+stringBuilder1.hashCode());

        System.out.println(Employee.class);
    }
}
