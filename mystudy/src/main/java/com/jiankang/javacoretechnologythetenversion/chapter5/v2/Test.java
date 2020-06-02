package com.jiankang.javacoretechnologythetenversion.chapter5.v2;

/*
 *@create by jiankang
 *@date 2020/6/1 time 19:16
 */

import java.text.MessageFormat;

public class Test {
    public static void main(String[] args) {
        int n = 11;
        System.out.printf("%dzzzz",n);
        System.out.println();
        System.out.printf("%d %s",n,"widgets");
        System.out.println();
        MessageFormat  m = new MessageFormat("{6}曾经爱过{0}，她不爱我，我想要{1}{2}{3}{4}，她却{5}");
        String format1 = m.format(new Object[]{});
        String s = format1.replaceAll("[0-9]", "  ");
        System.out.println(s);
        String format = m.format(new Object[]{"王艳娇",1,3,1,4,"离我而去","健康"});
        String format2 = m.format(new Object[]{"小张燕",1,3,1,4,"离我而去","彦涛"});
        String format3 = m.format(new Object[]{"李文慧",1,3,1,4,"离我而去","大征"});
        String format4 = m.format(new Object[]{"张悦",1,3,1,4,"离我而去","大征"});
        String format5 = m.format(new Object[]{"刘雨晴",1,3,1,4,"离我而去","冯沛"});
        System.out.println(format);
        System.out.println(format2);
        System.out.println(format3);
        System.out.println(format4);
        System.out.println(format5);
    }
}
