package com.jiankang.headfirstdesign.modetolmodel;

import com.jiankang.headfirstdesign.Quackable;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
