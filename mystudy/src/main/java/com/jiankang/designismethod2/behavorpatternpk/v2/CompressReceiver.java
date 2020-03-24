package com.jiankang.designismethod2.behavorpatternpk.v2;

/*
 *@create by jiankang
 *@date 2020/1/6 time 18:21
 */

public class CompressReceiver implements  IReceiver {
    @Override
    public boolean zipExec(String source, String to) {
        System.out.println("zip 压缩成功");
        return true;

    }

    @Override
    public boolean gzipExec(String source, String to) {
        System.out.println("gzip 压缩成功");
        return true;
    }
}
