package com.jiankang.designismethod2.accesswarpk.v4;

/*
 *@create by jiankang
 *@date 2020/1/12 time 21:06
 */

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        HRFacade hrFacade = new HRFacade();
        System.out.println(hrFacade.querySalary("jiankang", new Date()));
        System.out.println(hrFacade.queryWorkDays("jiankang"));
    }
}
