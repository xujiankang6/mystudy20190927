package com.jiankang.designismethod2.commandmethod;

/*
 *@create by jiankang
 *@date 2019/11/18 time 20:47
 */

public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pg.find();
        super.pg.plan();
        super.pg.delete();
    }
}
