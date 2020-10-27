package com.jiankang.improvejava151suggests.chapter4.v1;

/*
 *@create by jiankang
 *@date 2020/10/27 time 15:02
 * 对汉字进行排序
 */

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class Test59 {
    public static void main(String[] args) {
        String[] strs = {"张三", "李四", "王五"};
        //定义一个中文排序器，复杂的需要pinyin4japi， 可以把汉字转换为拼音
        //简单的排序使用Collator即可
        Comparator c = Collator.getInstance(Locale.CHINA);
        Arrays.sort(strs, c);
        int i = 0;
        for (String str : strs) {
            System.out.println((++i) + "、" + str);
        }

    }
}
