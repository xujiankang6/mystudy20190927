package com.jiankang.designismethod2.facadepattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/26 time 15:19
 */

public class Police {
    public void checkLetter(ILetterProcess letterProcess) {
        System.out.println(letterProcess + "信件已经检查过了。。。。");
    }
}
