package com.jiankang.designismethod2.accesswarpk.v3;

/*
 *@create by jiankang
 *@date 2020/1/12 time 20:06
 */

public class Mediator extends AbsMediator {
    @Override
    public void up(ISalary salary) {

        upSalary();
        upTax();
    }

    @Override
    public void down(ISalary salary) {

    }

    @Override
    public void up(ITax tax) {
        upTax();
        downSalary();
    }

    @Override
    public void down(ITax tax) {
        downTax();

    }

    @Override
    public void up(IPosition position) {
        upSalary();
        upTax();
        upPosition();
    }

    @Override
    public void down(IPosition position) {
        downSalary();
        downPosition();
    }

    private void upSalary() {
        System.out.println("工资up");
    }

    private void upTax() {
        System.out.println("tax up");
    }

    private void upPosition() {
        System.out.println("position up");
    }

    private void downSalary() {
        System.out.println("down salary");
    }

    private void downTax() {
        System.out.println("down Tax");
    }

    private void downPosition() {
        System.out.println("down Position");
    }

}
