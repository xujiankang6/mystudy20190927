package com.jiankang.javaconcurrencybeauty.chapter6.v1;

/*
 *@create by jiankang
 *@date 2020/10/22 time 19:51
 */

import java.util.concurrent.locks.LockSupport;

public class TestPark {

    public void testPark(){
        LockSupport.park(this);
    }

    public static void main(String[] args) {
         TestPark testPark = new TestPark();
         testPark.testPark();
    }
}
