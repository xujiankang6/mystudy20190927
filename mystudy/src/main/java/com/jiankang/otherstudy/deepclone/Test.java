package com.jiankang.otherstudy.deepclone;

import java.io.IOException;


public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Item item1 = new Item(1, "item1");
        Book java = new Book(1, "java", item1);
        Book book = JdkSerialUtil.deepClone(java);
        System.out.println(book.getItem());
        System.out.println(java.getClass()==book.getClass());
        System.out.println(java.item==book.item);
    }
}
