package com.jiankang.javaprogramminglogic.chapter7.v1;

import java.util.Arrays;

/**
 * Demo2
 *
 * @author jiankang.xu
 * @date 2020/3/22
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] arr =new int[]{1,2,3,4};
        //数组插入
        System.arraycopy(arr,1,arr,0,3);
        System.out.println(Arrays.toString(arr));


    }
}
