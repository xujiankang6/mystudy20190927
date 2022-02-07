package com.jiankang.otherstudy.v3.v3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/**
 * LessThan18Handler
 *
 * @author jiankang.xu
 * @date 2020/3/14
 */
public class LessThan18Handler extends AbstractAgeHandler {

    // 存储策略
    private static final Map<Boolean, Runnable> SEX_STRATEGY_MAP = new HashMap<>();

    static {
        SEX_STRATEGY_MAP.put(Boolean.TRUE, () -> {
            System.out.println("小于18岁，男性");
        });

        SEX_STRATEGY_MAP.put(Boolean.FALSE, () -> {
            System.out.println("小于18岁，女性");
        });

    }

    @Override
    protected void dohandle(User user) {
        // 处理小于18岁的代码逻辑
        System.out.println("处理小于18岁的代码逻辑");

        // 处理性别部分
        SEX_STRATEGY_MAP.get(user.getMale()).run();

    }

    @Override
    public Predicate<Short> getCondition() {
        return (age) -> age < 18;
    }
}
