package com.jiankang.designismethod2.decoratorpattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/20 time 15:45
 */

public class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        //成绩单的格式是这个样子的
        System.out.println("尊敬的XXX家长:");
        System.out.println(" ......");
        System.out.println(" 语文 62 数学65 体育 98 自然 63");
        System.out.println(" .......");
        System.out.println(" 家长签名： ");
    }


    @Override
    public void sign(String name) {
        System.out.println("家长签名为：" + name);
    }
}
