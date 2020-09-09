package com.jiankang.blog.v4_20200823.v2;

/*
 *@create by jiankang
 *@date 2020/8/25 time 10:51
 */

public class Recursion {
    public int currentValue = 0;

    public void recursionself() {
        currentValue += 1;
        recursionself();
    }
}
