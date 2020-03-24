package com.jiankang.designismethod2.behavorpatternpk.v1;

/*
 *@create by jiankang
 *@date 2020/1/2 time 20:16
 */

public class Gzip implements Algorithm {
    @Override
    public boolean compress(String source, String to) {
        System.out.println("gzip 解压缩成功");
        return true;
    }

    @Override
    public boolean uncompress(String source, String to) {
        System.out.println("gzip 解压缩成功");
        return false;
    }
}
