package com.jiankang.funcationstudy.listremove;

/*
 *@create by jiankang
 *@date 2019/12/11 time 10:10
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("e1");
        list.add("e2");
        Iterator var2 = list.iterator();

        while(var2.hasNext()) {
            String str = (String)var2.next();
            if("e1".equals(str)) {
                var2.remove();
            }

            if("e2".equals(str)) {
                System.out.println("element 2 fetched");
            }
        }
    }
}
