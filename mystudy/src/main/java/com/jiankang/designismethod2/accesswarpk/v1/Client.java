package com.jiankang.designismethod2.accesswarpk.v1;

/*
 *@create by jiankang
 *@date 2020/1/12 time 11:12
 */

import com.jiankang.designismethod2.prototypepattern.Mail;

public class Client {
    public static void main(String[] args) {
        MailServer mailServer = new MailServer(new TextMail("1","2","3","4"));
        mailServer.sendMail();
    }
}
