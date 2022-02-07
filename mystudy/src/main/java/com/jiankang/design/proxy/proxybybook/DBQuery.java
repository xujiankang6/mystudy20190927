package com.jiankang.design.proxy.proxybybook;

public class DBQuery implements IDBQuery {


    public DBQuery() {

    }

    @Override
    public String request() {
        return "request string";
    }
}
