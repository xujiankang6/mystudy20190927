package com.jiankang.designismethod2.resposibilitychainmethod.V2;

/*
 *@create by jiankang
 *@date 2019/11/20 time 9:47
 */

public class Women implements IWomen {

    /*
     * 通过一个int类型的参数来描述妇女的个人状况
     * 1--未出嫁
     * 2--出嫁
     * 3--夫死
     */
    private int type = 0;

    //妇女的请示
    private String request = "";

    //构造函数传递过来请求
    public Women(int type, String request) {
        this.type = type;
        switch (this.type) {
            case 1:
                this.request = "女儿的请求是：" + request;
            case 2:
                this.request = "妻子的请求是：" + request;
            case 3:
                this.request = "母亲的请求是：" + request;
        }
    }

    //获得自己的状况
    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
