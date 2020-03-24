package com.jiankang.designismethod2.accesswarpk.v1;

/*
 *@create by jiankang
 *@date 2020/1/12 time 11:09
 */

public class HtmlMail extends MailTemplate {

    public HtmlMail(String from, String to, String subject, String context) {
        super(from, to, subject, context);
    }

    public String getContext(){
        return "htmlMail :"+super.getContext();
    }
}
