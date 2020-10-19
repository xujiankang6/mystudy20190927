package com.jiankang.javaconcurrencybeauty.chapter2.v3;

/*
 *@create by jiankang
 *@date 2020/10/19 time 17:41
 * 第一个要比第二个快，因为前者是顺序写入的，写入时会一下子读取若干个元素到内存，第二个时跳跃式访问元素。
 */

public class TestForContent {
    static final int LINE_NUM = 4096;
    static final int COLUM_NUM = 4096;

    public static void main(String[] args) {
        long[][] array = new long[LINE_NUM][COLUM_NUM];
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < LINE_NUM; i++) {
            for (int j = 0; j < COLUM_NUM; j++) {
                array[i][j] = i * 2 + j;
            }
        }
        long endTime = System.currentTimeMillis();

        long cacheTime = endTime- startTime;
        System.out.println("cache time : "+cacheTime);



        long[][] array1 = new long[LINE_NUM][COLUM_NUM];
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < LINE_NUM; i++) {
            for (int j = 0; j < COLUM_NUM; j++) {
                array1[j][i] = i * 2 + j;
            }
        }
        long endTime1 = System.currentTimeMillis();

        long cacheTime1 = endTime1- startTime1;
        System.out.println("cache1 time : "+cacheTime1);
    }
}
