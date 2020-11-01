package com.jiankang.javacoretechnologythetenversion.chapter5.v6;

/*
 *@create by jiankang
 *@date 2020/6/2 time 21:01
 */

import java.util.ArrayList;

public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            squares.add(i * i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
