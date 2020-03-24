package com.jiankang.designismethod2.behavorpatternpk.v2;

/*
 *@create by jiankang
 *@date 2020/1/6 time 19:04
 */

public class Invoker {
    private AbstractCmd cmd;

    public Invoker(AbstractCmd cmd) {
        this.cmd = cmd;
    }

    public boolean execute(String source,String to){
        return cmd.execute(source, to);
    }
}
