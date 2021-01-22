package com.jiankang.improvejava151suggests.chapter5.v8;

/*
 *@create by jiankang
 *@date 2020/11/13 @time 13:34
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/13   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class Test2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        final Runtime rt = Runtime.getRuntime();
        rt.addShutdownHook(new Thread() {
            @Override
            public void run() {
                StringBuffer sb = new StringBuffer();
                long heapMaxSize = rt.maxMemory() >> 20;
                sb.append("最大可用内存 ： " + heapMaxSize + "M\n");
                long total = rt.totalMemory() >> 20;
                sb.append("对内存大小： " + total + "M\n");
                long free = rt.freeMemory() >> 20;
                sb.append("空闲内存：" + free + "M");
                System.out.println(sb);
            }
        });
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 393217; i++) {
//            map.put("key " + i, "value" + i);
            list.add("key" + i);
            list.add("value" + i);
        }

    }
}
