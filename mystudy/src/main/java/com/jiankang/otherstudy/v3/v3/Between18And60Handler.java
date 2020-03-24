package com.jiankang.otherstudy.v3.v3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Between18And60Handler
 *
 * @author jiankang.xu
 * @date 2020/3/14
 */
public class Between18And60Handler extends AbstractAgeHandler {
    // 存储策略
    private static final Map<String, Runnable> NAME_STRATEGY_MAP = new HashMap<>();

    static {
        NAME_STRATEGY_MAP.put("张三", () -> {
            System.out.println("18到60岁 张三");
        });

        NAME_STRATEGY_MAP.put("李四", () -> {
            System.out.println("18到60岁 李四");
        });
    }

    @Override
    protected void dohandle(User user) {

        // 处理18 到60岁的代码逻辑

        // 处理性别部分
        Runnable runnable = NAME_STRATEGY_MAP.get(user.getName());
        if (runnable != null) {
            runnable.run();
        } else {
            System.out.println("18到60岁 其他");
        }

    }

    @Override
    public Predicate<Short> getCondition() {
        return (age) -> age >= 18 && age <= 60;
    }
}
