package com.jiankang.javacoretechnologythetenversion.chapter7.v1;

/*
 *@create by jiankang
 *@date 2020/6/12 time 13:57
 */

import java.io.PrintWriter;
import java.io.StringWriter;

public class Test {
    public static void main(String[] args) {
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for (StackTraceElement frame : frames) {
            System.out.println(frame.toString());
        }


        Throwable tt = new Throwable();
        StringWriter out = new StringWriter();
        tt.printStackTrace(new PrintWriter(out));
        System.out.println(out.toString());
    }
}
