package com.jiankang.headfirstdesign.modetolmodel;

import com.jiankang.headfirstdesign.Quackable;

public class GooseAdapter implements Quackable {

    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.Goose();
    }
}
