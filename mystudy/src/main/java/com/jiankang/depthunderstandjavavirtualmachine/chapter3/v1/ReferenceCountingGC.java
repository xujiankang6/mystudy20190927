package com.jiankang.depthunderstandjavavirtualmachine.chapter3.v1;

/*
 *@create by jiankang
 *@date 2020/11/22 @time 12:56
 */

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/22   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class ReferenceCountingGC {
    public Object instance = null;
    private static final int _1MB = 1024 * 1024;

    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA = null;
        objB = null;
        System.gc();
    }
}
