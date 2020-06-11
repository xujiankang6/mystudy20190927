package com.jiankang.javacoretechnologythetenversion.chapter6.v8;

/*
 *@create by jiankang
 *@date 2020/6/8 time 15:51
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        Timer t = new Timer(1000, event -> System.out.println(event));
        Timer t1 = new Timer(1000, System.out::println);
        repeatMessage("hello",1000);
    }

    public static void repeatMessage(String text, int delay) {
        ActionListener listener = event -> {
            System.out.println(text);
            Toolkit.getDefaultToolkit().beep();
        };
        new Timer(delay, listener).start();
    }
}
