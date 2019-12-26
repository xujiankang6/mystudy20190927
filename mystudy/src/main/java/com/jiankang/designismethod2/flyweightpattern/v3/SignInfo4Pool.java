package com.jiankang.designismethod2.flyweightpattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/24 time 17:30
 */

public class SignInfo4Pool extends SignInfo {

    //定义一个对象池提取的KEY值
    private String key;

    public SignInfo4Pool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
