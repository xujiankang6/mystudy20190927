package com.jiankang.designismethod2.behavorpatternpk.v2;

/*
 *@create by jiankang
 *@date 2020/1/6 time 18:58
 */

public class ZipUnCompressCmd extends AbstractCmd {
    @Override
    public boolean execute(String source, String to) {
        return super.unCompressReceiver.zipExec(source,to);
    }
}
