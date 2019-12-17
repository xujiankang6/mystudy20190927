package com.jiankang.designismethod2.mediummethod.v1;

/*
 *@create by jiankang
 *@date 2019/11/15 time 9:57
 *
 * 用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，从而使其耦合松散，而且可以独立地改变它
 *们之间的交互。
 */

import com.jiankang.designismethod2.mediummethod.Purchase;
import com.jiankang.designismethod2.mediummethod.Sale;
import com.jiankang.designismethod2.mediummethod.Stock;

public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;


    public AbstractMediator() {
        purchase = new Purchase();
        sale = new Sale();
        stock = new Stock();
    }

    //中介者最重要的方法叫做事件方法，处理多个对象之间的关系
    public abstract void execute(String str, Object... objects);
}
