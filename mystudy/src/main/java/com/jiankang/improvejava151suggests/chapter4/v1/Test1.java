package com.jiankang.improvejava151suggests.chapter4.v1;

/*
 *@create by jiankang
 *@date 2020/10/27 time 14:27
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
             String str = input.nextLine();
             Pattern compile = Pattern.compile("\\b\\w+\\b");
             Matcher matcher = compile.matcher(str);
             int wordsCount = 0;
             while (matcher.find()){
                 wordsCount++;
             }
            System.out.println(str + " 单词数："+wordsCount);

        }

    }
}
