package com.jiankang.improvejava151suggests.chapter2.v3;

/*
 *@create by jiankang
 *@date 2020/11/13 @time 16:10
 */

import java.util.ArrayList;
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


public class Client {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        List l2 = new ArrayList() {
        };
        List l3 = new ArrayList() {{
        }};
        System.out.println(l1.getClass() == l2.getClass());
        System.out.println(l2.getClass() == l3.getClass());
        System.out.println(l1.getClass() == l3.getClass());

    }

//    l2类似于下面类
class Sub2 extends ArrayList{

}
    //    l3类似于下面类
    class Sub3 extends ArrayList{
        //有构造代码块
        {

        }
    }
}
