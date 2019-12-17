package com.jiankang.headfirstdesign.modetolmodel;

import com.jiankang.headfirstdesign.Quackable;

public class DuckSimulator3 {
    public static void main(String[] args) {
        DuckSimulator3 duckSimulator = new DuckSimulator3();
        DuckFactory duckFactory = new DuckFactory();
        duckSimulator.simulate(duckFactory);

    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckSimulator =duckFactory.createDuckCall() ;
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseAdapter =new GooseAdapter(new Goose());

        System.out.println("Duck Simulator");
        Flock flock = new Flock();
        flock.add(mallardDuck);
        flock.add(redheadDuck);
        flock.add(duckSimulator);
        flock.add(rubberDuck);
        flock.add(gooseAdapter);

        simulate(flock);





    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
