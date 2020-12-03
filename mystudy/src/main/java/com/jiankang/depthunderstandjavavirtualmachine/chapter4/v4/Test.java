package com.jiankang.depthunderstandjavavirtualmachine.chapter4.v4;

/*
 *@create by jiankang
 *@date 2020/12/2 @time 20:24
 * 内存占位符对象，一个OOMObject大约占64kb
 */


import java.util.ArrayList;
import java.util.List;

public class Test {
    static class OOMObject {
        public byte[] placeholder = new byte[64 * 1024];
    }
    
    public static void fillHeap(int num ) throws InterruptedException{
        List<OOMObject> list = new ArrayList<OOMObject>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(300);
            list.add(new OOMObject());
        }
        System.gc();
    }

    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000);
    }
}


