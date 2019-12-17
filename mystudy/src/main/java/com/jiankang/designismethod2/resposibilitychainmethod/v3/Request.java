package com.jiankang.designismethod2.resposibilitychainmethod.v3;

/*
 *@create by jiankang
 *@date 2019/11/20 time 11:52
 */

public class Request {

    // 请求的等级
    public Level getRequestLevel() {
        return new Level();
    }

    public class Response {
        //处理返回的数据
    }
}
