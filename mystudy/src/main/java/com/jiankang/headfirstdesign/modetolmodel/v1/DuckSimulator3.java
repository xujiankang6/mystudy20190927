package com.jiankang.headfirstdesign.modetolmodel.v1;

public class DuckSimulator3 {
    public static void main(String[] args) {
        DuckSimulator3 duckSimulator = new DuckSimulator3();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
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
        Quackologist quackologist = new Quackologist();
        flock.registerObserver(quackologist);
        simulate(flock);
        System.out.println(Quackcounter.numberOfQuacks);
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
