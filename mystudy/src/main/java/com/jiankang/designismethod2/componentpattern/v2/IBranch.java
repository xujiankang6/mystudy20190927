package com.jiankang.designismethod2.componentpattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/22 time 15:18
 */

import java.util.ArrayList;

public interface IBranch extends ICorp {
    public void addSubordinate(ICorp corp);

    public ArrayList<ICorp> getSubordinate();
}
