package com.jiankang.javacoretechnologythetenversion.chapter6.v5;

/*
 *@create by jiankang
 *@date 2020/6/9 time 15:51
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


//内部类对象拥有一个对外围类对象的引用
public class TalkingClock {
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
        ActionListener timePrinter = new TimePrinter();
        Timer timer = new Timer(interval, timePrinter);
        timer.start();
    }

    private class TimePrinter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone,the time is :" + new Date());
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
