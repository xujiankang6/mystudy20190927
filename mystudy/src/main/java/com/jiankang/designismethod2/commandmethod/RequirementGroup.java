package com.jiankang.designismethod2.commandmethod;

/*
 *@create by jiankang
 *@date 2019/11/18 time 20:39
 */

public class RequirementGroup extends Group {
    //客户要求需求组过去和他们谈
    public void find() {
        System.out.println("找到需求组...");
    }

    //客户要求增加一项需求
    public void add() {
        System.out.println("客户要求增加一项需求...");
    }

    //客户要求修改一项需求
    public void change() {
        System.out.println("客户要求修改一项需求...");
    }

    //客户要求删除一项需求
    public void delete() {
        System.out.println("客户要求删除一项需求...");
    }

    //客户要求给出变更计划
    public void plan() {
        System.out.println("客户要求需求变更计划...");
    }
}
