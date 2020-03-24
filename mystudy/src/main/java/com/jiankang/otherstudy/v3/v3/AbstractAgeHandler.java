package com.jiankang.otherstudy.v3.v3;

import java.util.function.Predicate;

/**
 * AbstractAgeHandler
 *
 * @author jiankang.xu
 * @date 2020/3/14
 */
public abstract class AbstractAgeHandler {
    //下一个处理器
    protected AbstractAgeHandler nextAgeHandler;


    //设置下一个处理器
    public void setNextAgeHandler(AbstractAgeHandler nextAgeHandler) {
        this.nextAgeHandler = nextAgeHandler;
    }

    public void handle(User user) {
        if (getCondition().test(user.getAge())) {
            dohandle(user);
        }
        if (nextAgeHandler != null) {
            nextAgeHandler.handle(user);
        }
    }

    //实际处理函数
    protected abstract void dohandle(User user);


    //获取查询条件
    public abstract Predicate<Short> getCondition();

}
