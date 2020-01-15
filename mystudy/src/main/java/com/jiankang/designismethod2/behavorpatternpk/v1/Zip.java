package com.jiankang.designismethod2.behavorpatternpk.v1;

/*
 *@create by jiankang
 *@date 2020/1/2 time 20:14
 */

public class Zip implements Algorithm {
    @Override
    public boolean compress(String source, String to) {
        System.out.println("zip 压缩成功");
        return true;
    }

    @Override
    public boolean uncompress(String source, String to) {
        System.out.println("zip 解压缩成功");
        return false;
    }
}
