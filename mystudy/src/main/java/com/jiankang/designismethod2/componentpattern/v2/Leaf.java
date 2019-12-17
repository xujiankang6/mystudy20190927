package com.jiankang.designismethod2.componentpattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/22 time 15:16
 */

public class Leaf implements ILeaf {
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Leaf(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "姓名：" + this.name;
        info = info + "\t职位："+ this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }
}
