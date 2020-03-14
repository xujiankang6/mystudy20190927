package com.jiankang.otherstudy.v3.v3;

import java.util.function.Predicate;

/**
 * MoreThan60Handler
 *
 * @author jiankang.xu
 * @date 2020/3/14
 */
public class MoreThan60Handler extends AbstractAgeHandler {
    @Override
    protected void dohandle(User user) {
        System.out.println("没有分支逻辑，支持处理");
    }

    @Override
    public Predicate<Short> getCondition() {
        return (age) -> age >= 60;
    }
}
