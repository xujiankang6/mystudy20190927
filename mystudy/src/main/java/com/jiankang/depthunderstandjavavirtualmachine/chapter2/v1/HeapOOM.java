package com.jiankang.depthunderstandjavavirtualmachine.chapter2.v1;

/*
 *@create by jiankang
 *@date 2020/11/21 @time 15:38
 */

import java.util.ArrayList;

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/21   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class HeapOOM {
    static class OOMObject {

    }

    public static void main(String[] args) {
        ArrayList<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
