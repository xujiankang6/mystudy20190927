package com.jiankang.blog.v5_20200909.v2;

/*
 *@create by jiankang
 *@date 2020/9/9 time 17:16
 */

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class TaskInterger implements Callable<Integer> {

    private final int sum;

    public TaskInterger(int sum) {
        this.sum = sum;
    }

    @Override
    public Integer call() throws Exception {
        TimeUnit.SECONDS.sleep(sum);
        return sum * sum;
    }
}
