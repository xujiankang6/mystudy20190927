package com.jiankang.design.lsp.kbyz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


/*
 *@create by jiankang
 *@date 2019/11/2 time 15:28
 */

public class OffNovelBookTest {
    private IBook below40NovelBook = new OffNovelBook("平凡的世界",3000,"路遥");
    private IBook above40NovelBook = new OffNovelBook("平凡的世界",6000,"路遥");
    @Test
    public void getPrice() {
        Assert.assertEquals(2400,this.below40NovelBook.getPrice());
        Assert.assertEquals(5400,this.above40NovelBook.getPrice());
    }
}