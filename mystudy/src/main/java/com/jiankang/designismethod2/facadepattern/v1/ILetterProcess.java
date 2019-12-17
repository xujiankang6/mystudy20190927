package com.jiankang.designismethod2.facadepattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/26 time 14:23
 */

public interface ILetterProcess {

    public void writeContext(String context);

    public void fillEnvelop(String address);

    public void letterInotoEnvelope();

    public void sendLetter();
}
