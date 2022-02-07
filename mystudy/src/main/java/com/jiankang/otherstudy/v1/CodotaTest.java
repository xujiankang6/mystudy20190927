package com.jiankang.otherstudy.v1;

import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 通过 codota 来搜索（建议在 IDEA 安装插件，使用更方便）看常见类库的常见函数的用法，
 * 甚至可以看到某些函数的使用概率
 */
public class CodotaTest {
    public static void main(String[] args) {
        Collectors.toList();
        Collections.emptyList();

        Object o1 = Optional.ofNullable(1).get();
        System.out.println(o1);
        boolean b = Objects.nonNull(3);
        Object o = Objects.requireNonNull(null,"不能为空");


    }
}
