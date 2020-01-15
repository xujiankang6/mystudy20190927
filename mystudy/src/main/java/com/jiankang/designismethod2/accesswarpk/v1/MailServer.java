package com.jiankang.designismethod2.accesswarpk.v1;

/*
 *@create by jiankang
 *@date 2020/1/12 time 11:11
 */

public class MailServer {

    private MailTemplate m;

    public MailServer(MailTemplate m) {
        this.m = m;
    }

    public void sendMail(){
        System.out.println(m.getContext());
    }
}
