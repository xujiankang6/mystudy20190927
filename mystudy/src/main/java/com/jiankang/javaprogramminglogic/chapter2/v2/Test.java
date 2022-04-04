package com.jiankang.javaprogramminglogic.chapter2.v2;

/*
 *@create by jiankang
 *@date 2020/4/22 time 14:35
 */


import java.io.UnsupportedEncodingException;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //查出原来编码是什么类型，被错误解读为什么
        String str = "ÀÏÂí";
        RecoverCodeUtils.recover(str);
        //正常解码：
        String gb18030 = new String(str.getBytes("windows-1252"), "GB18030");
        System.out.println(gb18030);

    }
}
