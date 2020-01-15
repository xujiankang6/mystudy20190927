package com.jiankang.designismethod2.interpreterpattern;

/*
 *@create by jiankang
 *@date 2019/12/24 time 11:32
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {
    //运行四则运算
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        HashMap<String, Integer> var = getVaule(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("result is "+calculator.run(var));
    }

    //获得表达式
    private static String getExpStr() throws IOException {
        System.out.println("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    //获得值映射
    public static HashMap<String, Integer> getVaule(String exprStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (char ch : exprStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                //解决重复参数问题
                if (!map.containsKey(String.valueOf(ch))) {
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }
}
