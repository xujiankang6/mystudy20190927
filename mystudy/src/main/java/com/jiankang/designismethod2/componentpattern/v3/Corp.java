package com.jiankang.designismethod2.componentpattern.v3;

/*
 *@create by jiankang
 *@date 2019/11/22 time 16:27
 *将对象组合成树形结构以表示“部分-整体”的层次结构，
 * 使得用户对单个对象和组合对象的使用具有一致性。
 *
 *
 */

public abstract class Corp {
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        String info = "";
        info = "姓名：" + this.name;
        info = info + "\t职位："+ this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }
}
