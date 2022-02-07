package com.jiankang.javaprogramminglogic.chapter7.v1;

import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * ArrayDemo
 *
 * @author jiankang.xu
 * @date 2020/3/22
 */
public class Demo {

    public static void main(String[] args) {
        String a = "我爱你王艳娇";
        char c = a.charAt(2);
        char[] chars = new char[]{'a','b','c'};
        a.getChars(0,2,chars,1);
        System.out.println(a);
        System.out.println(Arrays.toString(chars));
        System.out.println(c);
        System.out.println(Charset.defaultCharset().name());
        byte[] bytes = a.getBytes(Charset.forName("gbk"));
        System.out.println(Arrays.toString(bytes));
        byte[] bytes1 = a.getBytes(Charset.defaultCharset());
        System.out.println(Arrays.toString(bytes1));
        String aaa = a.concat("aaa");
        System.out.println(aaa);
        Arrays.copyOf(chars,100);
    }
}
