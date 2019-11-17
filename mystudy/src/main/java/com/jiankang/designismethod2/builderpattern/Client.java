package com.jiankang.designismethod2.builderpattern;

/*
 *@create by jiankang
 *@date 2019/11/11 time 14:50
 */

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        //v2
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom"); //客户要求，run的时候先发动引擎
        sequence.add("start"); //启动起来
        sequence.add("stop"); //开了一段就停下来
        CarBuilder benzcarBuilder = new BenzBuilder();
        CarModel benz = benzcarBuilder.getCarModel();
        CarBuilder baoMacarBuilder = new BMWBuilder();
        benz.setSequence(sequence);
        benz.run();
        System.out.println("-----------------");
        CarModel bwn = baoMacarBuilder.getCarModel();
        bwn.setSequence(sequence);
        bwn.run();

        //final
        Director director = new Director();
        for (int i = 0; i < 10000; i++) {
            director.getABenzModel().run();
        }
    }
}
