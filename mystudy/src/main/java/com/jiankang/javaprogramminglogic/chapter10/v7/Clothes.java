package com.jiankang.javaprogramminglogic.chapter10.v7;

/*
 *@create by jiankang
 *@date 2020/4/12 time 15:18
 */

import com.jiankang.javaprogramminglogic.chapter5.Size;

public class Clothes {
    String id;
    Size size;


    public Clothes(String id, Size size) {
        this.id = id;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
