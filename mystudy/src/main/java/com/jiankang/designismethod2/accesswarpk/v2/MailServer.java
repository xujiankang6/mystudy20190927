package com.jiankang.designismethod2.accesswarpk.v2;

/*
 *@create by jiankang
 *@date 2020/1/12 time 11:11
 */

public abstract  class MailServer {

    protected MailTemplate m;

    public MailServer(MailTemplate m) {
        this.m = m;
    }

    public void sendMail(){
        System.out.println(m.getContext());
    }
}
