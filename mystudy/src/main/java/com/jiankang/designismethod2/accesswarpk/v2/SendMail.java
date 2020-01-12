package com.jiankang.designismethod2.accesswarpk.v2;

/*
 *@create by jiankang
 *@date 2020/1/12 time 19:31
 */

public class SendMail extends MailServer {
    //传递一封邮件
    public SendMail(MailTemplate m) {
        super(m);
    }

    @Override
    public void sendMail() {
        super.m.add("sfdfdfdfdfdfsfaffffffffffffffffffffffffffffffff");
        super.sendMail();
    }
}
