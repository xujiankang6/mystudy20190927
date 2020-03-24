package com.jiankang.designismethod2.behavorpatternpk.v2;

/*
 *@create by jiankang
 *@date 2020/1/6 time 17:02
 */

public abstract class AbstractCmd {
//    //对接收者的引用
    protected  IReceiver compressReceiver = new CompressReceiver();
    protected  IReceiver unCompressReceiver = new UnCompressReceiver();

    public abstract boolean execute(String source, String to);


}
