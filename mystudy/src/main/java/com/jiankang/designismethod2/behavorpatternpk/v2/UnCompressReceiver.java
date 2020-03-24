package com.jiankang.designismethod2.behavorpatternpk.v2;

/*
 *@create by jiankang
 *@date 2020/1/6 time 18:21
 */

public class UnCompressReceiver implements  IReceiver {
    @Override
    public boolean zipExec(String source, String to) {
        System.out.println("zip 解压缩成功");
        return true;

    }

    @Override
    public boolean gzipExec(String source, String to) {
        System.out.println("gzip 解压缩成功");
        return true;
    }
}
