package com.jiankang.designismethod2.flyweightpattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/24 time 19:50
 */

public abstract class Flyweight {
    //内部状态
    private String intrinsic;
    protected final String Extrinsic;

    public Flyweight(String extrinsic) {
        this.Extrinsic = extrinsic;
    }

    //定义业务操作
    public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

    public String getExtrinsic() {
        return Extrinsic;
    }
}
