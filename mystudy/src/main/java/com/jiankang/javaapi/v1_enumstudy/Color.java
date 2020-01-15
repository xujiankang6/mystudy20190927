package com.jiankang.javaapi.v1_enumstudy;

/*
 *@create by jiankang
 *@date 2020/1/13 time 19:52
 */

import java.util.HashMap;
import java.util.Map;

enum Color {
    RED, GREEN, BLUE, Color;
    static final Map<String, Color> colorMap = new HashMap<>();

    static {
        for (Color c : Color.values())
            colorMap.put(c.toString(), c);

    }


    public static void main(String[] args) {
        for(Color s: Color.values()){
            System.out.println(s);
        }
    }

}
