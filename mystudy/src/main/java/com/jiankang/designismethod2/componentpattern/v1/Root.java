package com.jiankang.designismethod2.componentpattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/22 time 13:51
 */

import java.util.ArrayList;

public class Root implements IRoot {

    //保存跟节点下的树枝节点和树叶节点，Subordinate的意思是下级
    private ArrayList subordinateList = new ArrayList();

    //根节点的名称
    private String name = "";

    //根节点的职位
    private String position = "";

    //根节点的薪水
    private int salary = 0;

    public Root(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "名称：" + this.name;
        ;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水： " + this.salary;
        return info;
    }

    @Override
    public void add(IBranch branch) {
        this.subordinateList.add(branch);
    }

    @Override
    public void add(ILeaf leaf) {
        this.subordinateList.add(leaf);
    }

    @Override
    public ArrayList getSubordinateInfo() {
        return this.subordinateList;
    }
}
