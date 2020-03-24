package com.jiankang.designismethod2.accesswarpk.v2;

/*
 *@create by jiankang
 *@date 2020/1/12 time 11:09
 */

public class TextMail extends MailTemplate {

    public TextMail(String from, String to, String subject, String context) {
        super(from, to, subject, context);
    }

    public String getContext(){
        return "textMail :"+super.getContext();
    }
}
