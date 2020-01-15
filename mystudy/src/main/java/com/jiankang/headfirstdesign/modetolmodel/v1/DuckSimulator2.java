package com.jiankang.headfirstdesign.modetolmodel.v1;

public class DuckSimulator2 {
    public static void main(String[] args) {
        DuckSimulator2 duckSimulator = new DuckSimulator2();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
        AbstractGooseFactory gooseFactory = new GooseFactory();
        Quackable goose = gooseFactory.createGoose();
        goose.quack();
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckSimulator =duckFactory.createDuckCall() ;
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseAdapter =new GooseAdapter(new Goose());

        System.out.println("Duck Simulator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckSimulator);
        simulate(rubberDuck);
        simulate(gooseAdapter);

        System.out.println(Quackcounter.getNumberOfQuacks());




    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
