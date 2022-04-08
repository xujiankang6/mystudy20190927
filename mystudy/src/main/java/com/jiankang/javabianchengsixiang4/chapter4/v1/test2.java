package com.jiankang.javabianchengsixiang4.chapter4.v1;

/**
 * test2
 *
 * @author jiankang.xu
 * @date 2022/4/9
 */
public class test2 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("---------------------");
        int arr[] = { 1, 2, 4, 6, 7 };
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("---------------------");
        for (;;) {
            System.out.println("无限循环");
        }


    }
}
