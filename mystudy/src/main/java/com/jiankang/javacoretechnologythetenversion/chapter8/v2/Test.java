package com.jiankang.javacoretechnologythetenversion.chapter8.v2;

/*
 *@create by jiankang
 *@date 2020/6/17 time 19:02
 */

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        new Block(){
            @Override
            public void body() throws Exception {

                Scanner in = new Scanner(new File("./note"), "UTF-8");
                while (in.hasNext()){
                    System.out.println(in.next());
                }
            }
        }.toThread().start();
    }
}
