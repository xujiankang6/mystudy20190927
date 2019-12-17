package com.jiankang.designismethod2.iteratorpattern;

/*
 *@create by jiankang
 *@date 2019/11/21 time 18:54
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Boss {
    public static void main(String[] args) {

        ArrayList<IProject> projectList = new ArrayList<IProject>();

        projectList.add(new Project("星球大战项目", 10, 100000));

        projectList.add(new Project("扭转时空项目", 100, 10000000));

        projectList.add(new Project("超人改造项目", 10000, 1000000000));

        for (int i = 4; i < 104; i++) {
            projectList.add(new Project("第" + i + "个项目", i * 5, i * 1000000));
        }

        for (IProject project : projectList) {
            System.out.println(project.getProjectInfo());
        }


    }
}
