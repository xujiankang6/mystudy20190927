package com.jiankang.designismethod2.componentpattern.v4;

/*
 *@create by jiankang
 *@date 2019/11/22 time 16:57
 */

public class Client {
    public static void main(String[] args) {
        //创建一个跟节点
        Composite root = new Composite();
        root.doSomething();
        //创建一个树枝节点
        Composite branch = new Composite();
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);

    }

    public static void display(Composite root){
        for (Component leaf:root.getChildren()) {
            if(leaf instanceof Leaf){
                leaf.doSomething();
            }else {
                display((Composite) leaf);
            }
        }
    }
}
