package com.jiankang.designismethod2.accesswarpk.v3;

/*
 *@create by jiankang
 *@date 2020/1/12 time 20:10
 */

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
      IPosition position = new Position(mediator);
      ISalary salary = new Salary(mediator);
      ITax tax = new Tax(mediator);
      position.promote();

    }
}
