package com.jiankang.designismethod2.accesswarpk.v2;

/*
 *@create by jiankang
 *@date 2020/1/12 time 11:12
 */

public class Client {
    public static void main(String[] args) {
        MailServer mailServer = new Postfix(new TextMail("1","2","3","4"));
        mailServer.sendMail();
    }
}
