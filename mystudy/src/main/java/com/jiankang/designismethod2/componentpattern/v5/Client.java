package com.jiankang.designismethod2.componentpattern.v5;

/*
 *@create by jiankang
 *@date 2019/11/25 time 16:51
 */

public class Client {
    //通过递归遍历数
    public static void display(Component root) {
        for (Component c : root.getChildren()) {
            if (c instanceof Leaf) {
                c.doSomething();
            } else {
                display(c);
            }
        }
    }
}
