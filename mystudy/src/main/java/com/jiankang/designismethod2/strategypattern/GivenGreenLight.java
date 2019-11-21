package com.jiankang.designismethod2.strategypattern;

/*
 *@create by jiankang
 *@date 2019/11/21 time 14:45
 */

public class GivenGreenLight implements IStrategy{
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯,放行！");
    }
}
