package com.jiankang.design.proxy.proxybybook;

public class DBQueryProxy implements IDBQuery {

    private DBQuery real = null;

    @Override
    public String request() {
        //只有在真正需要的时候才创建真实对象，可以时间很慢
        if(real==null){
            real = new DBQuery();
        }
        return real.request();
    }
}
