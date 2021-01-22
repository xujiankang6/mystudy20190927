package com.jiankang.improvejava151suggests.chapter5.v8;

/*
 *@create by jiankang
 *@date 2020/11/13 @time 13:29
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/13   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class Test {
    public static void main(String[] args) {
        int tagCloudNum = 10;
        List<String> tagClouds = new ArrayList<String>(tagCloudNum);
        Collections.shuffle(tagClouds);
    }
}
