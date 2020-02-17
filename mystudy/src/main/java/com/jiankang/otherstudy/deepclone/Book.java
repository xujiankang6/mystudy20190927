package com.jiankang.otherstudy.deepclone;

import java.io.Serializable;

public class Book implements Serializable {
    int id;
    String name;
    Item item;

    public Book(int id, String name, Item item) {
        this.id = id;
        this.name = name;
        this.item = item;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
