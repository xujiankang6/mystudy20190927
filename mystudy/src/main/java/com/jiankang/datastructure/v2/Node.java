package com.jiankang.datastructure.v2;

/**
 * 一棵空树，或者是具有下列性质的二叉树：
 * （1）若左子树不空，则左子树上所有结点的值均小于它的根结点的值；
 * （2）若右子树不空，则右子树上所有结点的值均大于它的根结点的值；
 * （3）左、右子树也分别为二叉排序树；
 * （4）没有键值相等的结点
 */

public class Node {
    private Node leftNode;
    private Node rightNode;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    /**
     * 添加节点
     *
     * @param node
     */
    public void add(Node node) {
        if (node == null) {
            return;
        }
        if (this.value > node.value) {
            if (this.leftNode == null) {
                this.leftNode = node;
            } else {
                this.leftNode.add(node);
            }
        } else {
            if (this.rightNode == null) {
                this.rightNode = node;
            } else {
                this.rightNode.add(node);
            }
        }
    }

    /**
     * 前序排列,根据根节点的前后命名的
     */
    public void beforeSort() {
        System.out.println(this.value);
        if (this.leftNode != null) {
            this.leftNode.beforeSort();
        }
        if (this.rightNode != null) {
            this.rightNode.beforeSort();
        }
    }

    /**
     * 中序遍历
     */
    public void middleSort() {
        if (this.leftNode != null) {
            this.leftNode.middleSort();
        }
        System.out.println(this.value);
        if (this.rightNode != null) {
            this.rightNode.middleSort();
        }
    }

    public Node search(int value) {
        if (this.value == value) {
            return this;
        } else if (this.value > value) {
            if (this.leftNode != null) {
                return leftNode.search(value);
            }
        } else if (this.value < value) {
            if (this.rightNode != null) {
                return this.rightNode.search(value);
            }
        }
        return null;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }


    public void delete(int value) {
        //查找待删除节点
        Node target = search(value);
        if (target != null) {
            //在查找的同时需要记录一下待删除节点的父亲
            Node parent = searchParent(value);
            //2.如果待删除节点的左右节点都不存在，那么直接删除。
            if (target.leftNode == null && target.rightNode == null) {
                if (parent.leftNode != null && parent.leftNode.value == value) {
                    parent.leftNode = null;
                } else {
                    parent.rightNode = null;
                }
            //3、待删除的左右节点都存在情况
            } else if (target.rightNode != null && target.leftNode != null) {
                //此处删除后继节点，注意前驱和后继节点是中序排列后的该删除节点的前一个或者后一个节点。
                int min = deleteMinNode(target.rightNode);
                target.value = min;
                //待删除节点左子树存在右子树不存在,直接将其子树中存在的一边候补上来即可
            } else {
                if (target.rightNode != null) {
                    if (parent.leftNode != null && parent.leftNode.value == value) {
                        parent.leftNode = target.rightNode;
                    } else {
                        parent.rightNode = target.rightNode;
                    }
                } else {
                    if (parent.leftNode != null && parent.leftNode.value == value) {
                        parent.leftNode = target.leftNode;
                    } else {
                        parent.rightNode = target.leftNode;
                    }
                }
            }
        }
    }

    private int deleteMinNode(Node node) {
        Node target = node;
        while (target.leftNode != null) {
            target = target.leftNode;
        }
        //删除该节点
        delete(target.value);
        return target.value;
    }

    //查找该节点的父节点,如果是根节点以及不存在值将会返回null
    public Node searchParent(int value) {
        //如果该Node左节点或者右节点匹配参数值，返回当前节点
        if ((this.leftNode != null && this.leftNode.value == value) || (this.rightNode != null && this.rightNode.value == value)) {
            return this;
        } else {
            //该节点的值大于参数值，去左边找
            if (this.value > value && this.leftNode != null) {
                return leftNode.searchParent(value);
            } else if (this.value < value && this.rightNode != null) {
                return rightNode.searchParent(value);
            }
        }
        return null;
    }
}
