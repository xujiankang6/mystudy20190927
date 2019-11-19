package com.jiankang.designismethod2.commandmethod;

/*
 *@create by jiankang
 *@date 2019/11/18 time 20:45
 */

public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        //找到需求组
        super.rg.find();
        //增加和一份需求
        super.rg.add();
        //给出计划
        super.rg.plan();

    }
}
