package com.jiankang.designismethod2.componentpattern.v3;

/*
 *@create by jiankang
 *@date 2019/11/22 time 16:29
 */

import java.util.ArrayList;

public class Branch extends Corp {
    //领导下边有哪些下级领导和小兵
    ArrayList<Corp> subordinateList = new ArrayList<Corp>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSubordinateList(Corp corp) {
        this.subordinateList.add(corp);
    }

    public ArrayList<Corp> getSubordinateList(){
        return this.subordinateList;
    }
}
