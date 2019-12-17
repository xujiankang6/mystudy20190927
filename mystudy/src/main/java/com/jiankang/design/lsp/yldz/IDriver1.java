package com.jiankang.design.lsp.yldz;

/*
 *@create by jiankang
 *@date 2019/10/31 time 19:48
 */
/*
set方法传递依赖对象
 */
public interface IDriver1 {
    void setCar(ICar car);
    void driver();
}
