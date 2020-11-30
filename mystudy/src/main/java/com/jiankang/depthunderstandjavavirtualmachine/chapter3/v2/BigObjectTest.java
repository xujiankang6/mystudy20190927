package com.jiankang.depthunderstandjavavirtualmachine.chapter3.v2;

/*
 *@create by jiankang
 *@date 2020/11/28 @time 13:49
 *  大对象直接进入老年代
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8  -XX:PretenureSizeThreshold=3135728
 */


public class BigObjectTest {

    private static final int _1MB = 1024 * 1024;


    public static void main(String[] args) {
        byte[] allocation;

        allocation = new byte[4 * _1MB];  //直接分配在老年代中
    }
}
