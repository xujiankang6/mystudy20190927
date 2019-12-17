package com.jiankang.headfirstdesign.modetolmodel;

import com.jiankang.headfirstdesign.Quackable;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }

    void simulate() {
        Quackable mallardDuck = new Quackcounter(new MallardDuck());
        Quackable redheadDuck = new Quackcounter(new RedheadDuck());
        Quackable duckSimulator =new Quackcounter(new DuckCall()) ;
        Quackable rubberDuck = new Quackcounter(new RubberDuck());
        Quackable gooseAdapter =new Quackcounter(new GooseAdapter(new Goose()));

        System.out.println("\n Duck Simulator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckSimulator);
        simulate(rubberDuck);
        simulate(gooseAdapter);

        System.out.println(Quackcounter.numberOfQuacks);




    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
