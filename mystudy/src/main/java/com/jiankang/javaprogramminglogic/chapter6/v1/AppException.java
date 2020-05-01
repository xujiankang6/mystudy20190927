package com.jiankang.javaprogramminglogic.chapter6.v1;

/*
 *@create by jiankang
 *@date 2020/4/30 time 16:04
 */

public class AppException extends Exception {

    public AppException() {
        super();
    }

    public AppException(String message) {
        super(message);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppException(Throwable cause) {
        super(cause);
    }

}
