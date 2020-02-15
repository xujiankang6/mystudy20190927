package com.jiankang.datastructure.v1;

import java.util.Arrays;

/**
 * 希尔排序
 * 根据步长循环计算
 */

public class ShellQueueTest {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 7, 3, 7, 5, 7, 4, 9, 0, 8, 6};
        ShellQueue(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void ShellQueue(int[] arr) {
        for (int d = arr.length / 2; d > 0; d /= 2) {
            for (int i = d; i < arr.length; i += d) {
                for (int j = i - d; j >= 0; j -= d) {
                    if (arr[j] > arr[j + d]) {
                        int temp = arr[j + d];
                        arr[j + d] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
}
