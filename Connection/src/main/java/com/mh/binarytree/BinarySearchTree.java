package com.mh.binarytree;

/**
 * Created by mh7649 on 2018/8/25
 */
public class BinarySearchTree<T extends Comparable> implements Tree<T> {

    protected BinaryNode<T> root;

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return 0;
    }

    public int height() {
        return 0;
    }

    public String preOrder() {
        return null;
    }

    public String inOrder() {
        return null;
    }

    public String postOrder() {
        return null;
    }

    public void insert(T data) {

    }

    public void remove(T data) {

    }

    public T findMax() {
        return null;
    }

    public T findMin() {
        return null;
    }

    public boolean contains(T data) throws Exception {
        return false;
    }

    public BinaryNode<T> findNode(T data) {
        return null;
    }

    public void clear() {

    }
}
