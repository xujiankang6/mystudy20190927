package com.jiankang.designismethod2.facadepattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/26 time 14:35
 * 门面模式： 一个子系统的外部与其内部通信，必须通过一个统一的对象进行。
 * 统一的对象：提供一个子系统的接口，除了这个接口不允许有任何访问子系统的行为发生。
 */

public class ModenPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();
    private Police letterPolice = new Police();

    //写信，封装，投递，一体化
    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        letterProcess.fillEnvelop(address);
        letterPolice.checkLetter(letterProcess);
        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();
    }
}
