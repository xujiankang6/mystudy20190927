package com.jiankang.improvejava151suggests.chapter5.v1;

/*
 *@create by jiankang
 *@date 2020/11/10 @time 13:56
 */

import java.util.Arrays;

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/10   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */
public class Test {
    public static void main(String[] args) {
        Integer[] ints = new Integer[50];
        ints = expandCapacity(ints, 80);

    }

    public static <T> T[] expandCapacity(T[] datas, int newLen) {
        newLen = newLen < 0 ? 0 : newLen;
        return Arrays.copyOf(datas, newLen);
    }
}
