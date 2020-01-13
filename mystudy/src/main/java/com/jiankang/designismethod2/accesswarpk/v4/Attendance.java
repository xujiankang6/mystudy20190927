package com.jiankang.designismethod2.accesswarpk.v4;

/*
 *@create by jiankang
 *@date 2020/1/12 time 20:44
 */

import java.util.Random;

public class Attendance {

    public int getWorkDays() {
        return (new Random()).nextInt(30);
    }
}
