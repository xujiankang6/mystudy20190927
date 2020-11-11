package com.jiankang.improvejava151suggests.chapter5.v5;

/*
 *@create by jiankang
 *@date 2020/11/11 @time 17:30
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
public class Client3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        List<String> subList = list.subList(0, 2);
        list.add("D");
        System.out.println(list.size());
        System.out.println(subList.size());


        //设置列表为只读状态，防止视图检查size报错
        // 生成子列表之后，保持原始列表的只读状态，防止这种情况
        list = Collections.unmodifiableList(list);

    }
}
