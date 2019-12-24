package com.jiankang.headfirstdesign.modetolmodel.v1;

public class GooseFactory extends AbstractGooseFactory {

    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}
