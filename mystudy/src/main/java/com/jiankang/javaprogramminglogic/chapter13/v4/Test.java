package com.jiankang.javaprogramminglogic.chapter13.v4;

/*
 *@create by jiankang
 *@date 2020/3/29 time 16:12
 */

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //这是本地临时文件夹
//        File f = new File(System.getProperty("java.io.tmpdir"));
        //当前目录文件夹
        File f = new File(System.getProperty("user.dir"));
        //返回文件名数组
//        String[] files = f.list(new FilenameFilter() {
        //返回文件对象数组
        File[] files = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".txt")) {
                    return true;
                }
                return false;
            }
        });
        System.out.println(Arrays.toString(files));
    }
}
