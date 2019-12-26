package com.jiankang.designismethod2.flyweightpattern.v1;

/*
 *@create by jiankang
 *@date 2019/12/24 time 17:20
 */

import java.util.HashMap;

public class SignInfoFactory {

    //池容器
    private static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();

    //报名信息的对象工厂
    @Deprecated
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }

    //从池中获得对象
    public static SignInfo getSignInfo(String key) {
        //设置返回对象
        SignInfo result = null;
        //池中没有该对象
        if (!pool.containsKey(key)) {
            System.out.println(key + "-------建立对象，并放到池子中");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            result = pool.get(key);
            System.out.println(key + "---直接从池子里获得");
        }
        return result;
    }
}
