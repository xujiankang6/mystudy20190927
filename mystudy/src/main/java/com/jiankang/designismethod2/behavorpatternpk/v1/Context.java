package com.jiankang.designismethod2.behavorpatternpk.v1;

/*
 *@create by jiankang
 *@date 2020/1/6 time 16:52
 */

public class Context {
    private Algorithm al;

    public Context(Algorithm al) {
        this.al = al;
    }

    public boolean compress(String source, String to) {
        return al.compress(source, to);
    }

    public boolean uncompress(String source, String to) {
        return al.uncompress(source, to);
    }
}
