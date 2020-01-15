package com.jiankang.designismethod2.accesswarpk.v2;

/*
 *@create by jiankang
 *@date 2020/1/12 time 19:19
 */

public class Postfix extends MailServer {

    public Postfix(MailTemplate m) {
        super(m);
    }

    @Override
    public void sendMail() {
        super.m.add("postfix+=-----");
        super.sendMail();
    }
}
