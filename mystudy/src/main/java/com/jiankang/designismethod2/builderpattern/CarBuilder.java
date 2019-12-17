package com.jiankang.designismethod2.builderpattern;

/*
 *@create by jiankang
 *@date 2019/11/11 time 14:57
 */

import java.util.ArrayList;

public abstract class CarBuilder {
    //组装顺序
    public abstract void setSequence(ArrayList<String> sequence);

    //设置完毕顺序后，就可以直接拿到这个车辆模型
    public abstract CarModel getCarModel();
}
