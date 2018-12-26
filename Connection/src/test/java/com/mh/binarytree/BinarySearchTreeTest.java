package com.mh.binarytree;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {

    private BinarySearchTree<String> binarySearchTree;

    @Before
    public void setUp() throws Exception {
        binarySearchTree = new BinarySearchTree<String>();
    }

    @Test
    public void testIsEmpty() {
    }

    @Test
    public void testSize() {
    }

    @Test
    public void testHeight() {
    }

    @Test
    public void testPreOrder() {
    }

    @Test
    public void testInOrder() {
    }

    @Test
    public void testPostOrder() {
    }

    @Test
    public void testInsert() {
        binarySearchTree.insert("5");
        binarySearchTree.insert("1");
        binarySearchTree.insert("2");
        binarySearchTree.insert("3");
        binarySearchTree.insert("4");
        binarySearchTree.insert("6");
        binarySearchTree.insert("7");
        binarySearchTree.insert("8");
    }

    @Test
    public void testRemove() {
        testInsert();
        binarySearchTree.remove("8");
        binarySearchTree.remove("1");
        System.out.println(binarySearchTree);
    }

    @Test
    public void testFindMax() {
    }

    @Test
    public void testFindMin() {
    }

    @Test
    public void testContains() {
    }

    @Test
    public void testFindNode() {
    }

    @Test
    public void testClear() {
    }
}