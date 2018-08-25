package com.mh.binarytree;

import java.io.Serializable;

/**
 * 二叉树节点
 * Created by mh7649 on 2018/8/25
 */
public class BinaryNode<T extends Comparable> implements Serializable {

    public BinaryNode<T> left;

    public BinaryNode<T> right;

    public T data;

    public BinaryNode(T data, BinaryNode<T> left, BinaryNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public BinaryNode(T data) {
        this(data, null, null);
    }

    /**
     * 判断是否为叶子节点
     * @return
     */
    public boolean isLeaf() {
        return left == null && right == null;
    }
}
