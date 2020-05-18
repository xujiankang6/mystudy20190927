package com.jiankang.javaprogramminglogic.chapter19.v1;

import java.util.concurrent.Semaphore;

/*
 *@create by jiankang
 *@date 2020/5/16 time 14:20
 */
//限制并发访问的用户数不超过100
public class AccessControlService {
    public static class ConCurrentLimitException extends RuntimeException {
        private static final long serialVersionUID = 1L;
    }

    private static final int MAX_PERMITS = 100;
    private Semaphore permits = new Semaphore(MAX_PERMITS, true);

    public boolean login(String name, String password,int a) {
        if (!permits.tryAcquire()) {
            //同时登录用户数超过限制
            System.out.println(a);
            throw new ConCurrentLimitException();
        }
        return true;
    }

    public void logout(String name) {
        permits.release();
    }


    public static void main(String[] args) {
        AccessControlService accessControlService = new AccessControlService();
        //当登录第一百个，报错
        for (int i = 0; i < 1000; i++) {
            accessControlService.login("a"+i,"aaa",i);
        }
    }
}
