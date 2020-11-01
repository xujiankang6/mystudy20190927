package com.jiankang.javacoretechnologythetenversion.dchapter1.v2;

/*
 *@create by jiankang
 *@date 2020/7/8 time 9:47
 */

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");
        String str = "徐健康";
        ByteBuffer encode = charset.encode(str);
        byte[] bytes = encode.array();
        System.out.println(Arrays.toString(bytes));

        ByteBuffer wrap = ByteBuffer.wrap(bytes);
        CharBuffer decode = charset.decode(wrap);
        String string = decode.toString();
        System.out.println(string);
        CharBuffer c = CharBuffer.wrap(new char[]{'徐'});
        System.out.println(c.charAt(0));
    }
}
