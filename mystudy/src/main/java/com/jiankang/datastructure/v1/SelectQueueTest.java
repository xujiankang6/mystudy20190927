package com.jiankang.datastructure.v1;

import java.util.Arrays;

public class SelectQueueTest {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 7, 3, 7, 5, 7, 4, 9, 0, 8, 6, 3, 3, 4, 3, 4};
        SelectQueue(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void SelectQueue(int[] arr) {
        //总左边第一个开始，循环遍历每一个值
        for (int i = 0; i < arr.length; i++) {
            //默认序列中最小值的位置是待排序列第一个
            int min = i;
            //找到比默认最小值更小的，更新默认最小值位置
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            //默认最小值位置如果更新了，说明最小值在右边序列中，交换数值
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
