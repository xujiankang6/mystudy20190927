package com.jiankang.javaconcurrencybeauty.chapter2.v1;

/*
 *@create by jiankang
 *@date 2020/10/19 time 11:20
 */


import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class TestUnSafe {
    static Unsafe unsafe;
    static long stateOffset;
    private volatile long state = 0;

    static {
        try {
            final Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            unsafe = (Unsafe) field.get(null);
            stateOffset = unsafe.objectFieldOffset(TestUnSafe.class.getDeclaredField("state"));
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestUnSafe test = new TestUnSafe();
        boolean success = unsafe.compareAndSwapInt(test, stateOffset, 0, 1);
        System.out.println(success);
    }
}
