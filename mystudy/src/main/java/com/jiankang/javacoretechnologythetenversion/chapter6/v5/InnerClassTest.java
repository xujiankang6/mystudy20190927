package com.jiankang.javacoretechnologythetenversion.chapter6.v5;

/*
 *@create by jiankang
 *@date 2020/6/9 time 15:50
 */

import javax.swing.*;

public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000,true);
        clock.start();
        JOptionPane.showMessageDialog(null,"Quit program? ");
        System.exit(0);
    }
}
