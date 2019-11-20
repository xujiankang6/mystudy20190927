package com.jiankang.designismethod2.commandmethod;

/*
 *@create by jiankang
 *@date 2019/11/19 time 20:21
 */

public class CancelDeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pg.rollBack();
    }
}
