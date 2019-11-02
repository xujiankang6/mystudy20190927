package com.jiankang.design.lsp.yldz;

/*
 *@create by jiankang
 *@date 2019/10/31 time 19:27
 */


public class Driver1 implements IDriver1 {
    private ICar car;

    public void setCar(ICar car){
        this.car=car;
    }



    @Override
    public void driver() {
        car.run();
    }


    public static void main(String[] args) {

        IDriver1 driver=new Driver1();
        driver.setCar(new BaoBa());
        driver.driver();
    }
}
