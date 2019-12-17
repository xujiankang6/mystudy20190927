package com.jiankang.designismethod2.visitorpattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/5 time 10:44
 */

public class Client {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Element element = ObjectStruture.createElement();
            element.accept(new Visitor());
        }
    }
}
