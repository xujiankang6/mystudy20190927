package com.jiankang.improvejava151suggests.chapter5.v5;

/*
 *@create by jiankang
 *@date 2020/11/11 @time 17:15
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/11   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */
public class Client2 {
    public static void main(String[] args) {
        //初始化一个固定长度，不可变列表
        List<Integer> initData = Collections.nCopies(100, 0);
         ArrayList<Integer> integers = new ArrayList<>(initData);

         //一行解决删除原始集合的部分元素
        integers.subList(20,30).clear();

    }
}
