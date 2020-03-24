package com.jiankang.datastructure.v2;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 10, 12, 5, 1, 9};
        BinarySortTree tree = new BinarySortTree();
        for (int i : arr) {
            //添加节点
            tree.addNode(new Node(i));
        }
        //遍历
        tree.middleSort();
        //查找某个节点
        Node search = tree.search(9);
        //删除某个节点
        tree.delete(3);
    }
}
