package com.jiankang.otherstudy.listremove;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        list.add("沉默王二");
        list.add("一个文章真特么有趣的程序员");

        for (String str : list) {
            if ("沉默王二".equals(str)) {
                list.remove(str);
            }
        }

        System.out.println(list);


        List<String> userNames = new ArrayList<String>() {{
            add("Hollis");
            add("hollis");
            add("HollisChuang");
            add("H");
        }};

        for (String userName : userNames) {
            if ("Hollis".equals(userName)) {
                userNames.remove(userName);
            }
        }

        System.out.println(userNames);
    }
}
