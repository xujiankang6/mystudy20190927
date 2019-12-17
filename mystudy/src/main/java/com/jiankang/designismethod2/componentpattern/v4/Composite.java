package com.jiankang.designismethod2.componentpattern.v4;

/*
 *@create by jiankang
 *@date 2019/11/22 time 16:44
 * 组合模式一般用在关系数据库中存储的树形结构。
 */

import java.util.ArrayList;

public class Composite extends Component {
    //构件容器
    private ArrayList<Component> componentArrayList = new ArrayList<Component>();
    //增加一个
    public void add(Component component){
        this.componentArrayList.add(component);
    }

    //删除一个
    public void remove(Component component){
        this.componentArrayList.remove(component);
    }

    //获得分支下的所有叶子构件和树枝构件
    public ArrayList<Component> getChildren(){
        return this.componentArrayList;
    }
}
