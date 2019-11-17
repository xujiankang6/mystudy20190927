package com.jiankang.design.lsp.yldz;

/*
 *@create by jiankang
 *@date 2019/10/31 time 19:27
 */

/*
构造方法传递依赖对象
 */
public class Driver implements IDriver {
    private ICar car;

    public Driver(ICar car){
        this.car=car;
    }



    @Override
    public void driver() {
        car.run();
    }


    public static void main(String[] args) {
        Driver driver = new Driver(new BaoBa());
        driver.driver();
    }
}
