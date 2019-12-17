package com.jiankang.designismethod2.iteratorpattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/22 time 9:53
 */

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator {
    //所有的项目都放在ArrayList中
    private ArrayList<IProject> projectList = new ArrayList<IProject>();
    private int currentItem = 0;

    public ProjectIterator(ArrayList<IProject> projectList) {
        this.projectList = projectList;
    }

    public boolean hasNext() {
        //定义一个返回值
        boolean b = true;
        if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == null) {
            b = false;
        }
        return b;
    }


    public IProject next() {
        return (IProject) this.projectList.get(this.currentItem++);
    }

    //删除一个对象
    public void remove() {
        //暂时没有使用到
    }
}
