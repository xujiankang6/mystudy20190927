package com.jiankang.designismethod2.createclasspatternpk.v2;

/*
 *@create by jiankang
 *@date 2019/12/31 time 15:52
 */

public abstract class Builder {

    protected final SuperMan superMan = new SuperMan();

    public void setBody(String body) {
        this.superMan.setBody(body);
    }

    public void setSpecialSymbol(String ss) {
        this.superMan.setSpecialSymol(ss);
    }

    public void setSpecialTalent(String st){
        this.superMan.setSpecialTalent(st);
    }

    public abstract SuperMan getSuperMan();
}
