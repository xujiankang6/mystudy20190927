package com.jiankang.improvejava151suggests.chapter4.v1;

/*
 *@create by jiankang
 *@date 2020/10/27 time 14:44
 */

import java.io.UnsupportedEncodingException;

public class Test58 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "汉字";
         byte[] b = str.getBytes("UTF-8");
         byte[] b2 = str.getBytes("GB2312");
        System.out.println(new String(b));
        System.out.println(new String(b2));
    }
}
