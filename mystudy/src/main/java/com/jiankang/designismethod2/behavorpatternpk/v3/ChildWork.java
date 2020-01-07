package com.jiankang.designismethod2.behavorpatternpk.v3;

/*
 *@create by jiankang
 *@date 2020/1/6 time 20:03
 */

import java.nio.file.Watchable;

public class ChildWork extends WorkAlgorithm
{
    @Override
    public void work() {
        System.out.println("孩子的工作是玩耍");
    }
}
