package com.jiankang.improvejava151suggests.chapter9.v4;

/*
 *@create by jiankang
 *@date 2020/11/4 time 20:19
 */

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class TaxCalculator implements Callable<Integer> {
    private int seedMoney;


    public TaxCalculator(int seedMoney) {
        this.seedMoney = seedMoney;
    }

    @Override
    public Integer call() throws Exception {
        TimeUnit.MILLISECONDS.sleep(10000);
        return seedMoney / 10;
    }
}
