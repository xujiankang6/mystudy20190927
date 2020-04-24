package com.jiankang.javaprogramminglogic.chapter2.v2;

/*
 *@create by jiankang
 *@date 2020/4/22 time 14:48
 */

import java.io.UnsupportedEncodingException;

public class RecoverCodeUtils {

    public static void recover(String str) throws UnsupportedEncodingException {
        String[] charsets = new String[]{"windows-1252","GB18030","Big5","UTF-8"};
        for(int i = 0;i<charsets.length;i++){
            for(int j = 0;j<charsets.length;j++){
                if(i!=j){
                    String s = new String(str.getBytes(charsets[i]),charsets[j]);
                    System.out.println("原来编码假设是： "+charsets[j]+" ,被错误解读为："+ charsets[i]);
                    System.out.println(s);
                    System.out.println();
                }
            }
        }
    }
}
