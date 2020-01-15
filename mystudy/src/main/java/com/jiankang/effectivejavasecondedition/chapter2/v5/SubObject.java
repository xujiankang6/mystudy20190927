package com.jiankang.effectivejavasecondedition.chapter2.v5;

/*
 *@create by jiankang
 *@date 2019/12/31 time 13:54
 */



public class SubObject extends Object {

    @Override
    protected void finalize() throws Throwable {
        try {
            //Finalize subClass state
        }finally {
            super.finalize();
        }
    }
}
