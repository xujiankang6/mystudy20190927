package com.jiankang.designismethod2.decoratorpattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/20 time 15:49
 */

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {

    private void reportHighScore(){
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    private void reportSort(){
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }

}
