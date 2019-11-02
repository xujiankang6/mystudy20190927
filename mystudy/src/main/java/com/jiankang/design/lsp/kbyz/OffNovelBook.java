package com.jiankang.design.lsp.kbyz;

/*
 *@create by jiankang
 *@date 2019/11/2 time 15:06
 */

public class OffNovelBook extends NoveIBook {
    public OffNovelBook(String name, int price, String author) {
        super(name, price, author);
    }


    //覆写销售价格
    @Override
    public int getPrice() {
        //原价
        int selfPrice = super.getPrice();
        int offPrice = 0;
        if (selfPrice > 4000) { //原价大于40元，则打9折
            offPrice = selfPrice * 90 / 100;
        } else {
            offPrice = selfPrice * 80 / 100;
        }
        return offPrice;
    }
}

