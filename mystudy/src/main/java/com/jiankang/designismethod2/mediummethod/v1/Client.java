package com.jiankang.designismethod2.mediummethod.v1;

/*
 *@create by jiankang
 *@date 2019/11/18 time 16:34
 */

public class Client {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);
        Sale sale=new Sale(mediator);
        sale.sellIBMComputer(1);
        Stock stock = new Stock(mediator);
        stock.clearStock();

    }
}
