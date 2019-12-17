package com.jiankang.designismethod2.componentpattern.v6;

/*
 *@create by jiankang
 *@date 2019/11/25 time 16:58
 */

import java.util.ArrayList;

public class Branch extends Corp {

    //领导下面有哪些下级和小兵
    ArrayList<Corp> subordinateList = new ArrayList<Corp>();

    public Branch(String _name, String _position, int _salary) {
        super(_name, _position, _salary);
    }

    public void addSubordinate(Corp corp){
        corp.setParent(this);
        this.subordinateList.add(corp);
    }

    //返回所有下属
    public ArrayList<Corp> getSubordinateList(){
        return this.subordinateList;
    }
}
