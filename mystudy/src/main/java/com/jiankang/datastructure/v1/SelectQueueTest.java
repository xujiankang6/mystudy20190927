package com.jiankang.datastructure.v1;

import java.util.Arrays;

public class SelectQueueTest {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 7, 3, 7, 5, 7, 4, 9, 0, 8, 6,3,3,4,3,4};
        SelectQueue(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void SelectQueue(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min =j;
                }
            }
            if(min!=i){
                int temp = arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }

    }


}
