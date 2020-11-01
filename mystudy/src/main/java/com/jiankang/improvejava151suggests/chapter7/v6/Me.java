package com.jiankang.improvejava151suggests.chapter7.v6;

/*
 *@create by jiankang
 *@date 2020/11/1 time 12:21
 */

public class Me implements Staff,Passenger {
    @Override
    public boolean isStanding() {
        return true;
    }

    @Override
    public int getSalary() {
        return 2000;
    }

}
