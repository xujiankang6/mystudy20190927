package com.jiankang.designismethod2.accesswarpk.v2;

/*
 *@create by jiankang
 *@date 2020/1/12 time 11:07
 */

public class MailTemplate {
    private String from;
    private String to;
    private String subject;
    private String context;

    public MailTemplate(String from, String to, String subject, String context) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.context = context;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getFrom() {
        return from;
    }



    public void add(String sendInfo) {
        context = sendInfo + context;
    }
}
