package com.jiankang.designismethod2.facadepattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/26 time 14:25
 */

public class LetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容。。。。" + context);
    }

    @Override
    public void fillEnvelop(String address) {
        System.out.println("填写收件人姓名及地址..." + address);
    }

    @Override
    public void letterInotoEnvelope() {
        System.out.println("把信放信封中。。。");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮寄信件。。。");
    }
}
