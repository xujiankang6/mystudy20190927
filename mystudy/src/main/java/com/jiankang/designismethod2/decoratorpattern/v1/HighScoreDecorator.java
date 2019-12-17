package com.jiankang.designismethod2.decoratorpattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/21 time 13:53
 */

public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }

}
