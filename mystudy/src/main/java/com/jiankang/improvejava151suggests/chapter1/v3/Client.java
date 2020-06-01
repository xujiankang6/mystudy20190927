package com.jiankang.improvejava151suggests.chapter1.v3;

/*
 *@create by jiankang
 *@date 2020/6/1 time 13:20
 */

public class Client {
    public static void main(String[] args) {
        StringUtils.encode(null);

    }

    static class StringUtils{
        public  static  String encode(String str){
            assert str == null:"加密的字符串为null";
            /*
            加密操作
             */
            return "";
        }
    }
}
