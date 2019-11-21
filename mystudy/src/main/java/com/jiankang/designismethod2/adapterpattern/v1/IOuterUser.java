package com.jiankang.designismethod2.adapterpattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/21 time 16:43
 */

import java.util.Map;

public interface IOuterUser {
    //基本信息，比如姓名，性别，手机号码等
    public Map getUserBaseInfo();

    //工作区域信息
    public Map getUserOfficeInfo();

    //用户的家庭信息
    public Map getUserHomeInfo();

}
