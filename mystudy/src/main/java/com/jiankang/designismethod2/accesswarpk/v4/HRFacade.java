package com.jiankang.designismethod2.accesswarpk.v4;

/*
 *@create by jiankang
 *@date 2020/1/12 time 21:03
 */

import javax.xml.stream.events.StartDocument;
import java.util.Date;
import java.util.zip.DataFormatException;

public class HRFacade {
    private SalaryProvider salaryProvider = new SalaryProvider();

    private  Attendance attendance = new Attendance();

    public int querySalary(String name, Date date){
       return salaryProvider.totalSalary();
    }

    public int queryWorkDays(String name){
        return attendance.getWorkDays();
    }

}
