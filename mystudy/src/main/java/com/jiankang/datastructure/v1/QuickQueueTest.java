package com.jiankang.datastructure.v1;

import java.util.Arrays;

public class QuickQueueTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 7, 3, 7, 5, 7, 4, 9, 0,8,6};
//
        QuickQueue(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void QuickQueue(int[] arr, int start, int end) {
        if (start < end) {
            int target = arr[start];
            int left = start;
            int right = end;
            while (left < right) {
                while (arr[right] >= target && left < right) {
                    right--;
                }
                arr[left] = arr[right];
                while (arr[left] <= target && left < right) {
                    left++;
                }
                arr[right] = arr[left];
            }
            arr[left] = target;
            QuickQueue(arr, start, left);
            QuickQueue(arr, left + 1, end);
        }


    }


}



