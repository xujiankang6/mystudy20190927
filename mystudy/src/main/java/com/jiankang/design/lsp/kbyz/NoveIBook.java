package com.jiankang.design.lsp.kbyz;

/*
 *@create by jiankang
 *@date 2019/11/2 time 14:50
 */

public class NoveIBook implements IBook {

    private String name;
    private int price;
    private String author;


    public NoveIBook(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
}
