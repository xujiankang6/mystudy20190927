package com.jiankang.datastructure.v1;

import java.util.Arrays;

public class InsertQueueTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 7, 3, 7, 5, 7, 4, 9, 0, 8, 6, 3, 3, 4, 3, 4};
        InsertQueue(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void InsertQueue(int[] arr) {
        //循环遍历数组
        for (int i = 1; i < arr.length; i++) {
            //从右往左遍历左边已排序序列
            for (int j = i; j > 0; j--) {
                //如果待插入值大于遍历的左边待排序值，结束遍历左边序列
                if (arr[j] > arr[j - 1]) {
                    break;
                } else {
                    //如果待插入值小于遍历的左边待排序值，交换位置，接着循环，
                    // 只到将待插入值放进去左边序列有序
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
