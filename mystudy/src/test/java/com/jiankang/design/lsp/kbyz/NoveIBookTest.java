package com.jiankang.design.lsp.kbyz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


/*
 *@create by jiankang
 *@date 2019/11/2 time 15:25
 */

public class NoveIBookTest {
    private String name = "平凡的世界";
    private int price = 6000;
    private String author = "路遥";
    private IBook novelBook = new NoveIBook(name,price,author);
    @Test
    public void getPrice() {
        Assert.assertEquals(this.price,this.novelBook.getPrice());
    }
}