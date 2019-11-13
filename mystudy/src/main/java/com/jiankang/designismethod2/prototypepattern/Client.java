package com.jiankang.designismethod2.prototypepattern;

/*
 *@create by jiankang
 *@date 2019/11/13 time 20:19
 */

import java.util.Random;

public class Client {
    //发送账单的数量，这个值是从数据库中获得
    private static int MAX_COUNT = 600000;

    public static void main(String[] args) {
        Mail mail =new Mail(new AdvTemplate());
        int i=0;
        while (i<MAX_COUNT){
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5)+" 先生（女士）");
            cloneMail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
//然后发送邮件
            sendMail(cloneMail);
            i++;
        }
    }

    //发送邮件
    public static void sendMail(Mail mail){
        System.out.println("标题："+mail.getSubject() + "收件人： "+mail.getReceiver()+"发送成功！");
    }
    //获得指定长度的随机字符串
    public static String getRandString(int maxLength){
        String source ="abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for(int i=0;i<maxLength;i++){
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
