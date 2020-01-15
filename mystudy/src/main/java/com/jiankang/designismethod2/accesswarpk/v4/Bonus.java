package com.jiankang.designismethod2.accesswarpk.v4;

/*
 *@create by jiankang
 *@date 2020/1/12 time 20:45
 */

public class Bonus {
    private Attendance atte = new Attendance();

    public int getBonus() {
        int workDays = atte.getWorkDays();
        int bonus = workDays * 1800 / 30;
        return bonus;
    }
}
