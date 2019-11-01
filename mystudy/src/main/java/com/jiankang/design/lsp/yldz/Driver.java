package com.jiankang.design.lsp.yldz;

/*
 *@create by jiankang
 *@date 2019/10/31 time 19:27
 */

public class Driver implements IDriver {


    @Override
    public void driver(ICar iCar) {
        iCar.run();
    }


    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.driver(new BaoBa());
    }
}
