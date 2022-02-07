package com.jiankang.datastructure.v2;

/**
 * 一棵空树，或者是具有下列性质的二叉树：
 * （1）若左子树不空，则左子树上所有结点的值均小于它的根结点的值；
 * （2）若右子树不空，则右子树上所有结点的值均大于它的根结点的值；
 * （3）左、右子树也分别为二叉排序树；
 * （4）没有键值相等的结点
 */
public class BinarySortTree {
    private Node root;


    /**
     * 添加节点
     *
     * @param node
     */
    public void addNode(Node node) {
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    /**
     * 前序排列
     */
    public void beforeSort() {
        if (root == null) {
            return;
        }
        root.beforeSort();
    }

    /**
     * 中序排列
     */
    public void middleSort() {
        if (root == null) {
            return;
        }
        root.middleSort();

    }

    /**
     * 查找节点
     */
    public Node search(int value) {
        if (root == null) {
            return null;
        }
        return root.search(value);
    }

    /**
     * 查找父节点
     */
    public Node searchParent(int value) {
        if (root == null) {
            return null;
        }
        return root.searchParent(value);
    }

    /**
     * 删除某个节点
     */
    public void delete(int value) {
        if (root == null) {
            return;
        }
        root.delete(value);
    }

}
