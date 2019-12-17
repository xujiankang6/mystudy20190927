package com.jiankang.funcationstudy.listremove;

/*
 *@create by jiankang
 *@date 2019/12/11 time 10:06
 */

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("e1");
        list.add("e2");
        for (String str : list) {
            if ("e1".equals(str)) {
                list.remove("e1");
            }
            if ("e2".equals(str)) {
                System.out.println("element2 feched");
            }
        }
    }
}
