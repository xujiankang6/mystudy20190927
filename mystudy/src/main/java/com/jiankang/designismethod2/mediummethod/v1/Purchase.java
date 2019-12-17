package com.jiankang.designismethod2.mediummethod.v1;

/*
 *@create by jiankang
 *@date 2019/11/15 time 13:36
 */

public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator _mediator) {
        super(_mediator);
    }

    //采购IBM的电脑
    public void buyIBMcomputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    //不再采购IBM的电脑
    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
