package com.jiankang.javaprogramminglogic.chapter26.v1;

/*
 *@create by jiankang
 *@date 2020/5/24 time 13:17
 */

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        FileFilter filter = pathname -> pathname.getName().endsWith(".txt");
        FilenameFilter filenameFilter = (dir,name)->name.endsWith(".txt");
        Comparator<File> comparator = (f1,f2)->f1.getName().compareTo(f2.getName());
        Runnable task = ()-> System.out.println("hello world");

    }
}
