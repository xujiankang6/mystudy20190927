package com.jiankang.headfirstdesign.modetolmodel;

public class GooseFactory extends AbstractGooseFactory {

    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}
