package com.jiankang.javacoretechnologythetenversion.dchapter1.v1;

/*
 *@create by jiankang
 *@date 2020/7/5 time 12:53
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("D:\\mystudy20190927\\mystudy\\src\\main\\java\\com\\jiankang\\javacoretechnologythetenversion\\dchapter1\\v1\\a.txt");
        out.print("aaa");
        out.print("AAAAA");
        out.flush();
    }
}
