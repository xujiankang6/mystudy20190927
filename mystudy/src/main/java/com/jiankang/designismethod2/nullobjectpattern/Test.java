package com.jiankang.designismethod2.nullobjectpattern;

public class Test {

    public static void main(String[] args) {
        Persion persion = new Persion();
//        如果Animal为空，传入的空对象
        Animal animal = new NullAnimal();
        persion.heard(animal);
    }
}
