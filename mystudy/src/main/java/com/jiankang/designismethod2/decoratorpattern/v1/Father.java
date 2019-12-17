package com.jiankang.designismethod2.decoratorpattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/20 time 15:47
 */

public class Father {
    public static void main(String[] args) {
        //把成绩单拿过来
       /* SchoolReport sr = new SugarFouthGradeSchoolReport();
        sr.report();
        sr.sign("zhangsan");*/

        SchoolReport sr = new HighScoreDecorator(new FouthGradeSchoolReport());
        sr.report();
        sr.sign("aa");



    }
}
