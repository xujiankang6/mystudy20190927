package com.jiankang.designismethod2.resposibilitychainmethod.V2;

/*
 *@create by jiankang
 *@date 2019/11/20 time 9:51
 */

public class Father extends Handler {


    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}
