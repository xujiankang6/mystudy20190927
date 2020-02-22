package com.jiankang.datastructure.v3;

/**
 * 汉诺塔问题
 */
public class HanNuoTa {
    public static void main(String[] args) {
        //n个圆盘
        executeHan(7, "A", "B", "C");
    }

    public static void executeHan(int n, String A, String B, String C) {
        if (n == 1) {
            System.out.println(A + "--->" + C);
        } else {
            executeHan(n - 1, A, C, B);
            executeHan(1, A, B, C);
            executeHan(n - 1, B, A, C);
        }
    }
}
