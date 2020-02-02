package com.jiankang.datastructure.v1;

import java.util.Arrays;

public class InsertQueueTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 7, 3, 7, 5, 7, 4, 9, 0, 8, 6,3,3,4,3,4};
        InsertQueue(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void InsertQueue(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    break;
                } else {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

        }
    }
}
