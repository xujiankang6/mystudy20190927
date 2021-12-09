package com.jiankang.interview.v1;

/**
 * Singleton
 *
 * @author jiankang.xu
 * @date 2021/8/26
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }


    public synchronized static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }


}
