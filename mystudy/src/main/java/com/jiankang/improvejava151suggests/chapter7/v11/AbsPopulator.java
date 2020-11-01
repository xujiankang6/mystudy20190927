package com.jiankang.improvejava151suggests.chapter7.v11;

/*
 *@create by jiankang
 *@date 2020/11/1 time 16:14
 */

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class AbsPopulator {
    //模板方法
    public final void dataTinitialing() throws Exception {
        Method[] methods = getClass().getMethods();
        for (Method m : methods) {
            if (isInitDataMethod(m)) {
                m.invoke(this);
            }
        }
    }

    //判断是否是数据初始化方法，基本方法鉴别器
    private boolean isInitDataMethod(Method m) {
        return m.getName().startsWith("init") && Modifier.isPublic(m.getModifiers())
                && m.getReturnType().equals(Void.TYPE) && !m.isVarArgs()
                && !Modifier.isAbstract(m.getModifiers());
    }

}
