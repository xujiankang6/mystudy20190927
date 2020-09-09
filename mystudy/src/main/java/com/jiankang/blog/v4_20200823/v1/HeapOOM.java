package com.jiankang.blog.v4_20200823.v1;

/*
 *@create by jiankang
 *@date 2020/8/25 time 10:16
 */

import java.util.ArrayList;

/**
 * 给虚拟机参数设置为 -Xms5M -Xmx5M     报错：Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 *
 */
public class HeapOOM {
    static class OOMObject {

    }

    public static void main(String[] args) {
        final ArrayList<UserBean> users = new ArrayList<>();
        while (true) {
            users.add(new UserBean());
        }
    }
}
