package com.jiankang.datastructure.v1;

import java.util.Arrays;

public class QuickQueueTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 7, 3, 7, 5, 7, 4, 9, 0, 8, 6};
        QuickQueue(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @param arr   待排数组
     * @param start 开始位置下标
     * @param end   结束位置下标
     */
    private static void QuickQueue(int[] arr, int start, int end) {
        //开始位置下标不小于结束位置下标时，说明子序列不可再分，停止执行快排
        if (start < end) {
            //将开始位置的数字作为基准数
            int target = arr[start];
            int left = start;
            int right = end;
            //左边小于右边时，基准数赋值给下标为left的位置
            while (left < right) {
                //从右往左循环遍历数组,找到第一个小于基准数的位置
                while (arr[right] >= target && left < right) {
                    right--;
                }
                //将右边第一个小于基准数的值赋值到左边，
                arr[left] = arr[right];
                //从左边开始遍历，找到大于基准数的第一个位置
                while (arr[left] <= target && left < right) {
                    left++;
                }
                //把该值弄到右边，给right位置
                arr[right] = arr[left];
            }
            //最后将基准树赋值给下标为left的值，
            // 此时，从基准数位置看，大于的在右边，小于基准数的在左边
            arr[left] = target;
            //将基准数左边的进行快排
            QuickQueue(arr, start, left);
            //将基准数右边的进行快排
            QuickQueue(arr, left + 1, end);
        }
    }
}



