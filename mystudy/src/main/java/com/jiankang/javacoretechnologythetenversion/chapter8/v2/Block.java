package com.jiankang.javacoretechnologythetenversion.chapter8.v2;

/*
 *@create by jiankang
 *@date 2020/6/17 time 18:55
 */

public abstract class Block {
    public abstract void body() throws Exception;


    public Thread toThread() {
        return new Thread() {
            @Override
            public void run() {
                try {
                    body();
                } catch (Throwable t) {
//                    Block.<RuntimeException>throwAs(t);
                }
            }
        };
    }

    @SuppressWarnings("unchecked")
    public static <T extends Throwable> void throwAs(Throwable e) throws T {
        throw (T) e;
    }
}
