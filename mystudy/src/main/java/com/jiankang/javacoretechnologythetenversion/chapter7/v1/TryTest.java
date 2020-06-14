package com.jiankang.javacoretechnologythetenversion.chapter7.v1;

/*
 *@create by jiankang
 *@date 2020/6/12 time 13:52
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryTest {

    public static void main(String[] args) {

//    带资源的try语句    不论这个块如何退出，in和out都会关闭
        try (Scanner in = new Scanner(new FileInputStream("a.txt"), "UTF-8");
             PrintWriter out = new PrintWriter("out.txt");) {

            while (in.hasNext()) {
                out.println(in.next().toUpperCase());
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
