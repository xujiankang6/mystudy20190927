package com.jiankang.datastructure.v1;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSortTest {

    public static void main(String[] args) {
        int[] arr = new int[]{11, 2, 3, 5, 7, 4, 10, 8, 9};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void BubbleSort(int[] arr) {
        //从右边开始循环遍历数组
        for (int i = arr.length - 1; i > 0; i--) {
            //遍历未排序的数组
            for (int j = 0; j < i; j++) {
                //相邻位置左边值大于右边，交换位置，将最大值最后换到待排序列最右边
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
